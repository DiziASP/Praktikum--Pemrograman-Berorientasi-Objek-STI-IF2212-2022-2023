package Prak7.nangs;

public class Calculator {

    public Calculator() {
    };

    public double calculate(double a, double b, String operation)
            throws InvalidOperationException, InvalidDivisionByZero {
        /**
         * Implementasi
         * Apabila operasi yang diinput pengguna bukan `+`, `-`, `*`, atau `/`, maka
         * kalkulator akan mengembalikan pesan error dari kelas
         * `InvalidOperationException.java`
         * 
         * Apabila kalkulator menerima input pembagian terhadap 0, maka kalkulator juag
         * akan mengembalikan pesan error dari kelas `InvalidDivisionByZero.java`
         */
        double result = 0;
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new InvalidDivisionByZero();
                }
                result = a / b;
                break;
            default:
                throw new InvalidOperationException(operation);
        }
        return result;
    }
}

class InvalidOperationException extends Exception {
    private String operation;

    public InvalidOperationException(String operation) {
        // Implementasi InvalidOperationException
        this.operation = operation;
    }

    public String getMessage() {
        // Implementasi custom message InvalidOperationException
        // Format: "Invalid operation: " + operation
        return "Invalid operation: " + operation;
    }
}

class InvalidDivisionByZero extends Exception {
    public InvalidDivisionByZero() {
        // Implementasi InvalidDivisionByZero
        super("Tidak dapat melakukan pembagian terhadap 0");
    }
}