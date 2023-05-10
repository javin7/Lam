import java.util.*;

public class StringRecursion {

   public static int length(String s, int z) {
      if (s.isEmpty() == false) {
         z++;
         return length(s.substring(1),z);
      }
      return z;
   }
   
   public static boolean equalsIgnoreCase(String s1, String s2) {
      if (s1 == s2) {
         return true;
      }
      
      if (s1 == null || s2 == null) {
         return false;
      }
      
      if (s1.length() != s2.length()) {
         return false;
      }
      
      char c1 = Character.toLowerCase(s1.charAt(0));
      char c2 = Character.toLowerCase(s2.charAt(0));
      
      if (c1 != c2) {
         return false;
      }
      
      return equalsIgnoreCase(s1.substring(1), s2.substring(1));
   }
   
   public static boolean equalsIgnoreVowel(String s1, String s2) {
      
      s1 = s1.replace("a",""); 
      s1 = s1.replace("e","");
      s1 = s1.replace("i","");  
      s1 = s1.replace("o",""); 
      s1 = s1.replace("u",""); 
   
      s2 = s2.replace("a",""); 
      s2 = s2.replace("e","");
      s2 = s2.replace("i","");  
      s2 = s2.replace("o",""); 
      s2 = s2.replace("u",""); 
      
   
      if (s1 == s2) {
         return true;
      }
      
      if (s1 == null || s2 == null) {
         return false;
      }
      
      if (s1.length() != s2.length()) {
         return false;
      }
      char c1 = Character.toLowerCase(s1.charAt(0));
      char c2 = Character.toLowerCase(s2.charAt(0));
      
      if (c1 != c2) {
         return false;
      }
      
      return equalsIgnoreVowel(s1.substring(1), s2.substring(1));
   }
   
   public static int countChar(String s, char c) {
      
      if (s.isEmpty()) {
         return 0;
      }
      
      int count = 0;
      
      if(s.charAt(0) == c) {
         count++;
      }
      
      return count + countChar(s.substring(1),c);
   }

   public static void main(String[] args) {
      //System.out.print(length("wahttheasdaw",0));
      System.out.print(equalsIgnoreVowel("wahttheasdaw", "wahttheasdaw"));
   }
}