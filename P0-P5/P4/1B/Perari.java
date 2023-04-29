/**
 * Perari.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */
public class Perari extends Car{
    private int averageSpeed;
    private Boolean isInsuranced;

    public Perari(int numberOfWheels,int engineCapacity, int averageSpeed, Boolean isInsuranced) {
        super(numberOfWheels,engineCapacity);
        this.averageSpeed=averageSpeed;
        this.isInsuranced=isInsuranced;
    }

    public int getAverageSpeed(){
        return this.averageSpeed;
    }

    public Boolean getInsuranceStatus(){
        return this.isInsuranced;
    }    

    @Override
    public String sound(){
        return "Brmmm";
    }

    @Override
    public String honk(){
        return "Siuuu";
    }

    @Override
    public String printDescription(){
        if(isInsuranced){
            return String.format("Mobil ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki kecepatan rata-rata %d km/h, dan sedang dalam perlindungan asuransi", super.getNumberOfWheels(), super.getEngineCapacity(),this.averageSpeed);
        }else{
            return String.format("Mobil ini memiliki %d roda dengan kapasitas mesin %d cc, memiliki kecepatan rata-rata %d km/h, dan sedang tidak dalam perlindungan asuransi", super.getNumberOfWheels(), super.getEngineCapacity(),this.averageSpeed);
        }
    }
}


