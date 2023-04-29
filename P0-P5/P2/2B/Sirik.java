/**
 * Sirik.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public class Sirik extends Robot {

    private long price;
    private int totalModel;

    public Sirik(long price) {
        super(5, false);
        this.price = price;
        this.totalModel = 1;
    }

    public int getTotalModel(){
        return this.totalModel;
    }

    public void addModel(){
        this.totalModel ++;
    }

    @Override
    public long getPrice() {
        if (getTotalModel() <= 2){
            return this.price + (500 * getNumberOfParts() * getTotalModel());
        }else{
            return this.price + (500 * getNumberOfParts() - (100 * getTotalModel()));
        }
    }
}
