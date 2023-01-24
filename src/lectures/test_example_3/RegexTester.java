package lectures.test_example_3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RegexTester {
    public static List<Boolean> test(Regex regex, String[] strings){
        List<Boolean> results = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex.getPattern());
        for (String s : strings) {
            if (pattern.matcher(s).matches()){
                results.add(true);
            }else{
                results.add(false);
            }
        }
        return results;
    }
}
