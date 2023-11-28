import java.util.Scanner;

public class withNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        while (!(age > 1 && age<=150 )) {   // yas 1 den buyuk ve 150 den kucuk yada esit degilsse
            System.err.println("Invalid Entry, Please re-enter your age:");
            age=input.nextInt();  // invalid alan  yastan sonra bir kere daha yas yazma sekmesi acil
        }

        /*
        Write a method which prints out the numbers from 1 to 100  but for numbers which are a multiple of both 3 and 5,
         print "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of
         the number and for numbers which are a multiple of 5, print "RA" instead of the number.

    ex:
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
         */


        System.out.println("Are you a US citizen? Yes/No");
        String yesOrno = input.next().toLowerCase();

        while (!(yesOrno.equals("yes") || yesOrno.equals("no"))){
            System.err.println("Invalid Etry! Please re-enter");
            System.err.println("Are you a US citizen? Yes/No");
            yesOrno = input.next().toLowerCase();
        }



        if (age>=21 && yesOrno.equals("yes")){
            System.out.println("You are eligible to vote");

        }else{
            System.out.println("You are not eligible to vote");
        }
        input.close();

        System.out.println("----------------------------------------------------");






    }
}
