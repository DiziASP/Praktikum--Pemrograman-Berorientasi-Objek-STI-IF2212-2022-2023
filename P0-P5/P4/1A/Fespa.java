/**
 * Fespa.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */
public class Fespa extends Motor{
    private String color;
    private Boolean isRoundedFrontLamp;

    public Fespa(int numberOfWheels,int engineCapacity, String color, Boolean isRoundedFrontLamp) {
        super(numberOfWheels,engineCapacity);
        this.color=color;
        this.isRoundedFrontLamp=isRoundedFrontLamp;
    }

    public String getColor(){
        return this.color;
    }

    public Boolean getLampShape(){
        return this.isRoundedFrontLamp;
    }
    
    @Override
    public String sound(){
        return "Trototong";
    }

    @Override
    public String printDescription(){
        if(isRoundedFrontLamp){
            return String.format("Motor ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki warna %s, dan memiliki lampu depan berbentuk lingkaran", super.getNumberOfWheels(), super.getEngineCapacity(),this.color);
        }else{
            return String.format("Motor ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki warna %s, dan memiliki lampu depan berbentuk persegi panjang", super.getNumberOfWheels(), super.getEngineCapacity(),this.color);
        }
    }
}
