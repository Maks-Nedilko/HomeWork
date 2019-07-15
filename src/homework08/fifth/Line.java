/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework08.fifth;

/**
 *
 * @author makst
 */
public class Line {
    private Point point1;
    private Point point2;
    
    public Line(){}

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Line{" + "point1=" + point1 + ", point2=" + point2 + '}';
    }
    
    public static boolean Eq(Line line1,Line line2){
        return (line1.point1.APoint(line2.point1)&& line1.point2.APoint(line2.point2)
                || line1.point1.APoint(line2.point2)&& line1.point2.APoint(line2.point1));
    }
    private double Cof(){
        return (point2.getY()-point1.getY())/(point2.getX()-point1.getX());
    }
    public static boolean Par(Line line1,Line line2){
        return line1.Cof()==line2.Cof();
    }
}
