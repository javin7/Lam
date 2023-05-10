public class PartTimeEmployee extends Employee {
   int numHoursAssigned;
   double hourlyRate;
   int sickDaysTaken;
   
   public PartTimeEmployee(int num, String fName, String lName, int sickDays, double rate, int hours) {
      super(num,fName,lName);
      this.sickDaysTaken = sickDays;
      this.hourlyRate = rate;
      this.numHoursAssigned = hours;
   }
   
   int getSickDaysTaken() {
      return this.sickDaysTaken;
   }
   double getHourlyRate() {
      return this.hourlyRate;
   }
   int getNumHoursAssigned() {
      return this.numHoursAssigned;
   }
   
   void setSickDaysTaken(int sickDays) {
      this.sickDaysTaken = sickDays;
   }
   void setHourlyRate(double rate) {
      this.hourlyRate = rate;
   }
   void setNumHoursAssigned(int assigned) {
      this.numHoursAssigned = assigned;
   }
   
   public double pay() {
      return this.numHoursAssigned * this.hourlyRate;
   }
   
   public void deductSickDay() {
      this.sickDaysTaken++;
   }
   
   public void resetSickDay() {
      this.sickDaysTaken = 0;
   }
   
   public void printPayStub() {
      System.out.printf("This months pay: %.2f$", this.pay());
   }
   
   public int compareToSickDay(PartTimeEmployee other) {
      return this.sickDaysTaken - other.sickDaysTaken;
   }
   
   public String toString() {
      return super.toString() + "\nTitle: Part-Time Employee";
   }

}