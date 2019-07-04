
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Anagram {
    String word;

    Anagram(String word) {
        this.word = word;
    }

    List<String> match(List<String> stringList) {
        List<String> strings = new ArrayList<>();
        char[] charArray = word.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        for (String s : stringList) {
            String temp = s;
            char[] array = s.toLowerCase().toCharArray();
            Arrays.sort(array);
            if (Arrays.equals(array, charArray)&& !(word.equalsIgnoreCase(temp))) {

                strings.add(temp);
            }
        }
        return strings;
    }
}

