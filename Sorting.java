import java.util.*;

public class Sorting {

   public void insertionSort(int[] list) {
      //Vars
      int temp;
      int counter;
      
      for (int i = 0; i < list.length; i++) {  
         counter = i;
         temp = list[counter];
         //While value is smaller than previous value
         while (counter > 0 && temp < list[counter-1]) {
            list[counter] = list[counter-1];
            counter = counter - 1;
         }  
         list[counter] = temp;
         
      }
   }
   
   public void selectionSort(int[] list) {
      for (int i = list.length-1; i >= 0; i--)
      {
         // Find the max value
         int max = i;
         for (int j = 0; j < i; j++) {
            if (list[j] > list[max]) {
               max = j;
            }
         }
          
         // Swap the max with upperbound
         int temp = list[max];
         list[max] = list[i];
         list[i] = temp;
      }
   }
   
   public void bubbleSort(int[] list) {
      boolean sorted = false;
      int temp;
      int max = list.length;
      for(int i = list.length-1; i >= 0 && !sorted; i--) {
       sorted = true;
         for (int j = 0; j < i; j++) {
            
            //If greater, swap values
            if (list[j] > list[j+1]) {
               temp = list[j];
               list[j] = list[j+1];
               list[j+1] = temp;
               
               sorted = false;
            }
            System.out.println(Arrays.toString(list));
         }
      }
   }
   
   public void alphabetSort(String[] list) {
      boolean sorted = false;
      String temp;
      int max = list.length;
      for(int i = list.length-1; i >= 0 && !sorted; i++) {
       sorted = true;
         for (int j = 0; j < list.length-1; j++) {
            
            //If greater, swap values
            if (list[j].charAt(0) > list[j+1].charAt(0)) {
               temp = list[j];
               list[j] = list[j+1];
               list[j+1] = temp;
               
               sorted = false;
            }
         }
      }
   }
   
   public void shakeSort(double[] list) {
      boolean sorted = false;
      double temp;
      for (int i = list.length-1;i > 0 && !sorted; i--) {
         sorted = true;
         for (int j = 0; j < i; i++) {
            if (list[j] > list[j+1]) {
               temp = list[j];
               list[j] = list[j+1];
               list[j+1] = temp;
               
               sorted = false;
            }
         }
      }
   }


   public static void main(String[] args) {
      int poo[] = {11,24,3,19,10,37};
      String planets[] = {"Mercury","Venus","Earth","Mars", "Jupiter", "Saturn", "Uranus", "Neptune","Pluto"};
      Sorting pee = new Sorting();
      System.out.println(Arrays.toString(poo));
      pee.bubbleSort(poo);
      System.out.println(Arrays.toString(poo));
   }

}