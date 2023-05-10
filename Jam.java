public class Jam {
   private String content;
   private int date;
   private double size;
   
   public boolean checkEmpty() {
      if (this.size == 0) {
         return true;
      } return false;
   }
   
   public void spreadJam(double amount) {
      if (amount > this.size) {
         System.out.println("Not enough jam!");
         this.size = 0;
      }
      this.size = this.size - amount;
   }
   
   public String toString() {
      return "Fruit: " + this.content + "\nDate canned: " + this.date + "\nAmount in jar: " + this.size + "\n";
   }
   
}