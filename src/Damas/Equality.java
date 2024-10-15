package Damas;

public class Equality {
    public static void main(String[] args) {
        String name1 = "Mary";
        String name2= "Mary";
        String name3 = name1;



        //reference
        if(name1 == name2){
            System.out.println("Equal");
        }
        else System.out.println("not equal");

        if(name1 == name3){
            System.out.println("Equal");
        }
        else System.out.println("not equal");

        //object equality
        if(name1.equals(name2)){
            System.out.println("Equal");
        }
        else System.out.println("not equal");

        if(name1.equals(name3)){
            System.out.println("Equal");
        }
        else System.out.println("not equal");
    }
}
