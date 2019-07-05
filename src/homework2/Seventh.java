
package homework2;

import java.util.Arrays;

/**
 *
 * @author makst
 */
public class Seventh {
    
    public static void sort(int [][] arrays){
        
        int skam;
        boolean tru;
        
        for(int k = 0;k < arrays.length; k++){
            tru = k % 2 ==0;
            for(int j = 1; j < arrays.length;j++){
                for(int i = 0;i < arrays.length-j;i++){
                    if((tru && arrays[k][i]< arrays[k][i+1]) || (!tru && arrays[k][i] > arrays[k][i+1])){
                        skam = arrays[k][i+1];
                        arrays[k][i+1] = arrays[k][i];
                        arrays[k][i]= skam;
                    }
                }
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        int[][] arrays = {
            {1,3,2,4,},
            {5,6,9,8,},
            {2,7,6,3,},
            {3,1,5,7,}
            
                
        };
        for(int[] a: arrays){
            System.out.println(Arrays.toString(a) + "");
        }
        System.out.println("------------------");
        sort(arrays);
        
        for(int[] a: arrays){
            System.out.println(Arrays.toString(a) + "");
        }
        
        
        

}
}
