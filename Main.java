import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       String name = "Gulzar";
       String result= "";

       for (int i= name.length()-1; i>=0; i--){

         result += name.charAt(i);
       }
        System.out.println(result);

    }
}