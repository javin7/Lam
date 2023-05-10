public class Lab {
   static int capacity;
   static int computersInstalled;
   Computer[] computers;
   
   public Lab(int maxCapacity) {
      capacity = maxCapacity;
      computers = new Computer[capacity];
      computersInstalled = 0;
   } 
   
   public boolean installComputer(Computer a) {
      if (computersInstalled < capacity) {
         computers[computersInstalled] = new Computer(a.getSerialNumber(),a.getManufacturer(),a.getYearMade(),a.getYearPurchased(), a.getProcessorSpeed(),a.getRam(),a.getYearWarrantyExpiry());
         computersInstalled++;
         return true;
      } else {
         return false;
      }
   }
   
   public double calculateAvgYear() {
      int total = 0;
      for (int i = 0; i < computersInstalled; i++) {
         total = total + (computers[i].getYearPurchased() - computers[i].getYearMade());
      }
      return total / computersInstalled;
   }
   
   public Computer fastestComputer() {
      int highest = 0;
      for (int i = 0; i < computersInstalled; i++) {
         if (computers[i].getProcessorSpeed() > computers[highest].getProcessorSpeed()) {
            highest = i;
         }
      }
      return computers[highest];
   }
   
   public Computer newestComputer() {
      int highest = 0;
      for (int i = 0; i < computersInstalled; i++) {
         if (computers[i].getYearPurchased() > computers[highest].getYearPurchased()) {
            highest = i;
         }
      }
      return computers[highest];
   }
   
   public Computer largestRam() {
      int highest = 0;
      for (int i = 0; i < computersInstalled; i++) {
         if (computers[i].getRam() > computers[highest].getRam()) {
            highest = i;
         }
      }
      return computers[highest];
   }
   
   public int createdByManufacturer(String name) {
      int amount = 0;
      for (int i = 0; i < computersInstalled; i++) {
         if (computers[i].getManufacturer().equals(name)) {
            amount++;
         }
      }
      return amount;
   }
   
   public Computer[] expiringNextYear() {
   int counter = 0;
      Computer[] expNext = new Computer[computersInstalled];
       for (int i = 0; i < computersInstalled; i++) {
         if(computers[i].getYearWarrantyExpiry() - 1 == computers[i].getYearPurchased() - computers[i].getYearMade()) {
            expNext[counter] = new Computer(computers[i].getSerialNumber(), computers[i].getManufacturer(), computers[i].getYearMade(), computers[i].getYearPurchased(), computers[i].getProcessorSpeed(), computers[i].getRam(), computers[i].getYearWarrantyExpiry());
            counter++;
         }
       }
       return expNext;
   }

   
   
  
}