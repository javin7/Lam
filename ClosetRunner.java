import java.util.*;
import java.io.*;

public class ClosetRunner {
   public static void main(String[] args){
      Scanner n = new Scanner(System.in);
   
      System.out.print("Capacity: ");
      int capacity = n.nextInt();
      Closet closet = new Closet(capacity);

   
      try {
         BufferedReader reader = new BufferedReader(new FileReader("boyShirts.txt"));
         int amount = Integer.parseInt(reader.readLine());
         for (int i = 0; i < amount; i++) {
            String color = reader.readLine();
            int size = Integer.parseInt(reader.readLine());
            int year = Integer.parseInt(reader.readLine());
            closet.addShirt(new Shirt(color,size,year));
         }
      } catch (IOException iox) {
         System.out.println("File not found!");
      } 
      System.out.print(closet.newestShirt().toString());
      //System.out.print(closet.newestShirt().toString());
      //System.out.print(closet.givenSize(10));
      =
   
      for (int i = 0; i < 5; i++) {
         System.out.printf("%nShirt %s: ", i+1);
         System.out.print("\nColor: ");
         n.nextLine();
         String color = n.nextLine();
         System.out.print("Size: ");
         int size = n.nextInt();
         System.out.print("Year made: ");
         int year = n.nextInt();
         closet.addShirt(new Shirt(color,size,year));
      }  
      
      
      
   }
}