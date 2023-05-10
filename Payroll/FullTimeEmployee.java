import java.util.*;

class FullTimeEmployee extends Employee {
   final int YEARLY_SICK_DAY = 20;
   private double yearlySalary;
   private int sickDaysLeft;
   
   
   public FullTimeEmployee(int number, String fName, String lName, int sickDays, double yearlySalary) {
      super(number, fName, lName);
      this.sickDaysLeft = sickDays;
      this.yearlySalary = yearlySalary;
   }
   
   public double getYearlySalary() {
      return this.yearlySalary;
   }
   public int getSickDaysLeft() {
      return this.sickDaysLeft;
   }
   
   public void setYearlySalary(double salary) {
      this.yearlySalary = salary;
   }
   public void setSickDaysLeft(int left) {
      this.sickDaysLeft = left;
   }
   
   public double pay() {
      return this.yearlySalary/12;
   }
   
   public void deductSickDay() {
      this.sickDaysLeft--;
   }
   
   public void resetSickDay() {
      this.sickDaysLeft = YEARLY_SICK_DAY;
   }
   
   public void printPayStub() {
      System.out.printf("This months pay: %.2f$", this.pay());
   }
   
   public int compareToSickDay(FullTimeEmployee other) {
      return this.sickDaysLeft - other.sickDaysLeft;
   }
   
   public String toString() {
      return super.toString() + "\nTitle: Full-Time Employee";
   }

}