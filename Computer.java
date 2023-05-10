public class Computer {
//vars
  private String serialNumber;
  private String manufacturer;
  private int yearMade;
  private int yearPurchased;
  private double processorSpeed;
  private int ram;
  private int yearWarrantyExpiry;
  
  //accessors
  public String getSerialNumber() {
     return this.serialNumber;
  }
  public String getManufacturer() {
     return this.manufacturer;
  }
  public int getYearMade() {
     return this.yearMade;
  }
  public int getYearPurchased() {
     return this.yearPurchased;
  }
  public double getProcessorSpeed() {
     return this.processorSpeed;
  }
  public int getRam() {
     return this.ram;
  }
  public int getYearWarrantyExpiry() {
     return this.yearWarrantyExpiry;
  }
  
  //mutaatotrs
  public void setSerialNumber(String num) {
     this.serialNumber = num;
  }
  public void setManufacturer(String name) {
     this.manufacturer = name;
  }
  public void setYearMade(int num) {
     this.yearMade = num;
  }
  public void setYearPurchased(int num) {
     this.yearPurchased = num;
  }
  public void setProcessorSpeed(double num) {
     this.processorSpeed = num;
  }
  public void setRam(int num) {
     this.ram = num;
  }
  public void setYearWarrantyExpiry(int num) {
     this.yearWarrantyExpiry = num;
  }
  
  //constueritonrer
  public Computer(String serialNumber, String manufacturer, int yearMade, int yearPurchased, double processorSpeed, int ram, int yearWarrantyExpiry) {
     this.serialNumber = serialNumber;
     this.manufacturer = manufacturer;
     this.yearMade = yearMade;
     this.yearPurchased = yearPurchased;
     this.processorSpeed = processorSpeed;
     this.ram = ram;
     this.yearWarrantyExpiry = yearWarrantyExpiry;
  }
 
 //2string 
  public String toString() {
     return "Serial Number: " + this.serialNumber + "\nManufacturer: " + this.manufacturer + "\nYear Made: " + this.yearMade + "\nYear Purchased: " + this.yearPurchased + "\nProcessor Speed: " + this.processorSpeed + "\nRam: " + this.ram + "\nYear Warranty Expires: " + this.yearWarrantyExpiry;
  }
  
}