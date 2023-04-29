import java.lang.System;
import java.util.Scanner;

public class DaftarMataKuliah {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String kode_kuliah, nama_kuliah, nama_dosen;
        int sks_kuliah, kapasitas_kuliah, tambah_kapasitas;

        kode_kuliah=input.nextLine();
        nama_kuliah=input.nextLine();
        sks_kuliah=Integer.parseInt(input.nextLine());
        nama_dosen=input.nextLine();
        kapasitas_kuliah=Integer.parseInt(input.nextLine());
        tambah_kapasitas=Integer.parseInt(input.nextLine());

        MataKuliah matkul=new MataKuliah(kode_kuliah, nama_kuliah, sks_kuliah, nama_dosen, kapasitas_kuliah);
        System.out.println("Kode Mata Kuliah: "+matkul.getKode());
        System.out.println("Nama Mata Kuliah: "+matkul.getNama());
        System.out.println("SKS Mata Kuliah: "+matkul.getSks());
        System.out.println("Nama Dosen: "+matkul.getDosen());
        System.out.println("Kapasitas Kuliah: "+matkul.getKapasitas());
        matkul.tambahKapasitas(tambah_kapasitas);
        System.out.println("Total Revisi Kapasitas Kuliah: "+matkul.getKapasitas());
    }
}
