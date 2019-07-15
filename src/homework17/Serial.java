/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author makst
 */
public class Serial {
    
   
    
    public static void serial(String fileName, Third... third) {
        
        try(OutputStream os = new FileOutputStream(fileName, true);
        ObjectOutputStream oos = new ObjectOutputStream(os);){
            
            for(int i=0; i<third.length;i++){
                
                oos.writeObject(third[i]);
               
            }
             oos.flush();
             System.out.println("Objects serial");
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    }
    
     public static Third[] deser(String fileName, int count){
        
         Third[] array = new Third[count];
         
         try(InputStream is = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(is);){
            
            for(int i=0;i<count;i++){
                
                try {
                    array[i] = (Third)ois.readObject();
                } catch (ClassNotFoundException ex) {
                   ex.printStackTrace();
                   return null;
                }
                
            }
             
            
            
        }catch(FileNotFoundException ex){
             System.out.println("name error");
             return null;
        }
         
         catch(IOException ex){
            ex.printStackTrace();
            return null;
        }
         
         return array;
    }
    
}
