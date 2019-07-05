/*
	Устранить все лишние пробелы между словами и предложениями в строке.
Пробел считается лишним, если перед ним стоит пробельный символ. 
Протестировать работу метода.
 */
package homework4;

public class First {

    public static void main(String[] args) {
        String text = "Перевірити  та  прибрати   зайві відступи";
        String text2 = textTrans(text);
        System.out.println(text);
        System.out.println(text2);
    }

    public static String textTrans(String text) {
        return text.replaceAll("\\s{2,}", " ");
    }
}
