import java.time.LocalDate;
import java.util.ArrayList;

public class BookTid {
    public static void Book() {
        ArrayList<Kunde> kundeListe = new ArrayList<>();

        // Opret kundeobjekter og tilføj dem til listen
        Kunde kunde1 = new Kunde("Bodil", 1100,200);

        Kunde kunde2 = new Kunde("Hans",1200,200);

        kundeListe.add(kunde1);
        kundeListe.add(kunde2);
        int totalbeløb = 0;
        for (Kunde kunde : kundeListe){
            totalbeløb += kunde.beløb;
        }

        // Du kan tilføje flere kundeobjekter på samme måde

        // For at få adgang til kundeobjekterne i listen, kan du bruge en løkke
        for (Kunde kunde : kundeListe) {
            System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

        }
        System.out.println("samlet beløb "+totalbeløb);
    }
}

class Kunde{
    String navn;
    int tider;
    int beløb;

    LocalDate dato;

Kunde (String navn, int tid, int beløb){
this.navn=navn;
tider=tid;
this.beløb=beløb;

}

}
