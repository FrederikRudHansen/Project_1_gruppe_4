import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class StartMenu {

    public static void menu() {
        ArrayList<Kunde> kundeListe = new ArrayList<>();
        Feriedage feriedageObjekt = new Feriedage();

        int totalbeløb = 0; // Reseveret beløb der ikke er blevet betalt endnu
        int balance = 100; // Virksomhedens balance
        int totalBal = balance + totalbeløb;
        int Shampoo = 50;
        int Balsam = 25;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n\nVelkommen til Harry´s Salon");
            System.out.println("1. Betaling");
            System.out.println("2. Frisør");
            System.out.println("3. Sekratær");
            System.out.println("4. Revisor");
            System.out.println("5. Opret ferie");
            System.out.println("6. Vis ferier");
            System.out.println("7. Vis kredit");
            System.out.println("0. For at afslutte programmet");
            System.out.print("indtast tal her: ");

            int valg = scanner.nextInt();
            if (valg == 0) {
                break;
            }
            if (valg == 1) {
                // betalings metoden
                System.out.println("\nbetal her");
                System.out.println("tast 1: for at gennemføre betaling");
                System.out.println("tast 2: for at tilføje et proukt til kunden");
                System.out.println("tast 3: for tilbage");
                System.out.print("tast her: ");
                int betal = scanner.nextInt();
                if (betal == 1) {
                    System.out.println("\nKunder ⇩ ");
                    for (Kunde kunde : kundeListe) {
                        System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

                    }
                    System.out.println("\nSkriv Kundens fornavn: ");
                    String navn = scanner.next();
                    for (int i = 0; i < kundeListe.size(); i++) {
                        Kunde kunde = kundeListe.get(i);
                        if (kunde.navn.equals(navn)) { //hvis man skriver kundens præcise navn. bliver den slettet fra arraylisten


                            kundeListe.remove(i);
                            totalbeløb -= kunde.beløb;
                            balance += kunde.beløb;


                            System.out.println("\nKunde med navn " + navn + " er blevet slettet.");
                            System.out.println(kunde.beløb + " er blevet tilføjet til balancen");
                            break; // breaker når den har fundet kunden


                        }
                    }
                } else if (betal == 2) {
                    System.out.println("\nKunder ⇩");
                    for (Kunde kunde : kundeListe) {

                        System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

                    }
                    System.out.print("\nSkriv kundens fornavn: ");
                    String navn = scanner.next();
                    for (int i = 0; i < kundeListe.size(); i++) {
                        Kunde kunde = kundeListe.get(i);
                        if (kunde.navn.equals(navn)) { //hvis man skriver kundens præcise navn. bliver den slettet fra

                            while (true) {
                                System.out.println("\nTast 1: Tilføj shampoo ");
                                System.out.println("Tast 2: Tilføj balsam ");
                                System.out.println("Tast 3: Tilbage");
                                int pro = scanner.nextInt();
                                if (pro == 1) {
                                    kunde.beløb += Shampoo;
                                    totalbeløb += Shampoo;

                                }
                                if (pro == 2) {
                                    kunde.beløb += Balsam;
                                    totalbeløb += Balsam;

                                } else if (pro == 3){
                                break;
                                }

                            } // while slut
                        }
                    }
                }
            } else if (valg == 2) {
                System.out.println("\ntast 1: Vis aftaler");
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

                    feriedageObjekt.visFeriedage();

                    System.out.println("\nAndre aftaler ⇩\n");
                    for (Kunde kunde : kundeListe) {
                        System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

                    }

                    System.out.print("Indtast fornavn: ");
                    String navn = scanner.next();

                    System.out.print("Indtast dato og tid feks. (24/12/2023-11:00): ");
                    String tid = scanner.next();

                    System.out.print("Indtast beløb: ");
                    int beløb = scanner.nextInt();

                    Kunde nyKunde = new Kunde(navn, tid, beløb); // Opretter en ny kunde og tilføjer den til kundeListe
                    kundeListe.add(nyKunde);

                    totalbeløb += beløb;
                    totalBal += beløb;

                    System.out.println("\nNy kunde oprettet");

                } else if (fris == 3) {

                    System.out.println("\nIndtast navn på kunden, du vil slette: ");

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
                }
            }else if (valg == 3) {
                    System.out.println("\ntast 1: vis aftaler");
                    System.out.println("tast 2: Opret tid");
                    System.out.println("tast 3: Slet aftaler");
                    System.out.println("tast 4: Tilbage");
                    int sekr = scanner.nextInt();
                    if (sekr == 1) {
                        for (Kunde kunde : kundeListe) { // viser alle de aftaler der er blevet oprettet
                            System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

                        }
                    } else if (sekr == 2) {

                        feriedageObjekt.visFeriedage();
                        System.out.println("\nAndre aftaler ⇩\n");
                        for (Kunde kunde : kundeListe) {
                            System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

                        }
                        System.out.print("Indtast fornavn: ");
                        String navn = scanner.next();

                        System.out.print("Indtast dato og tid feks. (24-12-2023 11:00): ");
                        String tid = scanner.next();

                        System.out.print("Indtast beløb: ");
                        int beløb = scanner.nextInt();

                        Kunde nyKunde = new Kunde(navn, tid, beløb);
                        kundeListe.add(nyKunde);

                        totalbeløb += beløb;
                        totalBal += beløb; //

                        System.out.println("\nNy kunde oprettet");

                    } else if (sekr == 3) {
                        System.out.println("\nIndtast navn på kunden, du vil slette: ");

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
                    System.out.println("\ntast 1: Total beløb reseveret");
                    System.out.println("tast 2: Økonomi");
                    System.out.println("tast 3: Tilbage");
                    int rev = scanner.nextInt();
                    scanner.nextLine(); //fjerner "newline" i linje 179 så "scanner.nextLine();" virker i linje 194

                    if (rev == 1) {
                        for (Kunde kunde : kundeListe) {
                            System.out.println("Navn: " + kunde.navn + ", Tider: " + kunde.tider + ", Beløb: " + kunde.beløb);

                        }
                        System.out.println("Total " + totalbeløb);

                    }
                    if (rev == 2) {
                        String kode = "hairyharry"; //koden til login
                        System.out.println("Skriv adgangskode");

                        String kodeTilføjet = scanner.nextLine();

                        if (kodeTilføjet.equals(kode)) {
                           totalBal = balance + totalbeløb;
                            System.out.println("\nKode bekræftet - Velkommen!");
                            System.out.println("Balance: " + balance);
                            System.out.println("Reseveret betaling: " + totalbeløb);
                            System.out.println("Balance + Reseveret betaling: " + totalBal);
                            System.out.println("Tast 1: tilbage");
                            String til = scanner.next();
                        } else {
                            System.out.println("Forkert kode - Prøv igen!");


                        }
                        // Log in

                    }

                } else if (valg == 5) {
                    // Opret objekt af typen Feriedage

                    System.out.println("\nTast 1 for: Frisør");
                    System.out.println("Tast 2 for: Revisor");
                    System.out.println("Tast 3 for: Sekretær");
                    System.out.println("Tast 4 for at gå tilbage");
                    int valg3 = scanner.nextInt();
                    scanner.nextLine(); // Tømmer scanner bufferen

                    if (valg3 == 1) {
                        System.out.print("Indtast feriedagen(e) for frisøren: (f.eks. frisøren: 02/11/2023-04/11/2023): ");
                        String feriedage = scanner.nextLine();
                        feriedageObjekt.tilføjFeriedag(feriedage); // Brug objektet til at kalde metoden
                    } else if (valg3 == 2) {
                        System.out.print("Indtast feriedagen(e) for revisoren: (f.eks. revisoren: 02/11/2023-04/11/2023): ");
                        String feriedage = scanner.nextLine();
                        feriedageObjekt.tilføjFeriedag(feriedage); // Brug objektet til at kalde metoden
                    } else if (valg3 == 3) {
                        System.out.print("Indtast feriedagen(e) for sekretær: (f.eks. sekretær: 02/11/2023-04/11/2023): ");
                        String feriedage = scanner.nextLine();
                        feriedageObjekt.tilføjFeriedag(feriedage); // Brug objektet til at kalde metoden
                    } else {
                        System.out.println("Ugyldigt valg.");
                    }
                } else if (valg == 6) {
                feriedageObjekt.visFeriedage();
                System.out.println("\nTast 1: tilbage");
                String til = scanner.next();
            }else if (valg == 7) {
                for (Kunde kunde : kundeListe) {
                    System.out.println("Navn: " + kunde.navn + " Skylder " + kunde.beløb);
                    System.out.println("\nTast 1: tilbage");
                    String til = scanner.next();

                }
            }

        }
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

