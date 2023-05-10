import java.util.*;

/*
Javin Liu
Simple1DArray
*/

public class Simple1DArray {
   public static void main(String[] args) {
   //Vars
      int arraySize;
      int temp;   
      int sampleSum = 0;
   
      Scanner n = new Scanner(System.in);
   
   //Create array
      System.out.print("Enter array size: ");
      arraySize = n.nextInt();
      int numbers[] = new int[arraySize];
   
   //Fill array
      for(int i = 0; i < numbers.length; i++){
         System.out.printf("Enter number %d: ", i+1);
         numbers[i] = n.nextInt();
      }
   
      //Swap end at start
      temp = numbers[numbers.length-1];
      numbers[numbers.length-1] = numbers[0];
      numbers[0] = temp;
   
      //Change all negatives to positive
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] < 0) {
            numbers[i] *= -1;
         }
      }
      
      //Sample sum
      for (int i = 0; i < numbers.length; i++) {
         sampleSum += numbers[i];
      } System.out.printf("%nThe sum of all the elements is %d%n", sampleSum);
      
      //Print even numbers
      System.out.println("\nEven numbers:");
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            System.out.print(numbers[i] + " ");
         }
      }
      
   }
}