package Prak7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Hint 1: Untuk mendapatkan input dari user, umumnya bisa dengan memasukkan
        // parameter System.in
        // ke dalam konstruktor Scanner.
        Scanner scanner = new Scanner(System.in);
        try {
            Email email = new Email(scanner.nextLine());
            if (email.validateEmail()) {
                System.out.println(email.validateEmail());
                System.out.println("Email validated.");
                System.out.println("Operation finished.");
            }
        } catch (InvalidEmailException e) {
            System.out.println(e.getClass().getSimpleName() + "! " + e.getMessage());
            System.out.println("Email string error!");
            System.out.println("Operation finished.");
        } catch (InvalidDomainException e) {
            System.out.println(e.getClass().getSimpleName() + "! " + e.getMessage());
            System.out.println("Email string error!");
            System.out.println("Operation finished.");
        }
        scanner.close();
    }
}