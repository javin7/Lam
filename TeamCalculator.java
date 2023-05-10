import java.util.*;
import java.io.*;

public class TeamCalculator {
   
   //Check if number is numeric
   public static boolean isNumeric(String str) { 
      try {  
         Double.parseDouble(str);  
         return true;
      } catch(NumberFormatException e){  
         return false;  
      }  
   }

   public static void main(String[] args) {
      //Variables
      String fileName;
      String teamCaptain;
      double count = 0;
      double totalCount = 0;
      String name = "Burns";
      int averageSize = 0;
      
      //Scanner
      Scanner n = new Scanner(System.in);
      
      //Get team captain
      System.out.print("Enter team captain: ");
      teamCaptain = n.nextLine();
      try {
         fileName = teamCaptain + ".txt";
      
         //Turn file into arraylist
         Scanner s = new Scanner(new File(fileName));
         ArrayList<String> list = new ArrayList<String>();
         while (s.hasNextLine()){
            list.add(s.nextLine());
         }
         System.out.println(list.toString());
         
         
         //Calculate averages
         for (int i = 1; i < list.size(); i++) {
            if (isNumeric(list.get(i))) {
               count += Double.parseDouble(list.get(i));
               totalCount += Double.parseDouble(list.get(i));
               averageSize++;
            }
            else {
               name = list.get(i); //Never in my life have hated programming more than file IO
               //Calculate average
               System.out.printf("%s average score: %.2f%n", name, (double) count / averageSize);
               averageSize = 0;
               count = 0;
            }
         }
         
         //Calculate team average
         System.out.printf("Team average score: %.2f%n", (double) totalCount / list.size());
         
         s.close();
      }
      catch (FileNotFoundException e) 
      {
         System.out.print("The team captain doesn't exist");
      }
      
   }
   
}
