import java.util.*;

public class Closet {
   public static int maxShirts;
   public static int numShirts;
   Shirt shirt[];
   
   public Closet(int capacity) {
      maxShirts = capacity;
      shirt = new Shirt[maxShirts];
      numShirts = 0;
   }
   
   public boolean addShirt(Shirt a) {
      if (numShirts < maxShirts) {
         shirt[numShirts] = new Shirt(a.getColor(), a.getSize(), a.getYear());
         numShirts++;
         return true;
      } else {
         return false;
      }
   }
   
   public boolean removeOldestShirt() {
      int temp;
      if (numShirts == 0) {
         return false;
      } else if (numShirts == 1) {
         numShirts--;
         return true;
      }
      for (int i = 0; i < numShirts - 1; i++) {
         if (shirt[i].getYear() > shirt[i+1].getYear()) {
            temp = shirt[i].getYear();
            shirt[i].setYear(shirt[i+1].getYear());
            shirt[i+1].setYear(temp);
         }
      }
      numShirts--;
      return true;
   }
   
   public int givenSize(int size) {
      int count = 0;
      for (int i = 0; i < numShirts; i++) {
         if (shirt[i].getSize() == size) {
            count++;
         }
      } 
      return count;
   }
      
   public Shirt biggestShirt() {
      Shirt biggest = shirt[0];
      for (int i = 0; i < numShirts; i++) {
         if (shirt[i].compareToSize(biggest) > 0) {
            biggest = shirt[i];
         }
      } 
      return biggest;
   }
   
   public Shirt newestShirt() {
      Shirt newest = shirt[0];
      for (int i = 0; i < numShirts; i++) {
         if (shirt[i].compareToAge(newest) > 0) {
            newest = shirt[i];
         }
      } 
      return newest;
   }
   
}