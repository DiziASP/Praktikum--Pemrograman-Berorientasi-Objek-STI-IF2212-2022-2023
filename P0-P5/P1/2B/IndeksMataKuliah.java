/**
 * MataKuliah.java
 * [Jelaskan kegunaan class ini]
 * @author [NIM] [Nama]
 */

public class IndeksMataKuliah {
    // Deklarasi atribut
    private MataKuliah mataKuliah;
    private String nama;
    private String indeks;
    private Double nilai;

    /**
     * Konstruktor
     * @param mataKuliah
     * @param nama
     * @param nilai
     * indeks ditentukan berdasarkan nilai yang diperoleh dengan ketentuan sebagai berikut
     * A -> nilai = 4
     * B -> 3.0 <= nilai < 4.0 
     * C -> 2.0 <= nilai < 3.0 
     * D -> 1.0 <= nilai < 2.0 
     * E -> 0.0 <= nilai < 1.0 
     * Apabila nilai tidak valid, maka indeks dianggap E dan nilai dianggap 0
     */
    public IndeksMataKuliah(MataKuliah mataKuliah, String nama, Double nilai) {
        this.mataKuliah = mataKuliah;
        this.nama = nama;
        if (nilai > 4.0 || nilai < 0.0) {this.nilai = 0.0;}
        else {this.nilai = nilai;}
        updateIndeks(nilai);
    }

    /**
     * Getter mataKuliah
     * 
     * @return mataKuliah
     */
    public MataKuliah getMataKuliah() {
        return this.mataKuliah;
    }

    /**
     * Getter nama
     * @return nama
     */
    public String getNama() {
        return this.nama;
    }

    /**
     * Getter indeks
     * @return indeks
     */
    public String getIndeks() {
        return this.indeks;
    };

    /**
     * Getter nilai
     * @return nilai
     */
    public Double getNilai() {
        return this.nilai;
    }

    /**
     * Mengubah nilai mahasiswa
     * 
     * @param nilai nilai baru dari mahasiswa
     */
    public void ubahNilai(Double nilai) {
        if (nilai > 4.0 || nilai < 0.0) {
            this.nilai = 0.0;
        } else {
            this.nilai = nilai;
        }
        updateIndeks(nilai);
    }

    /**
     * Update indeks
     * 
     */
    public void updateIndeks(Double nilai) {
        if (nilai >= 0.0 && nilai < 1.0) {
            this.indeks = "E";
        } else if (nilai >= 1.0 && nilai < 2.0) {
            this.indeks = "D";
        } else if (nilai >= 2.0 && nilai < 3.0) {
            this.indeks = "C";
        } else if (nilai >= 3.0 && nilai < 4.0) {
            this.indeks = "B";
        } else if (nilai == 4.0) {
            this.indeks = "A";
        } else {
            this.indeks = "E";
        }
    }

    /**
     * Normalisasi nilai
     * 
     * @param countLulus jumlah mahasiswa yang lulus
     * Normalisasi nilai dilakukan dengan menambahkan nilai saat ini dengan 
     * persentase jumlah mahasiswa yang lulus
     * 
     * Apabila hasil normalisasi lebih dari 4.0, maka akan dianggap 4
     */
    public void normalisasiNilai(int countLulus) {
        Double newNilai;
        newNilai = this.nilai + (this.nilai * countLulus) / this.mataKuliah.getKapasitas();

        if (newNilai > 4.0) {this.nilai = 4.0; updateIndeks(4.0);} 
        else {this.nilai = newNilai; updateIndeks(newNilai);}

    }
    
    /**
     * Menghitung kontribusi ke IP
     * Kontribusi ke IP dihitung dari jumlah sks dikali nilai dibagi total sks
     * 
     * @param sks total sks mahasiswa
     */
    public Double kontribusiIP (int sks) {
        return (this.mataKuliah.getSks() * nilai)/sks ;
    }
}
