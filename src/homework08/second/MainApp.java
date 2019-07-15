/*
 2.	Создать иерархию  классов :
Транспортное средство--> Автомобиль;
Транспортное средство--> Автобус;
Транспортное средство--> Троллейбус;
Автомобиль--> Легковой автомобиль;
       Автомобиль--> Грузовой автомобиль.

•	Создать несколько экземпляров  каждого из классов
•	Записать Легковой автомобиль в переменную типа Транспортное средство.
После этого записать (с приведением типа при нисходящем преобразовании) эту 
переменную в две другие переменные типов Автомобиль и Легковой
автомобиль соответственно
•	Записать Легковой автомобиль в переменную типа Транспортное средство. 
После этого записать (с приведением типа при нисходящем преобразовании) 
эту переменную в две другие переменные типов Грузовой автомобиль и Троллейбус 
соответственно. Что произойдёт при  попытке запустить код?

 */
package homework08.second;

public class MainApp {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();

        Car car1 = new Car();
        Car car2 = new Car();

        Bus bus1 = new Bus();
        Bus bus = new Bus();

        Trolleybus trol1 = new Trolleybus();
        Trolleybus trol2 = new Trolleybus();

        Acar acar1 = new Acar();
        Acar acar2 = new Acar();

        Truck truck1 = new Truck();
        Truck truck2 = new Truck();

        vehicle1 = acar1;
        acar2 = (Acar) vehicle1;
        car1 = (Car) vehicle1;

        System.out.println(car1);
        System.out.println(acar2);

        vehicle2 = acar1;
        //truck1 = (Truck) vehicle2;ClassCastException
        //trol1 = (Trolleybus) vehicle2;ClassCastException

    }

}
