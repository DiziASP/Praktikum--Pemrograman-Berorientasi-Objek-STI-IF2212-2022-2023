/**
 * Car.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */
public class Car {
    private int numberOfWheels;
    private Engine engine;
    private Tyre tyre;

    public Car(int numberOfWheels, Engine engine, Tyre tyre) {
        this.numberOfWheels = numberOfWheels;
        this.engine = engine;
        this.tyre = tyre;
    }
  
    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setEngine(Engine engine) {
        // Mengeset mesin mobil
        this.engine = engine;
    }

    public void setTyre(Tyre tyre) {
        // Mengeset ban mobil
        this.tyre = tyre;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Tyre getTyre() {
        return this.tyre;
    }
    
    public String sound(){
        return this.engine.sound();
    }

    public Boolean isRacingCar() {
        return this.tyre.isSlickTyre();
    }

    public String printDescription(){
        if (isRacingCar()) {
            return String.format("Mobil balap ini memiliki %d roda dengan kapasitas mesin %d cc", this.numberOfWheels, this.engine.getEngineCapacity());
        }
        
        return String.format("Mobil ini memiliki %d roda dengan kapasitas mesin %d cc", this.numberOfWheels, this.engine.getEngineCapacity());
    }
}

