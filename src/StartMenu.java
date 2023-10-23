import java.util.Scanner;

public class StartMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til Harry´s Salon");
        System.out.println("1. Kunde");
        System.out.println("2. Frisør");
        System.out.println("3. Sekratær");
        System.out.println("4. Revisor");

        int valg = scanner.nextInt();

        if (valg == 1){
            // ser kalender
            // oversigt over ledige tider
        } else if (valg == 2){
            // skriver log in
            // vælg tilføj/fjerne aftaler
            // vælg økonomi for at se salonens total og transaktioner.


        } else if (valg == 3){
            // log in
            // tilføj/fjerner aftaler
        } else if (valg == 4){
            // Log in
            // Vælg Oversigt over kalenderen hvor man kan se total
            // vælg økonomi for at se salonens total og transaktioner.
        }

    }
}
