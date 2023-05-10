public class Shirt {
   private String color;
   private int size;
   private int year;
   
   public String getColor() {
      return this.color;
   }
   public int getSize() {
      return this.size;
   }
   public int getYear() {
      return this.year;
   }
   
   public void setColor(String set) {
      this.color = set;
   }
   public void setSize(int set) {
      this.size = set;
   }
   public void setYear(int set) {
      this.year = set;
   }
   
   public Shirt(String color, int size, int year) {
      this.color = color;
      this.size = size;
      this.year = year;
   }
   
   public int compareToAge(Shirt other) {
      return this.year - other.year;
   }
   
   public int compareToSize(Shirt other) {
      return this.size - other.size;
   }
   
   public String toString() {
      return "Color: " + this.color + "\nSize: " + this.size + "\nYear: " + this.year;
   }
   
   public boolean equals(Shirt other) {
      if (this.color == other.color && this.size == other.size) {
         return true;
      } return false;
   }
   
}