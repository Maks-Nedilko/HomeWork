/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework08.fourth;

/**
 *
 * @author makst
 */
public class ColoredPoint extends Point{
    private double r;
    private int g;
    private float b;

    public ColoredPoint(double r, int g, float b, double x, double y) {
        super(x, y);
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    public String Color(){
        return r + " * " + g + " * " + b;
}
}
