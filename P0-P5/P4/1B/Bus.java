/**
 * Bus.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */
public class Bus extends Car{
    private int passengerCapacity;
    private Boolean isUsedForLongTrip;

    public Bus(int numberOfWheels,int engineCapacity, int passengerCapacity, Boolean isUsedForLongTrip) {
        super(numberOfWheels,engineCapacity);
        this.passengerCapacity=passengerCapacity;
        this.isUsedForLongTrip=isUsedForLongTrip;
    }

    public int getPassengerCapacity(){
        return this.passengerCapacity;
    }

    public Boolean getLongTripStatus(){
        return this.isUsedForLongTrip;
    }    

    @Override
    public String sound(){
        return "Cesss";
    }

    @Override
    public String honk(){
        return "Notnot";
    }

    @Override
    public String printDescription(){
        if(isUsedForLongTrip){
            return String.format("Mobil ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki kapasitas penumpang %d orang, dan digunakan untuk perjalanan jauh", super.getNumberOfWheels(), super.getEngineCapacity(),this.passengerCapacity);
        }else{
            return String.format("Mobil ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki kapasitas penumpang %d orang, dan tidak digunakan untuk perjalanan jauh", super.getNumberOfWheels(), super.getEngineCapacity(),this.passengerCapacity);
        }
    }
}
