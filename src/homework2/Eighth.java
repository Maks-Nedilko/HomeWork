/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

/**
 *
 * @author makst
 */
public class Eighth {

    public static void main(String[] args) {
        System.out.println("Numbers of combinations without duplicates : " + first(10,5));
        System.out.println("Numbers of combinations with repetition : " + second(10,5));

    }

    public static int fac(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("no");
        }
        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);

        }

    }
    public static int first(int n, int m){
        return fac(n) / fac(n-m);
    }
    public static int second(int n, int m){
    return (int) Math.pow(n, m);
    }

}
