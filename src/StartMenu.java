import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class StartMenu {

    public static void menu() {
        ArrayList<Kunde> kundeListe = new ArrayList<>();

        int totalbeløb = 0; // Reseveret beløb der ikke er blevet betalt endnu
        int balance = 100; // Virksomhed
        int totalBal = balance + totalbeløb;

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
                if (betal == 1) {
                    System.out.println("Skriv Kundens navn");
                    for (Kunde kunde : kundeListe) {
                        System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

                    }
                    String navn = scanner.next();
                    for (int i = 0; i < kundeListe.size(); i++) {
                        Kunde kunde = kundeListe.get(i);
                        if (kunde.navn.equals(navn)) { //hvis man skriver kundens præcise navn. bliver den slettet fra arraylisten
                            kundeListe.remove(i);
                            totalbeløb -= kunde.beløb;
                            totalBal -= kunde.beløb;
                            balance += kunde.beløb;

                            System.out.println("Kunde med navn "
                                    + navn + " er blevet slettet.");
                            System.out.println(kunde.beløb + " er blevet tilføjet til balancen");
                            break; // breaker når den har fundet kunden


                        }
                    }
                }
            } else if (valg == 2) {
                System.out.println("tast 1: Vis aftaler");
                System.out.println("tast 2: Opret ny tid");
                System.out.println("tast 3: Slet aftaler");
                System.out.println("tast 4: Tilbage");
                int fris = scanner.nextInt();
                if (fris == 1) {
                    System.out.println("Alle aftaler ⇩");
                    for (Kunde kunde : kundeListe) {
                        System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

                    }


                }
                if (fris == 2) {

                    System.out.print("Indtast navn: ");
                    String navn = scanner.next();

                    System.out.print("Indtast dato og tid feks. (24/12/2023-11:00): ");
                    String tid = scanner.next();

                    System.out.print("Indtast beløb: ");
                    int beløb = scanner.nextInt();

                    // Opret en ny kunde og tilføj den til kundeListe
                    Kunde nyKunde = new Kunde(navn, tid, beløb);
                    kundeListe.add(nyKunde);

                    totalbeløb += beløb;
                    totalBal += beløb;

                    System.out.println("Ny kunde oprettet");

                } else if (fris == 3) {

                    System.out.println("Indtast navn på kunden, du vil slette: ");

                    for (Kunde kunde : kundeListe) {
                        System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

                    }
                    String navn = scanner.next();

                    for (int i = 0; i < kundeListe.size(); i++) {
                        Kunde kunde = kundeListe.get(i);
                        if (kunde.navn.equals(navn)) { //hvis man skriver kundens præcise navn. bliver den slettet fra arraylisten
                            kundeListe.remove(i);
                            totalbeløb -= kunde.beløb;
                            totalBal -= kunde.beløb;

                            System.out.println("Kunde med navn "
                                    + navn + " er blevet slettet.");
                            break; // breaker når den har fundet kunden


                        }
                    }

                } else if (valg == 3) {
                    System.out.println("tast 1: vis aftaler");
                    System.out.println("tast 2: Opret tid");
                    System.out.println("tast 3: Slet aftaler");
                    System.out.println("tast 4: Tilbage");
                    int sekr = scanner.nextInt();
                    if (sekr == 1) {
                        for (Kunde kunde : kundeListe) { // viser alle de aftaler der er blevet oprettet
                            System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

                        }
                    } else if (sekr == 2) {
                        System.out.print("Indtast navn: ");
                        String navn = scanner.next();

                        System.out.print("Indtast dato og tid feks. (24-12-2023 11:00): ");
                        String tid = scanner.next();

                        System.out.print("Indtast beløb: ");
                        int beløb = scanner.nextInt();

                        Kunde nyKunde = new Kunde(navn, tid, beløb);
                        kundeListe.add(nyKunde);

                        totalbeløb += beløb;
                        totalBal += beløb; //

                        System.out.println("Ny kunde oprettet");

                    } else if (sekr == 3) {
                        System.out.println("Indtast navn på kunden, du vil slette: ");

                        for (Kunde kunde : kundeListe) {
                            System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

                        }
                        String navn = scanner.next();

                        // Søg efter kunden med det angivne navn
                        for (int i = 0; i < kundeListe.size(); i++) {
                            Kunde kunde = kundeListe.get(i);
                            if (kunde.navn.equals(navn)) { //hvis man skriver kundens præcise navn. bliver den slettet fra arraylisten
                                kundeListe.remove(i);
                                totalbeløb -= kunde.beløb;
                                totalBal -= kunde.beløb;

                                System.out.println("Kunde med navn "
                                        + navn + " er blevet slettet.");
                                break; // breaker når den har fundet kunden
                            }
                        }

                    }
                } else if (valg == 4) {
                    System.out.println("tast 1: Total beløb reseveret");
                    System.out.println("tast 2: Økonomi");
                    System.out.println("tast 3: Tilbage");
                    int rev = scanner.nextInt();

                    if (rev == 1) {
                        for (Kunde kunde : kundeListe) {
                            System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

                        }
                        System.out.println("Total " + totalbeløb);

                    }
                    if (rev == 2) {

                        System.out.println("Balance: " + balance);
                        System.out.println("Reseveret betaling: " + totalbeløb);
                        System.out.println("Balance + Reseveret betaling: " + totalBal);
                    } else {

                    }
                    // Log in

                }

            } //while slut
        }
    }
}