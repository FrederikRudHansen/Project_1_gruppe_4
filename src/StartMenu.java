import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class StartMenu {

    public static void menu() {
        ArrayList<Kunde> kundeListe = new ArrayList<>();

        int totalbeløb = 0;
        for (Kunde kunde : kundeListe) {
            totalbeløb += kunde.beløb;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Velkommen til Harry´s Salon");
            System.out.println("1. Betaling");
            System.out.println("2. Frisør");
            System.out.println("3. Sekratær");
            System.out.println("4. Revisor");
            System.out.println("0. For at afslutte programmet");
            System.out.print("indtast tal her: ");

            int valg = scanner.nextInt();
            if (valg == 0) {
                break;
            }
            if (valg == 1) {
                // betalings metoden
                System.out.println("betal her");
                System.out.println("tast 1 for godkend");
                System.out.println("tast 2 for tilbage");
                System.out.print("tast her: ");
                int betal = scanner.nextInt();
                if (betal== 1){
                    System.out.println("GODKENDT :)");

                }
            } else if (valg == 2) {
                System.out.println("tast 1: Kalender");
                System.out.println("tast 2: Opret ny tid");
                System.out.println("tast 3: Tilbage");
                int fris = scanner.nextInt();
                if (fris==1){
                    for (Kunde kunde : kundeListe) {
                        System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

                    }


                } if (fris==2){

                    System.out.print("Indtast navn: ");
                    String navn = scanner.next();

                    System.out.print("Indtast tid (f.eks. 11:00): ");
                    String tid = scanner.next();

                    System.out.print("Indtast beløb: ");
                    int beløb = scanner.nextInt();

                    // Opret en ny kunde og tilføj den til kundeListe
                    Kunde nyKunde = new Kunde(navn, tid, beløb);
                    kundeListe.add(nyKunde);

                    System.out.println("Ny kunde oprettet!");

                }


            } else if (valg == 3) {
                System.out.println("tast 1: Kalender");
                System.out.println("tast 2: tilbage");
                int sekr = scanner.nextInt();
                if (sekr == 1){
                    //viser kalenderen
                    System.out.println("kalender");
                }
            } else if (valg == 4) {
                System.out.println("tast 1: Total beløb reseveret");
                System.out.println("tast 2: Økonomi");
                System.out.println("tast 3: Tilbage");
                int rev = scanner.nextInt();

                if (rev == 1){
                    System.out.println("Total "+ totalbeløb);
                } if (rev == 2){
                    System.out.println("viser virksomhedens økonomi");
                } else {
                    System.out.println("fejl");
                }
                // Log in
                // Vælg Oversigt over kalenderen hvor man kan se total
                // vælg økonomi for at se salonens total og transaktioner.
            }

        } //while slut
    }
}