public class BinarySearch {
   public static int search(int[] list, int target, int low, int high) {
      if (low > high) {
         return -1;
      } 
      int mid = (low + high) / 2;
      
      if (target == list[mid]) {
         return mid;
      } 
      if (target > list[mid]) {
         return search(list, target, mid+1, high);
      } 
         
      if (target < list[mid]) {
         return search(list, target, low, mid-1);
      }
      return -1;
   }
   
   
   public static void main(String[] args) {
      int[] list = {5,2,3,5,2,3,5,2,1,6,7,21,4,6,12,5,8};
      System.out.print(search(list, 12, 0, list.length-1));
   }
}
