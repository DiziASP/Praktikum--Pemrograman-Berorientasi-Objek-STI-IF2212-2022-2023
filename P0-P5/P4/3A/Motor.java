/**
 * Motor.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */
public class Motor {
    private int numberOfWheels;
    private Engine engine;
    private Tyre tyre;
  
    public Motor(int numberOfWheels, Engine engine, Tyre tyre) {
       this.numberOfWheels = numberOfWheels;
       this.engine = engine;
       this.tyre = tyre;
    }

    public void setEngine(Engine engine) {
        // Mengeset mesin motor
        this.engine = engine;
    }

    public void setTyre(Tyre tyre) {
        // Mengeset ban motor
        this.tyre = tyre;
    }

    public int getNumberOfWheels() {
        //Mengembalikan nilai dari numberOfWheels
        return this.numberOfWheels;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Tyre getTyre() {
        return this.tyre;
    }
    
    public String sound(){
        //Mengembalikan string berisi suara mesin
        return this.engine.sound();
    }

    public String printDescription(){
        //Mengembalikan string berformat "Motor ini memiliki a roda dengan kapasitas mesin b cc", dimana a adalah numberOfWheels dan b adalah engineCapacity
        // Tidak perlu diberi new line
        return String.format("Motor ini memiliki %d roda dengan kapasitas mesin %d cc", this.numberOfWheels, this.engine.getEngineCapacity());
    }
}