import java.util.*;
import java.io.*;

public class Payroll {
   public static Employee[] staffList;
   int numStaff;
   
   public void listAllEmployee() {
      for (int i = 0; i < numStaff; i++) {
         System.out.printf("Employee Number: %d, Name: %s %s",staffList[i].employeeNumber, staffList[i].firstName, staffList[i].lastName);
      }
   }
   
   public void enterSickDay(int employeeNum) {
      for (int i = 0; i < numStaff; i++) {
         if(staffList[i].employeeNumber == employeeNum) {
            staffList[i].deductSickDay();
         }
      }
      System.out.print("Employee not found!");
   }
   
   public void printAllPayStubs() {
      for (int i = 0; i < numStaff; i++) {
         staffList[i].printPayStub(); 
      }
   }
   
   public void saveStaffList(String file) {
      try {
         BufferedWriter writer = new BufferedWriter(new FileWriter(file));
         writer.write(numStaff); //Write number of staff as line 1
      
         for (int i = 0; i < numStaff; i++) {
            writer.write(staffList[i].employeeNumber); //Employee num
            writer.write(staffList[i].firstName); //First name
            writer.write(staffList[i].lastName); //Last name
            if(staffList[i] instanceof FullTimeEmployee) {
               writer.write("ft");
               writer.write( ((FullTimeEmployee)staffList[i]).getSickDaysLeft() );
               
               writer.write(String.format("%.2f", ((FullTimeEmployee)staffList[i]).getYearlySalary()));
            } else {
               writer.write("pt");
               writer.write(((PartTimeEmployee)staffList[i]).getSickDaysTaken());
               writer.write(String.format("%.2f", ((PartTimeEmployee)staffList[i]).getHourlyRate()));
               writer.write(((PartTimeEmployee)staffList[i]).getNumHoursAssigned());
            }
         }
      } catch (IOException iox) {
         System.out.println("File not found!");
      }
   }
   
   public void loadStaffList(String file) {
      try {
         BufferedReader reader = new BufferedReader(new FileReader(file));
         numStaff = Integer.parseInt(reader.readLine());
         staffList = new Employee[numStaff];
         
         for(int i = 0; i < numStaff; i++) { 
            int employeeNum = Integer.parseInt(reader.readLine());
            String fName = reader.readLine();
            String lName = reader.readLine();
            if (reader.readLine().equals("ft")) {
               int sickDaysLeft = Integer.parseInt(reader.readLine());
               double yearlySalary = Double.parseDouble(reader.readLine());
               staffList[i] = new FullTimeEmployee(employeeNum, fName, lName, sickDaysLeft, yearlySalary); //Create full time employee
            } else if (reader.readLine().equals("pt")) {
               int sickDaysTaken = Integer.parseInt(reader.readLine());
               double hourlyRate = Double.parseDouble(reader.readLine());
               int numHoursAssigned =Integer.parseInt(reader.readLine());
               staffList[i] = new PartTimeEmployee(employeeNum, fName, lName, sickDaysTaken, hourlyRate, numHoursAssigned); //Create part time employee
            }
         } 
      } catch (IOException iox) {
         System.out.println("File not found!");
      }
   }
   
   double averageHourlyRate() {
      double total = 0;
      int count = 0;
      for (int i = 0; i < numStaff; i++) {
         if (staffList[i] instanceof PartTimeEmployee) {
            total += ((PartTimeEmployee)staffList[i]).getHourlyRate();
            count++;
         }
      }
      return total/count;
   }
   
   FullTimeEmployee mostAbsentFullTime() {
      FullTimeEmployee highest = null;
      for (int i = 0; i < numStaff; i++) {
         if (staffList[i] instanceof FullTimeEmployee && ((FullTimeEmployee)staffList[i]).getSickDaysLeft() < ((FullTimeEmployee)highest).getSickDaysLeft()) {
            highest = ((FullTimeEmployee)staffList[i]);
         }
      }
      return highest;
   }
   
   PartTimeEmployee mostAbsentPartTime() {
      PartTimeEmployee highest = null;
      for (int i = 0; i < numStaff; i++) {
         if (staffList[i] instanceof PartTimeEmployee) {
            highest = ((PartTimeEmployee)staffList[i]);
         }
      }
      if (highest == null) {
         return null;
      }
      for (int i = 0; i < numStaff; i++) {
         if (staffList[i] instanceof PartTimeEmployee && ((PartTimeEmployee)staffList[i]).getSickDaysTaken() > ((PartTimeEmployee)highest).getSickDaysTaken()) {
            highest = ((PartTimeEmployee)staffList[i]);
         }
      }
      return highest;
   }
   
   public void yearlySickDayReset() {
      for (int i = 0; i < numStaff; i++) {
         if (staffList[i] instanceof FullTimeEmployee) {
            ((FullTimeEmployee)staffList[i]).resetSickDay();
         }
      }
   }
   
   public void monthylySickDayReset() {
      for (int i = 0; i < numStaff; i++) {
         if (staffList[i] instanceof PartTimeEmployee) {
            ((PartTimeEmployee)staffList[i]).resetSickDay();
         }
      }

   }
   
   
     
}