/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework17;

import java.io.Serializable;

/**
 *
 * @author makst
 */
public class Second implements Serializable{
    
    private int a ;
    private double d;
    private String s;

    public Second() {
    }

    public Second(int a, double d, String s) {
        this.a = a;
        this.d = d;
        this.s = s;
    }

   

    @Override
    public String toString() {
        return "Second{" + "a=" + a + ", d=" + d + ", s=" + s + '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    
    
    
}

class Third implements Serializable{
    
    private Second f1;
    private Second f2;

    public Third() {
    }

    public Third(Second f1, Second f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public Second getF2() {
        return f2;
    }

    public void setF2(Second f2) {
        this.f2 = f2;
    }

    public Second getF1() {
        return f1;
    }

    public void setF1(Second f1) {
        this.f1 = f1;
    }

    @Override
    public String toString() {
        return "Third{" + "f1=" + f1 + ", f2=" + f2 + '}';
    }
    
    
    
}
