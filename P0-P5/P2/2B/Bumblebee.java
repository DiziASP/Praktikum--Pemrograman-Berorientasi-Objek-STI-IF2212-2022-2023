/**
 * Bumblebee.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public class Bumblebee extends Robot {

    private int totalTransformation;

    public Bumblebee(int numberOfParts, boolean isActive) {
        super(numberOfParts,isActive);
        this.totalTransformation = 1;
    }

    public int getTotalTransformation(){
        return this.totalTransformation;
    }

    public void addTransformation(){
        this.totalTransformation ++;
    }

    @Override
    public long getPrice() {
        if (getIsActive()){
            return getNumberOfParts() * 1000 * getTotalTransformation();
        }else{
            return getNumberOfParts() * 1000;
        }
    }
}