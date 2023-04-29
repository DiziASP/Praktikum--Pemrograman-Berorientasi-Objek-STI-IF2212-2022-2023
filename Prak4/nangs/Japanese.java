package nangs;

public class Japanese extends Citizenship {
    public String favouriteAnime;

    public Japanese(String surname, String givenName, String favouriteAnime) {
        super(surname, givenName);
        this.favouriteAnime = favouriteAnime;
    }

    public String getFavouriteAnime() {
        return favouriteAnime;
    }

    @Override
    public void speak() {
        System.out.println("Hai, Watashi wa Mal-san desu!");
    }

}
