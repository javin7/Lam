import java.util.*;
import java.io.*;

public class LabTester {
   public static void main(String[] args) {
      Scanner n = new Scanner(System.in);
      System.out.print("Capacity: ");
      int capacity = n.nextInt();
      Lab lab = new Lab(capacity);
      
      
     
      try {
         BufferedReader reader = new BufferedReader(new FileReader("computer.txt"));
         int amount = Integer.parseInt(reader.readLine());
         for (int i = 0; i < amount; i++) {
            String serialNumber = reader.readLine();
            String manufacturer = reader.readLine();
            int yearMade = Integer.parseInt(reader.readLine());
            int yearPurchased = Integer.parseInt(reader.readLine());
            double processorSpeed = Double.parseDouble(reader.readLine());
            int ram = Integer.parseInt(reader.readLine());
            int yearWarranty = Integer.parseInt(reader.readLine());
         //System.out.printf("%s, %s, %d, %d, %f, %d, %d%n", serialNumber, manufacturer, yearMade, yearPurchased, processorSpeed, ram, yearWarranty);
         
            lab.installComputer(new Computer(serialNumber,manufacturer,yearMade,yearPurchased,processorSpeed,ram,yearWarranty));
         }  
      
      } catch (IOException iox) {
         System.out.print("File not found");
      }
      
      System.out.println(lab.calculateAvgYear());
      System.out.println(lab.newestComputer().toString());
      System.out.println(lab.fastestComputer().toString());
      String manu = n.nextLine();
      System.out.println(lab.createdByManufacturer(manu));
      System.out.print(Arrays.toString(lab.expiringNextYear()));
   
      
   }
}