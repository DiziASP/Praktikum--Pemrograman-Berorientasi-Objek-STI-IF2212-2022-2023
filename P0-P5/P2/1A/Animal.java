/**
 * Animal.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

 public abstract class Animal {
  private int numberOfLegs;
  private long children;

  public Animal(int numberOfLegs) {
      this.numberOfLegs = numberOfLegs;
      this.children = 0;
  }

  public int getNumberOfLegs() {
      return this.numberOfLegs;
  }

  public long getNumberOfChildren() {
      return this.children;
  }

  public void increaseChild(long inc) {
      this.children += inc;
  }

  public String toString() {
      return String.format("Number of Legs: %d, Child: %d", this.numberOfLegs, this.children);
  }

  public abstract long getAnimalPower();
}
