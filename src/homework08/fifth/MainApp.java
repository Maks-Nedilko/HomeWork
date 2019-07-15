/*
 5.	Создать класс Line (прямая), исходя из того, что прямая однозначно
определяется любыми двумя своими точками. (Класс Point определяет точку на 
плоскости). Написать статический метод, проверяющий совпадают ли две прямые,
переданные методу в качестве параметров. Написать статический метод, 
проверяющий параллельны ли две прямые, переданные методу в качестве параметров.
 */
package homework08.fifth;

/**
 *
 * @author makst
 */
public class MainApp {
    
    public static void main(String[] args) {
        
        Point point1 = new Point(1,1);
        Point point2 = new Point(5,1);
        
        Line line1 = new Line();
        line1.setPoint1(point1);
        line1.setPoint2(point2);
        
        //System.out.println(line1);
        
        Point point3 = new Point(1,2);
        Point point4 = new Point(5,2);
        
        Line line2 = new Line(point3,point4);
        
        Line line3 = new Line(new Point(5,5),new Point(1,1));
        //System.out.println(line3);
          //System.out.println(line2);  
        System.out.println(Line.Eq(line1, line2));
        System.out.println(Line.Eq(line1, line3));
        System.out.println(Line.Par(line1, line2));
    }
    
   
    
}
