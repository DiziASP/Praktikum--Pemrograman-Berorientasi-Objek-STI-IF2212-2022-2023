/**
 * FCX.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */
public class FCX extends Motor{
    private int luggageCapacity;
    private Boolean isIdleStoping;

    public FCX(int numberOfWheels,int engineCapacity, int luggageCapacity, Boolean isIdleStoping) {
        super(numberOfWheels,engineCapacity);
        this.luggageCapacity=luggageCapacity;
        this.isIdleStoping=isIdleStoping;
    }

    public int getLuggageCapacity(){
        return this.luggageCapacity;
    }

    public Boolean getStoppingStatus(){
        return this.isIdleStoping;
    }    

    @Override
    public String sound(){
        return "Brmmm";
    }

    @Override
    public String printDescription(){
        if(isIdleStoping){
            return String.format("Motor ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki kapasitas bagasi %d liter, dan sedang dapat berhenti otomatis apabila didiamkan", super.getNumberOfWheels(), super.getEngineCapacity(),this.luggageCapacity);
        }else{
            return String.format("Motor ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki kapasitas bagasi %d liter, dan sedang tidak dapat berhenti otomatis apabila didiamkan", super.getNumberOfWheels(), super.getEngineCapacity(),this.luggageCapacity);
        }
    }
}
