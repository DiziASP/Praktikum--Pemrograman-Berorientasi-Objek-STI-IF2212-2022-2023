/**
 * DuniaRobot.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

import java.lang.System;
import java.util.Scanner;


public class DuniaRobot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();

        if (type == 1) {
            int numberOfParts = input.nextInt();
            int totalTransformation = input.nextInt();
            boolean isActive = input.nextBoolean();

            Bumblebee bb = new Bumblebee(numberOfParts, isActive);

            for (int i = 0; i < totalTransformation; i++) {
                bb.addTransformation();
            }

            System.out.println(bb.toString());
            System.out.println("Jumlah transformasi: " + bb.getTotalTransformation());
            System.out.println("Harga robot: " + bb.getPrice());

        } else if (type == 2) {
            int price = input.nextInt();
            int totalModel = input.nextInt();

            Sirik sirik = new Sirik(price);

            for (int i = 0; i < totalModel; i++) {
                sirik.addModel();
            }

            System.out.println(sirik.toString());
            System.out.println("Jumlah model: " + sirik.getTotalModel());
            System.out.println("Harga robot: " + sirik.getPrice());

        } else {
            long mileage = input.nextLong();
            boolean isActive = input.nextBoolean();

            WallE wallE = new WallE(mileage, isActive);

            System.out.println(wallE.toString());
            System.out.println("Jumlah mileage: " + wallE.getMileage());
            System.out.println("Harga robot: " + wallE.getPrice());
        }

        input.close();
    }
}
