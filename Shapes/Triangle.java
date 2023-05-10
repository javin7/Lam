public class Triangle extends Shape {
   double base, s2, s3;
   double height;
   
   public double area() {
      return this.base * this.height / 2;
   }
   
   public double perimeter() {
      return this.base + this.s2 + this.s3;
   }
}