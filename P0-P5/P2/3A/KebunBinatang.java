import java.lang.System;
import java.util.Scanner;

public class KebunBinatang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();

        if (type == 1) {
            int numChildren = input.nextInt();
            int jumlahTelur = input.nextInt();
            Elang elang = new Elang(5);

            for (int i = 0; i < jumlahTelur; i++) {
                elang.bertelur();
            }

            elang.increaseChild(numChildren);

            System.out.println(elang.toString());
            System.out.println("Jumlah Telur: " + jumlahTelur);
            System.out.println("Animal Power: " + elang.getAnimalPower());
        } else if (type == 2) {
            int numChildren = input.nextInt();
            int jumlahGading = input.nextInt();
            Gajah gajah = new Gajah(10, jumlahGading);

            gajah.increaseChild(numChildren);

            System.out.println(gajah.toString());
            System.out.println("Jumlah Gading: " + gajah.getJumlahGading());
            System.out.println("Animal Power: " + gajah.getAnimalPower());

        } else {
            int numChildren = input.nextInt();
            boolean isPack = input.nextBoolean();
            Serigala serigala = new Serigala(10, isPack);

            serigala.increaseChild(numChildren);

            System.out.println(serigala.toString());
            if (isPack) {
                System.out.println("Serigala berada di dalam kawanan"); 
            } else {
                System.out.println("Serigala tidak berada di dalam kawanan");
            }
            
            System.out.println("Animal Power: " + serigala.getAnimalPower());
        }

        input.close();
    }
}
