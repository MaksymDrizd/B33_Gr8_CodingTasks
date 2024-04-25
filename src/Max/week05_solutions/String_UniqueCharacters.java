package Max.week05_solutions;

public class String_UniqueCharacters {

    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */
    public static void main(String[] args) {
        String original = "AAABBBCCCDEF";
        System.out.println("uniqueChar(original) = " + uniqueChar(original));
    }
    public static String uniqueChar(String original){
        String result = "";
        for (int i = 0; i < original.length(); i++) {
            int count = 0;
            for (int j = 0; j < original.length(); j++) {
                if (original.charAt(i) == original.charAt(j)){
                    count++;
                }
            }
            if (count == 1){
                result+=original.charAt(i);
            }
        }
        return result;

    }




}
