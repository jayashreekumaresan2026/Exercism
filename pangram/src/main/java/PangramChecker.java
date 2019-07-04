public class PangramChecker {

    public boolean isPangram(String input) {
            String inputs = input.replace("[\"-\\s]", "");
            String charArray = inputs.toLowerCase();
            if (charArray.length() < 26)
                return false;
            else {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    if (charArray.indexOf(ch) < 0) {
                        return false;
                    }
                }
            }
            return true;
    }

}
