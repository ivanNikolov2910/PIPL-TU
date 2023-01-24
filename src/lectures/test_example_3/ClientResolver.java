package lectures.test_example_3;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClientResolver implements Runnable {

    private final Socket client;

    public ClientResolver(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
             BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()))) {
            int option = Integer.parseInt(reader.readLine());
            switch (option) {
                case 1:
                    newRegexCommunication(reader, writer);
                    break;
                case 2:
                    searchForRegexCommunication(reader, writer);
                    break;
                default:
                    System.out.println("Incorrect option");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    private void searchForRegexCommunication(BufferedReader reader, BufferedWriter writer) throws IOException {
        String key = reader.readLine();
        List<Regex> regexes = RegexDB.getList();
        if (regexes != null) {
            List<Regex> filtered = regexes.stream()
                    .filter(regex -> regex.getPattern().contains(key))
                    .sorted(Comparator.comparing(Regex::getRating).reversed())
                    .toList();
            int clientId = Integer.parseInt(reader.readLine());
            Regex regex = null;
            for (Regex r : regexes) {
                if (r.getId() == clientId) {
                    regex = r;
                    break;
                }
            }
            if (regex != null) {
                List<String> strings = new ArrayList<>();
                String s;
                while (!(s = reader.readLine()).equals("")) {
                    strings.add(s);
                }
                List<Boolean> testList = RegexTester.test(regex, (String[]) strings.toArray());
                writer.write(testList.toString());

                String toChangeRating = reader.readLine();
                switch (toChangeRating) {
                    case "+":
                        regex.setRating(regex.getRating() + 1);
                        break;
                    case "-":
                        regex.setRating(regex.getRating() - 1);
                        break;
                    default:
                        break;
                }

                RegexDB.updateRegexList(regex);
            }


        } else {
            writer.write("No regexes found");
        }
    }

    private void newRegexCommunication(BufferedReader reader, BufferedWriter writer) throws IOException {
        Regex regex = new Regex(reader.readLine(), reader.readLine());
        List<String> strings = new ArrayList<>();
        String s;
        while (!(s = reader.readLine()).equals("")) {
            strings.add(s);
        }
        List<Boolean> testList = RegexTester.test(regex, (String[]) strings.toArray());
        writer.write(testList.toString());
        String addToFile = reader.readLine();
        if (addToFile.equals("y")) {
            RegexDB.putRegexToList(regex);
        }
    }
}
