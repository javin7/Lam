import java.util.*;
import java.io.*;

public class FileIO {
   public static void main(String[] args) {
      String file = "balls.txt";
      String money;
      double deposit;
      double sum;
      double temp;
      Scanner n = new Scanner(System.in);
      
      try {
         BufferedReader reader = new BufferedReader(new FileReader(file));
         money = reader.readLine();
      
         if (money == null) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            writer.write("0");
            writer.close(); 
            money = reader.readLine();
         }
      
         System.out.print("You have $" + money);     
         reader.close();
      } catch (IOException iox) {
      
      } 
      
      try {
         BufferedReader reader = new BufferedReader(new FileReader(file));
         money = reader.readLine();
         System.out.print("\n" + money);
         System.out.print("\nHow much money do you want to deposit: $");
         deposit = n.nextInt();
         
         temp = Double.parseDouble(money);
         sum = temp + deposit;
         BufferedWriter writer = new BufferedWriter(new FileWriter(file,false));
         writer.write(Double.toString(sum));
         System.out.print("You now have $" + sum);     
      } catch (IOException iox) {
      
      } 
      
   }
}