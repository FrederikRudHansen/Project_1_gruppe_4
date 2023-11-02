import java.util.ArrayList;

public class Feriedage {
    private ArrayList<String> feriedage;

    public Feriedage() {
        feriedage = new ArrayList<>();
    }

    public void tilføjFeriedag(String feriedag) {
        feriedage.add(feriedag);
    }

    public void visFeriedage() {
        System.out.println("Feriedage ⇩");
        for (String feriedag : feriedage) {
            System.out.println(feriedag);
        }
    }
}
