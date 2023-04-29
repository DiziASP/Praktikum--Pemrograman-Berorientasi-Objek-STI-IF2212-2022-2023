/**
 * Elang.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public class Elang extends Animal {

    private long basePower;
    private int jumlahTelur;

    public Elang(long basePower) {
        super(2);
        this.basePower = basePower;
        this.jumlahTelur = 0;
    }

    public int getJumlahTelur(){
        return this.jumlahTelur;
    }

    public void bertelur(){
        this.jumlahTelur ++;
    }

    @Override
    public long getAnimalPower() {
        return this.basePower * getNumberOfChildren() - getJumlahTelur();
    }
}
