/*
 1.	Создать иерархию Class1--->Class2------->Class3---------->Class4.
(каждый последующий является наследником предыдущего). В каждом из классов 
создать нестатический и статический блоки инициализации и конструкторы.
Исследовать порядок инициализации при конструировании объектf типа Class4.
 */
package homework08.first;


public class Test {
    
    public static void main(String[] args) {
        
    Class1 c1 = new Class1();
        System.out.println("**************");
    Class2 c2 = new Class2();
        System.out.println("***************");
    Class3 c3 = new Class3();
        System.out.println("***************");
    Class4 cl = new Class4();
    Class4 cls = new Class4();
    
    }
    
}
