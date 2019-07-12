public class Bob {
    public String hey(String s) {
        s = s.trim();
        boolean character=s.chars().anyMatch(Character::isAlphabetic);
        if (s.isEmpty()) {
            return "Fine. Be that way!";
        }
        if (s.equals(s.toUpperCase()) && character) {
            if (s.endsWith("?")){
                return "Calm down, I know what I'm doing!";
            }
            return "Whoa, chill out!";
        }

        if(s.endsWith("?")) {
            return "Sure.";

        }

        return "Whatever.";
    }

}

