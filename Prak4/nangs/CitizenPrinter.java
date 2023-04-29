package nangs;

import java.util.ArrayList;
import java.util.List;

public class CitizenPrinter {
    private ArrayList<Citizenship> citizenshipList;

    public CitizenPrinter() {
        this.citizenshipList = new ArrayList<>();
    }

    public void addCitizenship(Citizenship citizenship) {
        citizenshipList.add(citizenship);
    }

    public ArrayList<Citizenship> getCitizenshipList() {
        return citizenshipList;
    }

    public void printCitizenshipList() {
        for (Citizenship citizenship : citizenshipList) {
            if (citizenship instanceof Indonesian) {
                System.out.println("American");
                System.out.println(citizenship.getSurname() + " " + citizenship.getGivenName());
                ((Indonesian) citizenship).speak();
                ((Indonesian) citizenship).speakLocalLanguage();
            } else if (citizenship instanceof Japanese) {
                System.out.println("Japanese");
                System.out.println(citizenship.getSurname() + " " + citizenship.getGivenName());
                ((Japanese) citizenship).speak();
                System.out.println(((Japanese) citizenship).getFavouriteAnime());
            } else if (citizenship instanceof American) {
                System.out.println("American");
                System.out.println(citizenship.getSurname() + " " + citizenship.getGivenName());
                ((American) citizenship).speak();
                System.out.println(((American) citizenship).getState());
            }
        }
    }
}
