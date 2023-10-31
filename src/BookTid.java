import java.time.LocalDate;
import java.util.ArrayList;

public class BookTid {
    public static void Book() {
        ArrayList<Kunde> kundeListe = new ArrayList<>();

        Kunde kunde1 = new Kunde("Bodil", "11:00",200);

        Kunde kunde2 = new Kunde("Hans","12:00",200);

        kundeListe.add(kunde1);
        kundeListe.add(kunde2);
        int totalbeløb = 0;
        for (Kunde kunde : kundeListe){
            totalbeløb += kunde.beløb;
        }


        for (Kunde kunde : kundeListe) {
            System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

        }
        System.out.println("Resveret beløb "+totalbeløb);
    }
}

class Kunde{
    String navn;
    String tider;
    int beløb;



Kunde (String navn, String tid, int beløb){
this.navn=navn;
tider=tid;
this.beløb=beløb;


}

}

class Ferie{
    String navn;
    String dato;




    Ferie (String navn, String dato){
        this.navn=navn;
        this.dato=dato;



    }

}