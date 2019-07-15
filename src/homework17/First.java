
package homework17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class First {

    public static void m(String dirName)  {

        File file1 = new File(dirName);
        if (!file1.exists() || !file1.isDirectory()) {
            try {
                throw new FileNotFoundException("Is not directory or not found");
            } catch (FileNotFoundException ex) {
                System.out.println("Directory not found!!");
            }
        } else {
            System.out.println("Directory exists : ");
        }

         File[] files = file1.listFiles();

        int minIndex = 0;
        int maxIndex = 0;
        double min = 0;
        double max = 0;
        boolean check = true;

        for (int i = 0; i < files.length; i++) {

            if (files[i].isDirectory()){
                continue;
            }

            if (check){
                minIndex = i;
                maxIndex = i;
                min = files[i].length();
                max = files[i].length();
                check = false;
                continue;
            }

            double currentSize = files[i].length();
            if (currentSize < min){
                min = currentSize;
                minIndex = i;
            }
            if (currentSize > max){
                max = currentSize;
                maxIndex = i;
            }
        }
        System.out.println("min file - " + files[minIndex].getName() + ", size - " + (min / 1000) + " KB");
        System.out.println("max file - " + files[maxIndex].getName() + ", size - " + (max / 1000) + " KB");
        
       
//        for (File file : file1.listFiles()) {
//            System.out.println(file.getName()+ " " + file.length());
//            
//        }

        
    }

    public static void main(String[] args) {
        m("M:\\doc");
    }
}
