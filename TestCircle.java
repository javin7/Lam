//Javin Liu

public class TestCircle {
   public static void main(String[] args) {
      Circle c1 = new Circle(4,-1,3);
      Circle c2 = new Circle(3,-2,5);
      
      System.out.println(c1.area());
      System.out.println(c1.smaller(c2));
      System.out.println(c2.isInside(c1));
      Circle c3 = c1;
      Circle c4 = new Circle(c2);
      
      System.out.println(c1 == c3);
      System.out.println(c1 == c4);
      System.out.println(c1.equals(c4));
       
      
   }
}