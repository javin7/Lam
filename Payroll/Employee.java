abstract class Employee {
   int employeeNumber;
   String firstName, lastName;
   
   public Employee(int employeeNumber, String firstName, String lastName) {
      this.employeeNumber = employeeNumber;
      this.firstName = firstName;
      this.lastName = lastName;
   }
   
   abstract double pay(); 
   abstract void deductSickDay();
   abstract void resetSickDay();
   abstract void printPayStub();
   
   public String toString() {
      return "Employee Number: " + this.employeeNumber + "\nName: " + this.firstName + " " + this.lastName;
   }
}