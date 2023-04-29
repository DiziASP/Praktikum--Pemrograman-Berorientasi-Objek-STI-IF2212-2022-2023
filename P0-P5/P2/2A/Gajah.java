/**
 * Gajah.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public class Gajah extends Animal {

    private long basePower;
    private long jumlahGading;

    public Gajah(long basePower, int jumlahGading) {
        super(4);
        this.basePower = basePower;
        
        if (jumlahGading > 2){
            this.jumlahGading = 2;
        }else if (jumlahGading < 0){
            this.jumlahGading = 0;
        }
        else {
            this.jumlahGading = jumlahGading;
        }
    }

    public long getJumlahGading(){
        return this.jumlahGading;
    }

    @Override
    public long getAnimalPower() {
        return 3 * basePower * (1 + getJumlahGading());
    }
}
