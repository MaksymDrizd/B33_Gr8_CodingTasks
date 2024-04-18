package Samira.week4;

public class String_RemoveDuplicates {

    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
    */
        public static void main(String[] args) {
            String str = "AAABBBCCC";
            String result="";

            for (int i = 0; i < str.length(); i++) {
                String ch =""+str.charAt(i);
                if (result.contains(ch)) {
                    continue;
                }
                result +=ch;
            }
            System.out.println(result);
        }

    }