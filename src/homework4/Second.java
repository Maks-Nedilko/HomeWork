/*
	Написать метод, заменяющий в строке слово “студент“ на словосочетание
“студент “ +s, где s – строка-фамилия студента, которая передается в метод 
как параметр. Протестировать работу метода.
 */
package homework4;


public class Second {
    
    public static void main(String[] args) {
        
        String text = "Студент відсутній сьогодні.Також студент був відстутнй вчора";
        String text2=Trans(text);
        System.out.println(text);
        System.out.println(text2);
    }
    
    public static String Trans(String text){
        String s ="Неділько";
        return text.replaceAll("Студент|студент", "студент "+s);
    }
}
