import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Baris pertama
        int balance = scanner.nextInt();
        DebitCard debitCard = new DebitCard(balance); // Buat objek debitCard

        // Baris kedua
        int transactionTotal = scanner.nextInt();
        Thread[] threads = new Thread[transactionTotal]; // Create array of threads

        // Baris selanjutnya
        for (int i = 0; i < transactionTotal; i++) {
            String transactionType = scanner.next();
            int amount = scanner.nextInt();

            // Buat thread baru
            if (transactionType.equals("W")) {
                threads[i] = new Thread(() -> debitCard.withdraw(amount));
            } else if (transactionType.equals("D")) {
                threads[i] = new Thread(() -> debitCard.deposit(amount));
            }
        }

        // Jalankan semua thread
        for (int i = 0; i < transactionTotal; i++) {
            threads[i].start();
        }

        // Tunggu semua thread selesai
        for (Thread each : threads) {
            try {
                each.join();
            } catch (InterruptedException e) {
            }
        }

        debitCard.printTransactionsHistory();

        scanner.close();
    }
}