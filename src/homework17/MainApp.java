/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework17;

/**
 *
 * @author makst
 */
public class MainApp {
    
    public static void main(String[] args) {
        
        Second f1 = new Second(1, 1.5, "Hello"); 
        Second f2 = new Second(2, 2.5, "Hell");
        Second f3 = new Second(3, 3.5, "Hel");
        Second f4 = new Second(4, 4.5, "He");
        
        Third third1 = new Third(f1, f2);
        Third third2 = new Third(f3, f4);
        
        Serial.serial("M:\\doc\\nam.dat", third1,third2);
        
        Third[] array = Serial.deser("M:\\doc\\nam.dat", 2);
        
        if(array!=null){
            
            for(Third third : array){
                System.out.println(third);
            }
            
        }
        
        
    }
    
}
