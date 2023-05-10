public class TowerOfHanoi {
   
   
   public static void hanoi(int height, int from, int to) {
      int spareRod = 
      if (height == 1) {
         System.out.printf("Move disk from rod %d to rod %d", from, to);
      } else {
      hanoi(height-1,from,spareRod);
      System.out.printf("Move disk from rod %d to rod %d", from, to);
       hanoi(height-1,spareRod,to);
      }
   }

   public static void main(String[] args) {
      
   }
}