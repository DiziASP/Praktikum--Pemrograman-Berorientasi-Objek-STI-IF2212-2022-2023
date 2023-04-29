/**
 * Car.java
 * 
 * 
 * @author
 */

public abstract class Car {
    private int numberOfWheels;
    private long mileage;

    public Car(int numberOfWheels) {
        // Konstruktor, set mileage = 0
        this.numberOfWheels = numberOfWheels;
        this.mileage = 0;

    }

    public int getNumberOfWheels() {
        // Mengembalikan atribut numberOfWheels
        return numberOfWheels;
    }

    public long getMileage() {
        // Mengembalikan atribut mileage
        return mileage;
    }

    public void increaseMileage(long increment) {
        // Meningkatkan nilai atribut mileage
        this.mileage += increment;

    }

    public String toString() {
        // Mengembalikan informasi mobil dengan format: "Number of Wheels:
        // {numberOfWheels}, Mileage: {mileage}"
        return "Number of Wheels: " + numberOfWheels + ", Mileage: " + mileage;
    }

    public abstract long getPrice();
}