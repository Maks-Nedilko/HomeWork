
package homework2;

/**
 *
 * @author makst
 */
public class Nineth {
    public static int [][] Arrays(int[] array){
        int[][] arrays = new int[array.length][];
        for(int i =0;i < array.length;i++){
            arrays[i] = new int[array.length - i];
            for(int j = i;j<array.length;j++){
                arrays[i][j-i] = array[j];
            }
        }
        return arrays;
    }
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        for(int[] a : Arrays(array)){
            System.out.println(java.util.Arrays.toString(a) + "");
        }
               
    }
}
