class Proverb {
    String[] words;
    String proverb;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(words.length);
        if (words.length == 0) {
            proverb = "";
        } else {
            for (int i = 1; i < words.length; i++) {
                proverb = String.format("For want of a %s the %s was lost.\n", words[i - 1], words[i]);
                stringBuilder.append(proverb);
            }
            proverb = String.format("And all for the want of a %s.", words[0]);
            stringBuilder.append(proverb);

        }
        return stringBuilder.toString();
    }

}
