import java.util.Scanner;

public class Betalingssystem {

    private double pris;

    public Betalingssystem() {
        this.pris = 200;
    }

    public boolean bekraeftBetaling(String svar) {
        return svar.equalsIgnoreCase("ja");
    }

    public static void betaling() {
        Betalingssystem betaling = new Betalingssystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Harry's Salon Bookingsystem.");
        System.out.println("Prisen for en klipning er " + betaling.pris + " kr.");
        System.out.print("Har kunden betalt? (Svar 'ja' eller 'nej'): ");

        String svar = scanner.nextLine();

        if (betaling.bekraeftBetaling(svar)) {
            System.out.println("Betalingen er bekraeftet. Tak!");
        } else {
            System.out.println("Kunden skylder penge til naeste gang.");
        }


    }
}
