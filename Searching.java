import java.util.*;

public class Searching {

   //Returns index of item in array
   public static int seqSearch(String[] list, String item) {
      for(int i = 0; i < list.length; i++) {
         if(list[i].equals(item)) {
            return i; //Returns index
         }
      }
      return -1;
   } //Returns -1 if not found
   
   public static int binarySearch (int[] list, int item) {
   //Vars
      int bottom = 0;
      int middle;
      int top = list.length-1;
      boolean found = false;
      int i = -1;
   
      while ((bottom <= top) &&(!found)) {
         middle = (bottom + top) / 2;
         if (item == list[middle]) {
            found = true;
            i = middle;
         } else if (item > list[middle]) {
            bottom = middle + 1;
         } else {
            top = middle - 1;
         }
      }
      return i;
   }
   
   
   public static void main(String[] args) {
      int num[] = {23, 27, 30, 34, 41, 49, 51, 55, 57, 60, 67, 72, 78, 83, 96};
      System.out.print(binarySearch(num,41));
   }
}
