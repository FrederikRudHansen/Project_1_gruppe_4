import java.util.Scanner;

public class StartMenu {

    public static void menu() {
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
                    //tilføjer transaktion til Økonomi klassen.
                }
            } else if (valg == 2) {
                System.out.println("tast 1: Kalender");
                System.out.println("tast 2: Økonomi");
                System.out.println("tast 3: Tilbage");
                int fris = scanner.nextInt();
                if (fris==1){
                    BookTid.Book();
                    System.out.println("kalender");
                } if (fris==2){
                    //viser balance
                    System.out.println("balance...");
                    //viser transaktioner
                    System.out.println("transaktioner");
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
                    System.out.println("viser alle reseveret tider med en total");
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