import java.util.ArrayList;
import java.util.Scanner;

public class KalenderTider {

    private static ArrayList<String> tider = new ArrayList<>();

    public static void main(String[] args) {

        // Mandag
        tider.add("2023-10-30 10:00-10:30");
        tider.add("2023-10-30 10:30-11:00");
        tider.add("2023-10-30 11:00-11:30");
        tider.add("2023-10-30 11:30-12:00");
        tider.add("2023-10-30 12:00-12:30");
        tider.add("2023-10-30 12:30-13:00");
        tider.add("2023-10-30 13:00-13:30");
        tider.add("2023-10-30 13:30-14:00");
        tider.add("2023-10-30 14:00-14:30");
        tider.add("2023-10-30 14:30-15:00");
        tider.add("2023-10-30 15:00-15:30");
        tider.add("2023-10-30 15:30-16:00");
        tider.add("2023-10-30 16:00-16:30");
        tider.add("2023-10-30 16:30-17:00");
        tider.add("2023-10-30 17:00-17:30");
        tider.add("2023-10-30 17:30-18:00");

        // Tirsdag
        tider.add("2023-10-31 10:00-10:30");
        tider.add("2023-10-31 10:30-11:00");
        tider.add("2023-10-31 11:00-11:30");
        tider.add("2023-10-31 11:30-12:00");
        tider.add("2023-10-31 12:00-12:30");
        tider.add("2023-10-31 12:30-13:00");
        tider.add("2023-10-31 13:00-13:30");
        tider.add("2023-10-31 13:30-14:00");
        tider.add("2023-10-31 14:00-14:30");
        tider.add("2023-10-31 14:30-15:00");
        tider.add("2023-10-31 15:00-15:30");
        tider.add("2023-10-31 15:30-16:00");
        tider.add("2023-10-31 16:00-16:30");
        tider.add("2023-10-31 16:30-17:00");
        tider.add("2023-10-31 17:00-17:30");
        tider.add("2023-10-31 17:30-18:00");

        // Onsdag
        tider.add("2023-11-01 10:00-10:30");
        tider.add("2023-11-01 10:30-11:00");
        tider.add("2023-11-01 11:00-11:30");
        tider.add("2023-11-01 11:30-12:00");
        tider.add("2023-11-01 12:00-12:30");
        tider.add("2023-11-01 12:30-13:00");
        tider.add("2023-11-01 13:00-13:30");
        tider.add("2023-11-01 13:30-14:00");
        tider.add("2023-11-01 14:00-14:30");
        tider.add("2023-11-01 14:30-15:00");
        tider.add("2023-11-01 15:00-15:30");
        tider.add("2023-11-01 15:30-16:00");
        tider.add("2023-11-01 16:00-16:30");
        tider.add("2023-11-01 16:30-17:00");
        tider.add("2023-11-01 17:00-17:30");
        tider.add("2023-11-01 17:30-18:00");

        // Torsdag
        tider.add("2023-11-02 10:00-10:30");
        tider.add("2023-11-02 10:30-11:00");
        tider.add("2023-11-02 11:00-11:30");
        tider.add("2023-11-02 11:30-12:00");
        tider.add("2023-11-02 12:00-12:30");
        tider.add("2023-11-02 12:30-13:00");
        tider.add("2023-11-02 13:00-13:30");
        tider.add("2023-11-02 13:30-14:00");
        tider.add("2023-11-02 14:00-14:30");
        tider.add("2023-11-02 14:30-15:00");
        tider.add("2023-11-02 15:00-15:30");
        tider.add("2023-11-02 15:30-16:00");
        tider.add("2023-11-02 16:00-16:30");
        tider.add("2023-11-02 16:30-17:00");
        tider.add("2023-11-02 17:00-17:30");
        tider.add("2023-11-02 17:30-18:00");

        // Fredag
        tider.add("2023-11-03 10:00-10:30");
        tider.add("2023-11-03 10:30-11:00");
        tider.add("2023-11-03 11:00-11:30");
        tider.add("2023-11-03 11:30-12:00");
        tider.add("2023-11-03 12:00-12:30");
        tider.add("2023-11-03 12:30-13:00");
        tider.add("2023-11-03 13:00-13:30");
        tider.add("2023-11-03 13:30-14:00");
        tider.add("2023-11-03 14:00-14:30");
        tider.add("2023-11-03 14:30-15:00");
        tider.add("2023-11-03 15:00-15:30");
        tider.add("2023-11-03 15:30-16:00");
        tider.add("2023-11-03 16:00-16:30");
        tider.add("2023-11-03 16:30-17:00");
        tider.add("2023-11-03 17:00-17:30");
        tider.add("2023-11-03 17:30-18:00");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Vælg en dato");
        String valgDato = scanner.nextLine();

        System.out.println("Tider for " + valgDato + ":");
        for (String tid : tider) {
            if (tid.startsWith(valgDato)) {
                System.out.println(tid.substring(11));
            }
        }
    }
}
