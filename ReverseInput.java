import java.util.*;
import java.io.*;

public class ReverseInput {
   public static void main(String[] args) {
   
      String fileToRead = "data.txt";
      String fileToWrite = "results.txt";
      String intake;
   
      try {
         BufferedReader reader = new BufferedReader(new FileReader(fileToRead));
         BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite,false));
         intake = reader.readLine();
         while (intake != null){
               for (int i = (intake.length()-1); i >= 0;i--) {
                  writer.write(intake.charAt(i));
                  
               }
               writer.newLine(); 
               intake = reader.readLine();
         }
         writer.close();
      } catch (IOException iox) {
         System.out.print("What the fart");
      }
   
   }
}