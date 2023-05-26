import java.util.*;

public class Main{
   public static void main(String[] args){
       String str1 = "hell";
       String str2 = "lleh";
       boolean result = isAnagram(str1,str2);
       System.out.println(result);
   }
        public static boolean isAnagram(String str1, String str2){
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);

    }
}