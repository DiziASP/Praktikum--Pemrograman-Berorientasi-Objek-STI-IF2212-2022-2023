package nangs;

public abstract class Citizenship {
    private String surname;
    private String givenName;

    public Citizenship(String surname, String givenName) {
        this.surname = surname;
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public abstract void speak();
}
