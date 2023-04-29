package nangs;

public class Main {
    public static void main(String[] args) {
        CitizenPrinter printer = new CitizenPrinter();

        for (int i = 0; i < 6; i++) {
            Citizenship citizenship = (i % 2 == 0
                    ? new Indonesian("Indonesian", "Surname", IndonesianLocalLanguage.JAVANESE)
                    : new Indonesian(
                            "Indonesian", "Surname", IndonesianLocalLanguage.SUNDANESE));
            printer.addCitizenship(citizenship);
        }

        for (int i = 0; i < 6; i++) {
            Citizenship citizenship = (i % 2 == 0
                    ? new American("American", "Surname", "California")
                    : new American("American", "Surname", "New York"));
            printer.addCitizenship(citizenship);
        }

        for (int i = 0; i < 6; i++) {
            Citizenship citizenship = (i % 2 == 0
                    ? new Japanese("Japanese", "Surname", "Naruto")
                    : new Japanese("Japanese", "Surname", "One Piece"));
            printer.addCitizenship(citizenship);
        }

        printer.printCitizenshipList();
    }
}
