/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework08.first;

/**
 *
 * @author makst
 */
public class Class1 {
    static{
        System.out.println("static Class1");
    }
    {
        System.out.println("non-static Class1");
    }

    public Class1() {
        System.out.println("constr Class1");
    }
    
    
}
