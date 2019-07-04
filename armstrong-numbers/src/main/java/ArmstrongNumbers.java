class ArmstrongNumbers {
	boolean isArmstrongNumber(int numberToCheck) {
		int remainder, result = 0;
		int temp = numberToCheck;
		int length = String.valueOf(temp).length();
		while (numberToCheck > 0) {
			remainder = numberToCheck % 10;
			result += Math.pow(remainder ,length);
			numberToCheck = numberToCheck / 10;
		}
		if(result==temp)
		{
			return true;
		}
		else{
			return false;
		}
	}
}
