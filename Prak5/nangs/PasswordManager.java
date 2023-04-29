package Prak6.nangs;

import java.util.ArrayList;

public class PasswordManager {
    /**
     * Atribut yang menyimpan password yang telah dienkripsi
     */
    private static ArrayList<String> passwords;
    private static ArrayList<Integer> shifts;

    /**
     * Konstruktor untuk PasswordManager
     * Inisialisasi array list passwords dan shifts
     */
    public PasswordManager() {
        passwords = new ArrayList<String>();
        shifts = new ArrayList<Integer>();
    }

    /**
     * Fungsi helper untuk melakukan shifting dari suatu character
     * 
     * @param c     karakter yang akan digeser
     * @param shift jumlah pergeseran
     * @return karakter yang telah digeser
     */
    private static char shiftCharacter(char c, int shift) {
        if (!Character.isLowerCase(c)) {
            return c;
        }
        int code = (int) c;
        code = ((code - 97 + shift) % 26) + 97;
        return (char) code;
    }

    /**
     * Asumsi seluruh input a-z
     * Enkripsi dilakukan dengan cara menggeser karakter sebanyak shift
     * Contoh: encrypt(qwerty,2) = sygtva
     * 
     * @param password password yang akan dienkripsi
     * @param shift    jumlah pergeseran
     * @return password yang telah dienkripsi
     */
    public static StringBuilder encrypt(String password, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            encrypted.append(shiftCharacter(c, shift));
        }
        return encrypted;
    }

    /**
     * Dekripsi password yang sudah dienkrip
     * 
     * @param password password yang akan didekripsi
     * @param shift    jumlah pergeseran
     * @return password yang telah didekripsi
     */
    public static StringBuilder decrypt(String password, int shift) {
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            decrypted.append(shiftCharacter(c, 26 - shift));
        }
        return decrypted;
    }

    /**
     * Method untuk menambahkan password baru
     * Gunakan method encrypt
     * 
     * @param password password baru yang akan ditambahkan
     * @param shift    jumlah shift enkripsi
     */
    public static void addPassword(String password, int shift) {
        passwords.add(encrypt(password, shift).toString());
        shifts.add(shift);
    }

    /**
     * Method untuk mengambil password
     * 
     * @param index indeks password yang akan diambil
     * @return password pada indeks tertentu yang telah didekripsi
     */
    public static String retrievePassword(int index) {
        return decrypt(passwords.get(index), shifts.get(index)).toString();
    }
}
