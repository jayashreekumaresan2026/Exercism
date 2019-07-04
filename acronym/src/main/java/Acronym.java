class Acronym {
        String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String string = "";
        phrase = phrase.replaceAll("[-_]", " ");
        String[] words=phrase.split(" ");
        for (int i = 0; i < words.length; i++) {
            String letter = words[i];
            char[] newArray = letter.toCharArray();
            if (newArray.length != 0) {
                string += newArray[0];
            }
        }
        return string.toUpperCase();
    }

}
