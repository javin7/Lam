import java.util.*;


public class GreatestCommonDivisor {
   public static int gcd(int m, int n)
   {
      if (m == n) {
         return m;
      } else if (m > n) {
         return gcd(n,m-2);
      } else {
         return gcd(n,m);
      }
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int n = sc.nextInt();
      int gcd = gcd(m, n);
   
      System.out.printf("The greatest common denominator of %d and %d is %d.", m, n, gcd);
   }    
}