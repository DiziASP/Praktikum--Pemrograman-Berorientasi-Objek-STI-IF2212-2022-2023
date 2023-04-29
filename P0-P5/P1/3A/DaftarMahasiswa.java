import java.lang.System;
import java.util.Scanner;

public class DaftarMahasiswa {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String nama_mahasiswa=input.nextLine();
        String nim_mahasiswa=input.nextLine();
        int sks_mahasiswa=Integer.parseInt(input.nextLine());
        int tambah_sks=Integer.parseInt(input.nextLine());

        Mahasiswa siswa=new Mahasiswa(nama_mahasiswa,nim_mahasiswa,sks_mahasiswa);
        System.out.println("Nama mahasiswa: "+siswa.getNama());
        System.out.println("NIM mahasiswa: "+siswa.getNim());
        System.out.println("SKS mahasiswa: "+siswa.getSks());
        System.out.println("Jumlah mahasiswa: "+Mahasiswa.getJumlahMahasiswa());
        siswa.tambahSks(tambah_sks);
        System.out.println("Total Revisi SKS mahasiswa: "+siswa.getSks());
    }
}
