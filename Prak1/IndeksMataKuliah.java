/**
 * MataKuliah.java
 * [Jelaskan kegunaan class ini]
 * 
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
     * 
     * @param mk
     * @param nama
     * @param nilai
     *                   indeks ditentukan berdasarkan nilai yang diperoleh dengan
     *                   ketentuan sebagai berikut
     *                   A -> nilai = 4
     *                   B -> 3.0 <= nilai < 4.0
     *                   C -> 2.0 <= nilai < 3.0
     *                   D -> 1.0 <= nilai < 2.0
     *                   E -> 0.0 <= nilai < 1.0
     *                   Apabila nilai tidak valid, maka indeks dianggap E dan nilai
     *                   dianggap 0
     */
    public IndeksMataKuliah(MataKuliah mk, String nama, Double nilai) {
    	this.mataKuliah = mk;
    	this.nama = nama;

    	/* Percabangan */
    	if(nilai >= 0.0 && nilai < 1.0){
    		this.indeks = "E";
    		this.nilai = nilai;
    	}
    	else if(nilai >= 1.0 && nilai < 2.0){
    		this.indeks = "D";
    		this.nilai = nilai;
    	}
    	else if(nilai >= 2.0 && nilai < 3.0){
    		this.indeks = "C";
    		this.nilai = nilai;
    	}
    	else if(nilai >= 3.0 && nilai < 4.0){
    		this.indeks = "B";
    		this.nilai = nilai;
    	}
    	else if(nilai == 4.0){
    		this.indeks = "A";
    		this.nilai = nilai;
    	}
    	else{
    		this.indeks = "E";
    		this.nilai = 0.0;
    	}
    }

    /**
     * Getter mataKuliah
     * 
     * @return mataKuliah
     */
    public MataKuliah getMataKuliah() {
    	return mataKuliah;
    }

    /**
     * Getter nama
     * 
     * @return nama
     */
    public String getNama() {
    	return nama;
    }

    /**
     * Getter indeks
     * 
     * @return indeks
     */
    public String getIndeks() {
    	return indeks;
    };

    /**
     * Getter nilai
     * 
     * @return nilai
     */
    public Double getNilai() {
    	return nilai;
    }

    /**
     * Mengubah nilai mahasiswa
     * 
     * @param nilai nilai baru dari mahasiswa
     */
    public void ubahNilai(Double nilai) {
    	if(nilai >= 0.0 && nilai <= 4.0){
    		this.nilai = nilai;
    	}
    	else{
    		this.nilai = 0.0;
    	}
    	updateIndeks(this.nilai);
    }

    /**
     * Update indeks
     * 
     */
    public void updateIndeks(Double nilai) {
    	/* Percabangan */
    	if(nilai >= 0.0 && nilai < 1.0){
    		this.indeks = "E";
    		this.nilai = nilai;
    	}
    	else if(nilai >= 1.0 && nilai < 2.0){
    		this.indeks = "D";
    		this.nilai = nilai;
    	}
    	else if(nilai >= 2.0 && nilai < 3.0){
    		this.indeks = "C";
    		this.nilai = nilai;
    	}
    	else if(nilai >= 3.0 && nilai < 4.0){
    		this.indeks = "B";
    		this.nilai = nilai;
    	}
    	else if(nilai == 4.0){
    		this.indeks = "A";
    		this.nilai = nilai;
    	}
    	else{
    		this.indeks = "E";
    		this.nilai = 0.0;
    	}
    }

    /**
     * Normalisasi nilai
     * 
     * @param countLulus jumlah mahasiswa yang lulus
     * Normalisasi nilai dilakukan dengan menambahkan nilai saat ini dengan 
     * persentase jumlah mahasiswa yang lulus
     * 
     * Contoh: nilai = 2.0, countLulus = 10, kapasitas = 100
     * normalisasi nilai = 2.0 + (2.0 * (25/100)) = 2.5
     * Apabila hasil normalisasi lebih dari 4.0, maka akan dianggap 4
     */
    public void normalisasiNilai(int countLulus) {
    	double norm = nilai + ((nilai * countLulus) / mataKuliah.getKapasitas());
    	if(norm > 4.0){
    		this.ubahNilai(4.0);
    	}
    	else{
    		this.ubahNilai(norm);
    	}
    }

    /**
     * Menghitung kontribusi ke IP
     * Kontribusi ke IP dihitung dari jumlah sks dikali nilai dibagi total sks
     * 
     * @param sks total sks mahasiswa
     */
    public Double kontribusiIP(int sks) {
    	int mkSks = mataKuliah.getSks();
    	return (mkSks* nilai) / sks;
    }
}
