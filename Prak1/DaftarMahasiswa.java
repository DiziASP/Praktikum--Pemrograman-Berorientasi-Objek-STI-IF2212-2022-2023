
/**
 * IPMahasiswa.java
 * [Jelaskan kegunaan class ini]
 * 
 * @author [NIM] [Nama]
 */

import java.util.Scanner;

public class DaftarMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        String nim = input.nextLine();
        int sks = input.nextInt();
        int addSKS = input.nextInt();
        input.close();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, sks);

        System.out.println("Nama mahasiswa: " + mahasiswa.getNama());
        System.out.println("NIM mahasiswa: " + mahasiswa.getNim());
        System.out.println("SKS mahasiswa: " + mahasiswa.getSks());
        System.out.println("Jumlah mahasiswa: " + Mahasiswa.getJumlahMahasiswa());

        mahasiswa.tambahSks(addSKS);
        System.out.println("Total Revisi SKS mahasiswa: " + mahasiswa.getSks());
    }
}