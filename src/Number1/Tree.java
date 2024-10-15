package Number1;

import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the tree");
        int l= scanner.nextInt();

        for (int i=1; i<=l;i++){
            for (int j=1; j<=l;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }

    public static class Natural {
        public static void main(String[] args) {
            int i=1;
            int sum=0;
            while (i<=10){
                sum+=i;
                i++;

            }
            System.out.println(sum);
        }
    }
}
