/*
	Написать метод (используя регулярные выражения), проверяющий сколько 
подстрок вида “qwe” содержится в данной строке. Протестировать работу метода.
 */
package homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Fourth {
    public static void main(String[] args) {
        
        System.out.println(Count2("qwewee qwe dsfdddsf qwe"));
        
    }
    
    public static int Count2(String test){
    int result=0;
    
    Pattern pattern = Pattern.compile("qwe");
    Matcher matcher = pattern.matcher(test);
    while(matcher.find()){
        result++;
    }
    
    return result;
    }
    
    public static int Count(String test){
        String [] array=test.split("qwe",50_000);
        int result = array.length-1;
        return result;
        
        
    }
    
}
