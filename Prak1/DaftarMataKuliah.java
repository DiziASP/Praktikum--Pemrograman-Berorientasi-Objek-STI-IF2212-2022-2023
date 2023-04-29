import java.util.Scanner;

public class DaftarMataKuliah {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String kode = input.next();
		String nama = input.next();
		int sks = input.nextInt();
		String dosen = input.next();
		int kapasitas = input.nextInt();
		int tambah = input.nextInt();
		input.close();

		MataKuliah mataKuliah = new MataKuliah(kode, nama, sks, dosen, kapasitas);

		System.out.println("Kode Mata Kuliah: " + mataKuliah.getKode());
		System.out.println("Nama Mata Kuliah: " + mataKuliah.getNama());
		System.out.println("SKS Mata Kuliah: " + mataKuliah.getSks());
		System.out.println("Nama Dosen: " + mataKuliah.getDosen());
		System.out.println("Kapasitas Kuliah: " + mataKuliah.getKapasitas());

		mataKuliah.tambahKapasitas(tambah);
		System.out.println("Total Revisi Kapasitas Kuliah: " + mataKuliah.getKapasitas());

	}
}