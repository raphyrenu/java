package Number1;

import java.util.Scanner;
public class Day {
    public static void main(String[] args) {
        System.out.println("Enter Day num to get name : ");
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("Its monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;

            case 6:
                System.out.println("Its Saturday");
                break;


            case 7:
                System.out.println("Its Sunday");
                break;




            default:
                System.out.println("No Day");
                break;

        }
    }
}
