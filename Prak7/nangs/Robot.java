package Prak7.nangs;

/**
 * Jangan lupa tambahkan kata kunci untuk menghandle exception
 */
public class Robot {
    /**
     * Tambahkan atribut kelas disini
     */
    private int x;
    private int y;

    public Robot() {
        /**
         * Konstruktor
         * Jangan lupa inisialisasi atribut kelas
         */
        this.x = 0;
        this.y = 0;
    }

    public void walk(int x, int y) throws Exception {
        /**
         * Implementasi
         * Apabila hasil penambahan x atau y melebihi 10, dilempar sebuah exception
         * dengan pesan "Tidak bisa jalan". Atribut tidak ditambahkan pada kasus ini.
         * 
         * Apabila input valid, tambahkan nilai atribut dan print pesan
         * "Sedang berjalan menuju (x, y)"
         */
        if (this.x + x > 10 || this.y + y > 10) {
            throw new Exception("Tidak bisa jalan");
        }
        this.x += x;
        this.y += y;
        System.out.println("Sedang berjalan menuju (" + this.x + ", " + this.y + ")");
    }

    public void talk(String language) throws Exception {
        /**
         * Implementasi
         * Apabila input bukan "Indonesia" atau "Inggris", lempar exception dengan pesan
         * "Tidak bisa berbicara dalam bahasa {language}"
         * 
         * Apabila input valid, print pesan "Sedang berbicara dalam bahasa {language}"
         */
        if (!language.equals("Indonesia") && !language.equals("Inggris")) {
            throw new Exception("Tidak bisa berbicara dalam bahasa " + language);
        }
        System.out.println("Sedang berbicara dalam bahasa " + language);
    }

    public void receiveCommand(String command) throws Exception {
        /**
         * Implementasi
         * Apabila input bukan "walk" atau "talk", lempar exception "Perintah {command}
         * tidak dikenal"
         */
        if (!command.equals("walk") && !command.equals("talk")) {
            throw new Exception("Perintah " + command + " tidak dikenal");
        }
    }
}