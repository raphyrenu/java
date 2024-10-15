package Number1;

import java.util.Scanner;

public class Time {

    public static class Factorial {


        public int find(int num) {
            int i;
            int factorial = 1;
            for (i = 1; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }

        public static void main(String[] args) {
            System.out.println("Enter your number: ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();

            Factorial Fa = new Factorial();
            int factorial = Fa.find(num);

            System.out.println("The factotial of " + num + " is : " +factorial);


        }
    }
}
