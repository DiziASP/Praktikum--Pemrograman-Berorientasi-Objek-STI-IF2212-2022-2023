package Prak7.nangs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Hint 1: Untuk mendapatkan input dari user, umumnya bisa dengan memasukkan
        // parameter System.in
        // ke dalam konstruktor Scanner.

        // Hint 2: Pengambilan double dari input bisa menggunakan method nextDouble()
        // dari scanner
        // Namun perlu diperhatikan bahwa nextDouble() tidak mengkonsumsi newline
        // karakter dari input
        // Sehingga apabila ingin menggunakan method nextLine() untuk mengambil String
        // setelah pemanggilan method nextDouble(), harus memanggil nextLine() dahulu
        // untuk menghabisi sisa baris input dari nextDouble().
        try {
            Scanner scanner = new Scanner(System.in);
            double x = scanner.nextDouble();
            scanner.nextLine();
            double y = scanner.nextDouble();
            scanner.nextLine();
            String op = scanner.nextLine();
            scanner.close();

            Calculator calc = new Calculator();
            System.out.println(calc.calculate(x, y, op));
        } catch (InvalidOperationException e) {
            System.out.println(e.getClass().getSimpleName() + "! " + e.getMessage());

        } catch (InvalidDivisionByZero e) {
            System.out.println(e.getClass().getSimpleName() + "! " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unknown exception!");
        } finally {
            System.out.println("Calculated.");
        }
    }

}