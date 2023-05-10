import java.util.*;

public class DistanceCalc {
   public double distance(double distanceMetres, double speed) {
      return distanceMetres/speed;
   }

   public static void main(String[] args) {
      //var
      double bunnyDistance, turtleDistance;
      double bunnySpeed, turtleSpeed;
      double bunnyTime, turtleTime;
      
      Scanner n = new Scanner(System.in);
      DistanceCalc calc = new DistanceCalc();
      
      //Get bunny
      System.out.print("Bunny:\nDistance between home and mall: ");
      bunnyDistance = n.nextDouble();
      System.out.print("Speed: ");
      bunnySpeed = n.nextDouble();
      
      //Get turtle
      System.out.print("Turtle:\nDistance between home and mall: ");
      turtleDistance = n.nextDouble();
      System.out.print("Speed: ");
      turtleSpeed = n.nextDouble();
      
      //Calc
      bunnyTime = calc.distance(bunnyDistance, bunnySpeed);
      turtleTime = calc.distance(turtleDistance, turtleSpeed);
      
      //Output
      if (bunnyTime < turtleTime) {
         System.out.print("The bunny is faster.");
      } else if (turtleTime < bunnyTime) {
      System.out.print("The turtle is faster.");
      } else {
      System.out.print("Both get to the mall at the same time");
      } 
      
   }
} 