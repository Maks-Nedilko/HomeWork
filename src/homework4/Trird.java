/*
 3.	Используя регулярные выражения, проверить валидность пароля
(реализовать метод проверки валидности). Валидный пароль состоит только
из латинских букв, цифр и знака _. Начинается с буквы. Содержит не менее 8 
символов. Содержит как минимум две большие буквы, как минимум две маленькие 
буквы, и как минимум две цифры. Протестировать работу метода.
 */
package homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trird {

    public static void main(String[] args) {
        String test = "AAmm22m2";
        System.out.println(chek(test));
        String test2 = "eh00kk98KM_7654";
        System.out.println(chek(test2));
    }

    static boolean chek(String test) {

        Pattern pattern = Pattern.compile("^[a-zA-Z](_*)(?=.*[A-Z].*[A-Z])(?=.*[0-9].*[0-9])(?=.*[a-z]).*[a-z].{7,}$");
        Matcher matcher = pattern.matcher(test);
        return matcher.matches();
    }

}
