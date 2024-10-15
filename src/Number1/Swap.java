package Number1;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The first number");
        int num1= scanner.nextInt();
        System.out.println("Enter The second number");
        int num2= scanner.nextInt();
        int swa;
        swa = num1;
        num1 = num2;
        num2= swa;

        System.out.println("The first number is " + num1);
        System.out.println("The second number is " + num2);



    }
}
