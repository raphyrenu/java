package Number1;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        boolean yes = true;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your First number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter your Second number: ");
            int num2 = scanner.nextInt();



            int sum = num1 + num2;
            System.out.println(sum);


            System.out.println("you want another operation 1/2 :");
             int destion = scanner.nextInt();
            if(destion==1){
                yes=false;
            }

        }

        while (yes);
    }

}
