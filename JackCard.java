public class JackCard {
   //Vars
   private String cardHolder;
   private double balence;
   private double discountRate;
   private int points;
   private int pin;
   int maximum = 99999;
   
   //Constructor
   public JackCard() {
      this.setCardHolder("Default");
      this.setBalence(0);
      this.setDiscountRate(0);x
      this.setPoints(0);
      this.setPin(1234);
   }
   
   public JackCard(String name, double balence, int pin) {
      this.setCardHolder(name);
      this.setBalence(balence);
      this.setPin(pin);
   }
   
   public JackCard(JackCard other) {
      this.setCardHolder(other.getCardHolder());
      this.setBalence(other.getBalence());
      this.setDiscountRate(other.getDiscountRate());
      this.setPoints(other.getPoints());
      this.setPin(other.getPin());
   }
   
   //Mutator
   void setCardHolder(String name) {
      this.cardHolder = name;
   }
   void setBalence(double amt) { 
      this.balence = amt;
   }
   void setDiscountRate(double amt) {
      this.discountRate = amt;
   }
   void setPoints(int amt) {
      this.points = amt;
   }
   void setPin(int num) {
      this.pin = num;
   }
   
   //Accessor
   String getCardHolder() {
      return this.cardHolder;
   }
   double getBalence() {
      return this.balence;
   }
   double getDiscountRate() {
      return this.discountRate;
   }
   int getPoints() {
      return this.points;
   }
   int getPin() {
      return this.pin;
   }
   
   String toString(JackCard c1) {
      return "Card Holder: " + this.getCardHolder() + "\nBalence: " + this.getBalence() + "\nDiscount Rate: " + (100 - (this.getDiscountRate() * 100)) + "Points: " + this.getPoints() + "Pin: " + this.getPin();
   }
   
   //Methods
   double calcDiscount(double num) {
      if (num >= 500) {
         return 0.95;
      } else if (num < 500 && num >= 200) {
         return 0.97;
      } else if (num < 200 && num >= 100) {
         return 0.98;
      } else {
         return 1;
      }
   }
   
   boolean refill(double amt) {
      if (this.getBalence() + amt > maximum) {
         return false;
      } else {
         this.setBalence(this.getBalence() + amt);
         this.setDiscountRate(calcDiscount(this.getBalence()));
         return true;
      }
   }
   
   boolean pay(double amt, int pin, boolean usePoint) {
      if (amt > this.getBalence() || pin != this.getPin()) {
         return false;
      } else {
         if (!usePoint){   
            this.setBalence(this.getBalence() - amt);
            return true;
         } else {
            if (this.getPoints() >= 20) {
               int dollarsOff = this.getPoints() / 20;
               this.setPoints(this.getPoints() % 20);
               this.setBalence(this.getBalence() - (amt + dollarsOff) * this.getDiscountRate());
               return true;
            }
         }
      }
      return false;
   }
   
   JackCard higherBalence (JackCard other) {
      if (this.getBalence() > other.getBalence()) {
         JackCard c3 = new JackCard(this);
         return c3;
      } else {
         JackCard c3 = new JackCard(other);
         return c3;
      }
   }
   
   JackCard morePoints(JackCard other) {
      if (this.getPoints() > other.getPoints()) {
         JackCard c3 = new JackCard(this);
         return c3;
         } else {
            JackCard c3 = new JackCard(other);
            return c3;
         }
      }
   
   public void combinePoints(JackCard other) {
      this.setPoints(this.getPoints() + other.getPoints());
      other.setPoints(0);
   }
   
   boolean changePin(String name, int newPin) {
      if (this.getCardHolder().equals(name)) {
         this.setPin(newPin);
         return true;
      } else {
         return false;
      }
   }
   
}