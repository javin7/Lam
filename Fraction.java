public class Fraction {

   private int num;
   private int den;
   
   
   //Get & Set methods
   public int getNum() {
      return this.num;
   }
   
   public int getDen() {
      return this.den;
   }
   
   public void setNum(int num) {
      this.num = num;
   }
   
   public void setDen(int den) {
   if (den == 0) {
      System.out.println("You cannot set denominator to 0!");
   } else {
      this.den = den;
      }
   }

   public Fraction times(Fraction other) {
      Fraction result = new Fraction();
      result.num = this.num * other.num;
      result.den = this.den * other.den;
      return result; 
   }
   
   public Fraction plus (Fraction other) {
      Fraction result = new Fraction();
      result.num = this.num * other.den + other.num * this.den;
      result.den =  this.den * other.den;
      return result;
   }
   
   public void timesEquals(Fraction p) {
      this.num = this.num * p.num;
      this.den = this.den * p.den;
   }

   
   public void reduce() {
      for(int i = 1; i <= this.num; i++) {
         if (this.num % i == 0 && this.den % i == 0) {
            this.num = this.num / i;
            this.den = this.den / i;
         }
      }
   }
   
   
   
   public static void main(String[] args) {
      Fraction n1 = new Fraction();
      n1.setNum(98);
      n1.setDen(100);
      System.out.println(n1.getNum());
      System.out.println(n1.getDen());
      n1.reduce();
      System.out.println(n1.getNum());
      System.out.println(n1.getDen());
   }
}