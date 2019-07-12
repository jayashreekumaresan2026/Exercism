class LuhnValidator {
    boolean isValid(String candidate) {
            if (candidate.split("[^\\d\\s]").length > 1) return false;
            char[] digits = candidate.replaceAll(" ", "").toCharArray();
            if (digits.length < 2) return false;
            int sum = 0;
            for (int i = 0; i < digits.length; i++) {
                int digit = Character.getNumericValue(digits[digits.length -1 -i]);
                if (i%2 == 1) {
                    sum += doubleDigit(digit);
                } else {
                    sum += digit;
                }
            }

            return sum % 10 == 0;
        }

        int doubleDigit(int digitToDouble) {
            int retval = digitToDouble;
            retval *= 2;
            if (retval > 9) {
                retval -= 9;
            }
            return retval;
        }

    }
