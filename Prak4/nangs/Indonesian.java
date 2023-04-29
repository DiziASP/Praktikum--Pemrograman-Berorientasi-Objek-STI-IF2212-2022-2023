package nangs;

public class Indonesian extends Citizenship {
    private IndonesianLocalLanguage localLanguage;

    public Indonesian(String surname, String givenName, IndonesianLocalLanguage localLanguage) {
        super(surname, givenName);
        this.localLanguage = localLanguage;
    }

    public IndonesianLocalLanguage getLocalLanguage() {
        return localLanguage;
    }

    public void speakLocalLanguage() {
        switch (localLanguage) {
            case JAVANESE:
                System.out.println("Nami Kulo Tuan Mal");
                break;
            case SUNDANESE:
                System.out.println("Nepangkeun wasta sim kuring Tuan Mal");
                break;
        }
    }

    @Override
    public void speak() {
        System.out.println("Halo, aku Tuan Mal");
    }
}
