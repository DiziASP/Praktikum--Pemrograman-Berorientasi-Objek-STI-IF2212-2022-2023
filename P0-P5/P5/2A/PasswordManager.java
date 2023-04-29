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

    // asisten only
    private static char helperShifter(char x, int y) {
        for (int i=0; i<y; i++) {
            if (x=='z') x = 'a';
            else x = ((char) (x+1));
        }
        return x;
    }
    private static char helperUnshifter(char x, int y) {
        for (int i=0; i<y; i++) {
            if (x=='a') x = 'z';
            else x = ((char) (x-1));
        }
        return x;
    }

    /**
     * Asumsi seluruh input a-z
     * Enkripsi dilakukan dengan cara menggeser karakter sebanyak shift
     * Contoh: encrypt(qwerty,2) = sygtva
     * Anda diizinkan untuk membuat fungsi helper dengan akses private
     * yang melakukan shifting dari suatu character
     * @param password, password yang akan dienkripsi
     * @param shift, jumlah pergeseran
     */
    public static StringBuilder encrypt(String password, int shift) {
        StringBuilder encryptedPassword = new StringBuilder(password);
        for (int i=0; i<encryptedPassword.length(); i++) {
            encryptedPassword.setCharAt(i, helperShifter(encryptedPassword.charAt(i), shift));
        }
        return encryptedPassword;
    }

    /**
     * Dekripsi password yang sudah dienkrip
     * @param password
     * @param shift
     */
    public static StringBuilder decrypt(String password, int shift) {
        StringBuilder decryptedPassword = new StringBuilder(password);
        for (int i=0; i<decryptedPassword.length(); i++) {
            decryptedPassword.setCharAt(i, helperUnshifter(decryptedPassword.charAt(i), shift));
        }
        return decryptedPassword;
    }

    /**
     * Method untuk menambahkan password baru
     * Gunakan method encrypt
     * @param password password baru yang akan ditambahkan
     * @param shift jumlah shift enkripsi
     */
    public static void addPassword(String password, int shift) {
        passwords.add(encrypt(password, shift).toString());
        shifts.add(shift);
    }

    /**
     * Method untuk mengambil password
     * @param index indeks password yang akan diambil
     */
    public static String retrievePassword(int indeks) {
        String password = passwords.get(indeks);
        int shift = shifts.get(indeks);
        return decrypt(password, shift).toString();
    }
}
