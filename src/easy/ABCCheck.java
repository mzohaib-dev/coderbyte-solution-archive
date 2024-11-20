import java.util.*;

/**
 * Have the function ABCheck(str) take the str parameter being passed
 * and return the string true if the characters a and b are separated by exactly 3 places
 * anywhere in the string at least once (i.e. "lane borrowed" would result in true
 * because there is exactly three characters between a and b). Otherwise, return the string false.
 */

public class ABCCheck{
    public static String abcCheckStringFun(String str){
        str = str.toLowerCase();

        for(int index = 0; index < str.length() - 4; index++){

            if(str.charAt(index) == 'a' && str.charAt(index + 4) == 'b')
                return "true";
            
            if(str.charAt(index) == 'b' && str.charAt(index + 4) == 'a')
                return "true";
            
        }

        return "false";
    }
    public static void main(String[] args){
        System.out.println(abcCheckStringFun("lane borrowed"));
        System.out.println(abcCheckStringFun("after badly"));
        System.out.println(abcCheckStringFun("a b c d e f b"));
    }
}