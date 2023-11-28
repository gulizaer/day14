import java.util.Scanner;

public class returnNumber {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();

        int result= 1;

        for (int i = number; i>=1; i--){
            result *= i;
        }

        System.out.println(result);



        /*
        Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

         */
    }
}
