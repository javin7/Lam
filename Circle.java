//Javin Liu
import java.util.*;

public class Circle {
   //vars
   private double x;
   private double y;
   private double r;
   
   //constructor   
   public Circle(double a, double b, double c) {
      this.setx(a);
      this.sety(b);
      this.setr(Math.abs(c)); 
   }
   
   public Circle(Circle other) {
      this.setx(other.getx());
      this.sety(other.gety());
      this.setr(Math.abs(other.getr())); 
   }
   
   public Circle() {
      this.setx(0);
      this.sety(0);
      this.setr(1);
   }
   
   //accessor & mutator funcs
   public double getx() {
      return this.x;
   }
   public void setx(double b) {
      this.x = b;
   }
   
   public double gety() {
      return this.y;
   }
   public void sety(double b) {
      this.y = b;
   }
   
   public double getr() {
      return this.r;
   }
   public void setr(double b) {
      this.r = b;
   }
   
   public boolean equals(Circle other) {
      return this.x == other.x && this.y == other.y && this.r == other.r;
   }
   
   public String toString() {
      return "Centre: (" + this.x + "," + this.y + ")  radius: " + this.r;
   }
   
   public double area() {
      return 3.14 * (this.r * this.r);
   }
   
   public Circle smaller(Circle other) {
      if (this.r > other.r) {
         return other;
      } else {
         return this;
      }
   }
   
   public double distance(Circle other) {
      return Math.sqrt(Math.abs(this.x - other.x) + Math.abs(this.y - other.y));
   }
   
   // huhh
   public boolean isInside(Circle other) {
      boolean insideCentre = false;
   //check centre if inside
      if (this.x < other.x + other.r && this.x > other.x - other.r && this.y < other.y + other.r && this.y > other.y - other.r) {
         insideCentre = true;
      }
   //check if radius is inside 
      if (insideCentre && other.r < this.x + this.r - other.x && other.r < this.y + this.y - other.y && other.r > this.x - this.x + other.x && other.r > this.y - this.y + other.y) {
         return true;
      }
      return false;
   }
   
   
   
   public static void main(String[] args) {
      
   }
}