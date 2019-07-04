class RnaTranscription {
    String transcribe(String dnaStrand) {
        String result = "";
        if (dnaStrand.length() == 0) {
            result = "";
        } else if (dnaStrand.length() == 1) {
            char c = dnaStrand.charAt(0);
            result = checkCharacter(c);
        } else if (dnaStrand.length() > 2) {
            result = splitTheString(dnaStrand);
        }
        return result;
    }

    private String splitTheString(String dnaStrand) {
        String result = "";
        char[] array = dnaStrand.toCharArray();
        for (int i = 0; i < array.length; i++) {
            result += checkCharacter(array[i]);
        }
        return result;
    }

    String checkCharacter(char dnaStrand) {
        String result = "";
        switch (dnaStrand) {
            case 'G':
                result = "C";
                break;
            case 'C':
                result = "G";
                break;
            case 'A':
                result = "U";
                break;
            case 'T':
            case 'U':
                result = "A";
                break;
        }
        return result;
    }
}

