import java.util.*;

/*
Javin Liu
Reverse1
*/

public class Reverse1 {
   public static void main(String[]args){
      //Vars
      int counter = 0;
      int[] list1 = new int[15];
      int[] list2 = new int[15];
      
      //Scanner
      Scanner n = new Scanner(System.in);
     
      //Fill array with numbers
      for (int i = 0; i < list1.length; i++) {
         System.out.println("Please enter a number:");
         list1[i] = n.nextInt();
      }
      
      //Puts list1 into list2 in reverse
      for (int i = 14; i >= 0; i--) {
         list2[i] = list1[counter];
         counter++;
      }
      
      //Outputs list2
      for (int i = 0; i < list2.length; i++) {
         System.out.println(list2[i]);
      }
   }
}