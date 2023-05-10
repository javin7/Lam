import java.util.*;

public class Segment {
   public static void main(String[] args) {
      //vars
      int x, nvar;
      int sum = 0;
      
      Scanner n = new Scanner(System.in);
      
      x = n.nextInt();
            nvar = n.nextInt();
      
      
      for (int i = 1; i <= 2*nvar; i += 2) {
         if(i < 2*nvar-1){
         System.out.printf("%d^%d - %d^%d + ",x,i,x,i+1);
         } else {
         System.out.printf("%d^%d - %d^%d",x,i,x,i+1);
         }
         
         sum += (Math.pow(x,i) - Math.pow(x,i+1));
         
      }
      
      System.out.print("\n" + sum);
   }
}