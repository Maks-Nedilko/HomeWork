/*

 */
package homework2;

/**
 *
 * @author makst
 */
public class ExEighth {
     public static void main(String[] args) {

        System.out.println("Количество комбинаций без повторений: " + getNumberOfCombinations(10,3));
        System.out.println("Количество комбинаций c повторениями: " + getNumberOfCombinations2(10,3));
    }

    public static int getFactorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Argument must be non-negative");
        }

        if(n == 0){
            return 1;
        }

        return n * getFactorial(n - 1);

    }

    //без повторений
    public static int getNumberOfCombinations(int n, int m){

        return getFactorial(n) / getFactorial(n - m);

    }

    //с повторениями
    public static int getNumberOfCombinations2(int n, int m){

        return (int)Math.pow(n, m);

    }
    
}
