import java.util.Scanner;


public class Java01 {


    public static void main(String[] args) {


        System.out.println("Percentage calculator of 5 subjects out of 100 marks");

        System.out.println("Enter your marks in 1st subject: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter your marks in 2st subject: ");
        int b = sc.nextInt();

        System.out.println("Enter your marks in 3st subject: ");
        int c = sc.nextInt();

        System.out.println("Enter your marks in 4st subject: ");
        int d = sc.nextInt();

        System.out.println("Enter your marks in 5st subject: ");
        int e = sc.nextInt();

        float per = ((a + b + c + d + e)/500f)*100;

        System.out.print("Your total percent is: "+ per + "%" );

    }
}
