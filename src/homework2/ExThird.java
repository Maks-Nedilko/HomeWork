/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;


public class ExThird {
        
     public static void main(String[] args) {

        long[] array1 = {789799898, 99898989, 984687987};
        long[] sortArray = sort(array1);
        for (long g:sortArray) {
            System.out.println(g);
        }
        System.out.println("*******");
        double[] array2 = {10.8, 7.2, 15.8};
        double[] sortArray2 = sort(array2);
        for (double g:sortArray2) {
            System.out.println(g);
        }
    }

    public static double[] sort(double[] array) {

        double temp;
        double[] rez = array;

        for (int j = 1; j < rez.length; j++) {
            for (int i = 0; i < rez.length - j; i++) {
                if (rez[i] < rez[i + 1]) {
                    temp = rez[i + 1];
                    rez[i + 1] = rez[i];
                    rez[i] = temp;
                }
            }
        }

        return rez;

    }

    public static long[] sort(long[] array) {

        long temp;
        long[] rez = array;

        for (int j = 1; j < rez.length; j++) {
            for (int i = 0; i < rez.length - j; i++) {
                if (rez[i] < rez[i + 1]) {
                    temp = rez[i + 1];
                    rez[i + 1] = rez[i];
                    rez[i] = temp;
                }
            }
        }

        return rez;

    }
    
}
