import java.util.*;

/*
Javin Liu
Reverse1
*/

public class Reverse2 {
   public static void main(String[]args){
      //Vars
      int counter = 0;
      int[] list = new int[14];
      int temp;   
         
      //Scanner
      Scanner n = new Scanner(System.in);
     
      //Fill array with numbers
      for (int i = 0; i < list.length; i++) {
         System.out.println("Please enter a number:");
         list[i] = n.nextInt();
      }
      
      //Puts list in reverse
      for (int i = 13; i >= 6; i--) {
      temp = list[counter];         
      list[counter] = list[i];
         list[i] = temp;
         counter++;
      }
      
      //Outputs list
      for (int i = 0; i < list.length; i++) {
         System.out.println(list[i]);
      }
   }
}