package Prak3;

/*
  Nama      : Raden Dizi Assyafadi Putra
  NIM       : 18221155
  Deskripsi : Nomor 1 - Interface Calculator
*/
public interface Calculator {
  /**
   * Menambahkan operan
   * 
   * @param a
   * @param b
   * @return hasil
   */
  public int add(int a, int b);

  /**
   * Mengurangi operan
   * 
   * @param a
   * @param b
   * @return hasil
   */
  public int substract(int a, int b);

  /**
   * Mengali operan
   * 
   * @param a
   * @param b
   * @return hasil
   */
  public int multiply(int a, int b);

  /**
   * Membagi operan
   * 
   * @param a
   * @param b
   * @return hasil
   */
  public double divide(int a, int b);

  /**
   * Memulai Kalkulator
   *
   */
  public void start();

  /**
   * Mematikan Kalkulator
   *
   */
  public void stop();

  /**
   * Check Battery Kalkulator
   *
   */
  public int checkBattery();
}
