class IsogramChecker {
    boolean isIsogram(String phrase) {
            int count = 0;
            String lowerCase = phrase.toLowerCase();
            String words = lowerCase.replaceAll("[-\\s]", "");
            char[] charArray = words.toCharArray();
            if (charArray.length > 0) {
                for (int i = 0; i < charArray.length; i++) {
                    for (int j = i + 1; j < charArray.length; j++)
                        if (charArray[i] == charArray[j]) {
                            count += 1;
                        }
                }

            } else {
                return true;
            }
            if (count == 0) {
                return true;
            } else {
                return false;
            }

        }
    }
