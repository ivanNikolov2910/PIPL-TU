package lectures.test_example_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RegexDB {
    public static List<Regex> regexes = Collections.synchronizedList(new ArrayList<>());

    public synchronized static List<Regex> getList(){
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("regexes.bin"))){
            regexes =  (List<Regex>) input.readObject();
            return regexes;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public synchronized static void putRegexToList(Regex regex){
        for (Regex r : regexes) {
            if (r.getPattern().equals(regex.getPattern())){
                break;
            }
        }
        regexes.add(regex);
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("regexes.bin"))){
            output.writeObject(regexes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized static void updateRegexList(Regex regex) {
        for (Regex r : regexes) {
            if (r.getId() == regex.getId()){
                r.setRating(regex.getRating());
                break;
            }
        }
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("regexes.bin"))){
            output.writeObject(regexes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
