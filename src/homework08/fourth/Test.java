/*
 4.	Создать класс Point (Точка). Продумать, какие поля и методы
целесообразно ввести в этот класс. Написать метод distance, вычисляющий
расстояние от данной точки до точки, переданной в качестве параметра методу. 
Создать класс ColoredPoint (Цветная точка), который является наследником класса
Point. Какие поля и методы целесообразно добавить в новый класс?
 */
package homework08.fourth;

/**
 *
 * @author makst
 */
public class Test {
    
    public static void main(String[] args) {
        Point point = new Point(4,5);
        System.out.println(point.Distance(new Point(1,1)));
        
    }
    
}
