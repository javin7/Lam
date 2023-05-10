public class Rectangle extends Shape {
   int x;
   int y;
   
   public double area() {
      return this.x * this.y;
   }
   
   public double perimeter() {
      return this.x * 2 + this.y * 2;
   }
}