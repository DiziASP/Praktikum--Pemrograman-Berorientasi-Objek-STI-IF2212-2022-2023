/**
 * Serigala.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public class Serigala extends Animal {

    private long basePower;
    private boolean kawanan;

    public Serigala(long basePower, boolean kawanan) {
        super(4);
        this.basePower = basePower;
        this.kawanan = kawanan;
    }

    private boolean hasKawanan(){
        return this.kawanan;
    }

    @Override
    public long getAnimalPower() {
        if (hasKawanan()){
            if (getNumberOfChildren() == 0){
                return basePower;
            } else {
                return basePower * 3 * getNumberOfChildren();
            } 
        } else {
            return basePower;
        }
    }
}
