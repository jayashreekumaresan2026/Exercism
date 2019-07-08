import java.util.HashMap;

class RnaTranscription {
    HashMap<String, String> map = new HashMap<>();

    {
        map.put("G", "C");
        map.put("C", "G");
        map.put("T", "A");
        map.put("A", "U");
    }

    String transcribe(String dnaStrand) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] array = dnaStrand.toCharArray();
            for (int i = 0; i < array.length; i++) {
                stringBuilder.append(map.get(String.valueOf(array[i])));
            }
            return stringBuilder.toString();
        }
}

