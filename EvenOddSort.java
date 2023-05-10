import java.util.*;

public class EvenOddSort {
   public static void evenOddSort(int[] list) {
   boolean evenSorted = false;
   boolean oddSorted = false;
      while (!oddSorted && !evenSorted) {
         evenSorted = true;
         oddSorted = true;
         for (int b = 0; b < list.length-1; b+=2) {
            if (list[b] > list[b+1]) {
               int temp = list[b];
               list[b] = list[b+1];
               list[b+1] = temp;
               evenSorted = false;
            }
         }
         for (int a = 1; a < list.length-1; a+=2) {
            if (list[a] > list[a+1]) {
               int temp = list[a];
               list[a] = list[a+1];
               list[a+1] = temp;
               oddSorted = false;
            }
         }
      }
   }
   
   public static void main(String[] args) {
      int[] wat = {5,2,9,6,2,13,5,6,3};
      evenOddSort(wat);
      System.out.print(Arrays.toString(wat));
   }
   
}