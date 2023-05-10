import java.util.*;
import java.io.*;

public class Sack {
   public static void main(String[] args) {
      try {
      BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
      BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt", false));
      String temp = "";
      
      temp = reader.readLine();
      
      while (temp != null) {
         
         for (int i = temp.length()-1; i >= 0; i--) {
            writer.write(temp.charAt(i));
         }
         writer.newLine();
         temp = reader.readLine();
      }
      writer.close();
      
      } catch (IOException iox) {
      
      }
   }
}