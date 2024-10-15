package Medium;

public class Qn3 {
    public int square(int number) {
        return number * number;
    }

    public int squareOfSums(int n) {
        int summation = 0;
        for (int i = 1; i <= n; i++) {
            summation += i;

        }
        Qn3 square = new Qn3();
        return square.square(summation);


    }
    public int sumOfSquares(int n) {
        Qn3 square = new Qn3();
        int summatio = 0;
        for (int i = 1; i <= n; i++) {
            summatio += square.square(i);

        }

        return summatio;




    }
    public int diff(int limit){
        Qn3 sos = new Qn3();
        return sos.squareOfSums(limit)- sos.sumOfSquares(limit);
    }

    public static void main(String[] args) {
        Qn3 sos = new Qn3();
        System.out.println(sos.diff(10));




    }
}
