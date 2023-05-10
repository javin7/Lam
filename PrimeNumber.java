import java.util.*;

public class PrimeNumber {
   public static boolean prime(int N, int D) { 
      if (D == 1) {
         return true;
      } 
   
      if (N % D == 0) {
         return false;
      }
   
      return prime(N, D-1);
   }

   public static void main(String[] args) {
      Scanner n = new Scanner(System.in);
      int input = n.nextInt();
      System.out.print(prime(input,input-1));
   }
}