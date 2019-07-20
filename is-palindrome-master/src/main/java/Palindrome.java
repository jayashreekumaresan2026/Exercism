public class Palindrome {
    public boolean check(String sentence){
        String IgnoreCase=sentence.toLowerCase();
        int start = 0;
        int end=sentence.length()-1;
        while (start <= end) {
            if(IgnoreCase.charAt(start)==IgnoreCase.charAt(end))
            {
                start++;
                end--;
            }
            else if(!(IgnoreCase.charAt(start)>='a'&& IgnoreCase.charAt(start)<='z')){
                start++;
            }
            else if(!(IgnoreCase.charAt(end)>='a'&& IgnoreCase.charAt(end)<='z')){
                end--;
            }
            else{
                return false;

            }
        }
        return true;
    }
}
