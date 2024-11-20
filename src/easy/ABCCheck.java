package easy;
public class ABCCheck {
    public static String abcCheckStringFun(String var0) {
       var0 = var0.toLowerCase();
 
       for(int var1 = 0; var1 < var0.length() - 4; ++var1) {
          if (var0.charAt(var1) == 'a' && var0.charAt(var1 + 4) == 'b') {
             return "true";
          }
 
          if (var0.charAt(var1) == 'b' && var0.charAt(var1 + 4) == 'a') {
             return "true";
          }
       }
 
       return "false";
    }
 
    public static void main(String[] var0) {
       System.out.println(abcCheckStringFun("lane borrowed"));
       System.out.println(abcCheckStringFun("after badly"));
       System.out.println(abcCheckStringFun("a b c d e f b"));
    }
 }
 