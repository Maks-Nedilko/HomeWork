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
public class Point {
    
    private double x;
    private double y;
    
    Point(double x, double y){
        this.x=x;
        this.y=y;
        
    }
//    public double Distance(double x1,double y1){
//        double distance;
//        distance = Math.sqrt(Math.pow((x-x1), 2)+Math.pow((y-y1), 2));
//        return distance;
//    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public boolean BPoint(Point point){
        return x==point.x && y==point.y;
    }

    public double Distance(Point point){
        return Math.sqrt(Math.pow(x-point.x, 2) + Math.pow(y-point.y, 2));
    }
   
    
    
}
