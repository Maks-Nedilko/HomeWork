/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework10.first;

/**
 *
 * @author makst
 */
public class MainApp {
    
    public static void main(String[] args) {
        
        Cl1 cl1 = new Cl1();
        Cl2 cl2 = new Cl2();
        Cl3 cl3 = new Cl3();
        
        //cl1=cl2;
        //cl2=cl3;
        
        Int1 i1=cl1;
        Int2 i2=cl2;
        Int3 i3=cl3;
        
        i1=i2;
        i2=i3;
    }
    
}
