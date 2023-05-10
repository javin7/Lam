public class PrintTriangle {
       public static void triangle(int n) {
        if (n == 0) { 
                    return;
        }
        triangle(n - 1); // recursive call
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println(); // print a newline after each row
    }
   
   public static void main(String[] args) {
      triangle(5);
   }
}