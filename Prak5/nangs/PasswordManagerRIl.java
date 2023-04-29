package Prak6.nangs;

import java.util.ArrayList;

public class PasswordManagerRIl {
    /**
     * Atribut yang menyimpan password yang telah dienkripsi
     */
    private static ArrayList<String> passwords;
    private static ArrayList<Integer> shifts;

    /**
     * Konstruktor untuk PasswordManager
     * Inisialisasi array list passwords dan shifts
     */
    public PasswordManagerRIl() {

    }

    /**
     * Asumsi seluruh input a-z
     * Enkripsi dilakukan dengan cara menggeser karakter sebanyak shift
     * Contoh: encrypt(qwerty,2) = sygtva
     * Anda diizinkan untuk membuat fungsi helper dengan akses private
     * yang melakukan shifting dari suatu character
     * 
     * @param password, password yang akan dienkripsi
     * @param shift,    jumlah pergeseran
     */
    public static StringBuilder encrypt(String password, int shift) {

    }

    /**
     * Dekripsi password yang sudah dienkrip
     * 
     * @param password
     * @param shift
     */
    public static StringBuilder decrypt(String password, int shift) {

    }

    /**
     * Method untuk menambahkan password baru
     * Gunakan method encrypt
     * 
     * @param password password baru yang akan ditambahkan
     * @param shift    jumlah shift enkripsi
     */
    public static void addPassword(String password, int shift) {

    }

    /**
     * Method untuk mengambil password
     * 
     * @param index indeks password yang akan diambil
     */
    public static String retrievePassword(int indeks) {

    }
}
