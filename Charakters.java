public class Charakters {
    public static void main(String[] args) {

        String kelime = "ABCD123#$@!";

        String digits= "";
        String letters= "";
        String specialChars= "";

        for (int i =0; i<kelime.length(); i++){
            char karakter =kelime.charAt(i);

            if (karakter>='0' && karakter<='9'){
                digits+=karakter;

            } else if (karakter>='A' && karakter<='Z') {
                letters+=karakter;

            } else if (karakter>='a' && karakter<='z') {
                letters+=karakter;

            }else {
                if (karakter!=' '){
                    specialChars+=karakter;
                }
            }

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChar = " + specialChars);

        /*
         write a program that can retrive the digits,
         letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!

         */
    }
}
