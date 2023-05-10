public class LargestOfList {
   public static int largest(int[] list, int start, int end) {
      if (start == end) {
        // Base case: the list has only one element
         return list[start];
      } else {
        // Recursive case: divide the list in two and find the max of each half
         int mid = (start + end) / 2;
         int max1 = largest(list, start, mid);
         int max2 = largest(list, mid+1, end);
        // Return the larger of the two maxima
         if (max1 > max2) {
            return max1;
         } else {
            return max2;
         }
      }   
   }
   
   
   public static void main(String[] args) {
      int[] myList = {4, 1, 9, 2, 8, 3};
      int largest = largest(myList, 0, myList.length-1);
      System.out.println("The largest value is: " + largest);
   }
}