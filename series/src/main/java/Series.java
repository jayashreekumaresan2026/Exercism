import java.util.ArrayList;
import java.util.List;
class Series {
        String input = "";
        List<String> numberList=new ArrayList<>();

        Series(String input) {
            this.input = input;
        }

        List<String> slices(int sliceRange) {
            if (sliceRange> input.length() && sliceRange > 0) {
                throw new IllegalArgumentException("Slice size is too big.");
            } else if (sliceRange <= -1 || sliceRange==0) {
                throw new IllegalArgumentException("Slice size is too small.");
            }

            char[] charArray=input.toCharArray();

            for (int i = 0; i+sliceRange <=charArray.length; i++) {
                String result="";
                for (int j = 0; j < sliceRange; j++) {
                    result +=charArray[i+j];
                }
                numberList.add(result);
            }
          return numberList;
        }
    }
