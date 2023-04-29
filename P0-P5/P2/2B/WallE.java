/**
 * WallE.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public class WallE extends Robot {

    private long mileage;

    public WallE(long mileage, boolean isActive) {
        super(10, isActive);
        this.mileage = mileage;
    }

    public long getMileage(){
        return this.mileage;
    }

    public void addMileage(long increment){
        this.mileage += increment;
    }

    @Override
    public long getPrice() {
        if (getIsActive()){
            return getMileage() * 1000;
        }else{
            return getMileage() * 1000 + 500;
        }
    }
}