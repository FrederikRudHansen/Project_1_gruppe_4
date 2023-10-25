import java.util.ArrayList;
import java.util.Scanner;

public class KalenderTider2 {

    private static ArrayList<String> tider = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vælg en dag, man-fredag");
        String valgDag = scanner.nextLine();
        printTiderForDag(valgDag);
    }
    private static void printTiderForDag(String valgDag) {
        switch (valgDag.toLowerCase()) {
            case "mandag":
                printTider("2023-10-30 10:00-10:30");
                printTider("2023-10-30 10:30-11:00");
                printTider("2023-10-30 11:00-11:30");
                printTider("2023-10-30 11:30-12:00");
                printTider("2023-10-30 12:00-12:30");
                printTider("2023-10-30 12:30-13:00");
                printTider("2023-10-30 13:00-13:30");
                printTider("2023-10-30 13:30-14:00");
                printTider("2023-10-30 14:00-14:30");
                printTider("2023-10-30 14:30-15:00");
                printTider("2023-10-30 15:00-15:30");
                printTider("2023-10-30 15:30-16:00");
                printTider("2023-10-30 16:00-16:30");
                printTider("2023-10-30 16:30-17:00");
                printTider("2023-10-30 17:00-17:30");
                printTider("2023-10-30 17:30-18:00");

                break;

            case "tirsdag":
                printTider("2023-10-31 10:00-10:30");
                printTider("2023-10-31 10:30-11:00");
                printTider("2023-10-31 11:00-11:30");
                printTider("2023-10-31 11:30-12:00");
                printTider("2023-10-31 12:00-12:30");
                printTider("2023-10-31 12:30-13:00");
                printTider("2023-10-31 13:00-13:30");
                printTider("2023-10-31 13:30-14:00");
                printTider("2023-10-31 14:00-14:30");
                printTider("2023-10-31 14:30-15:00");
                printTider("2023-10-31 15:00-15:30");
                printTider("2023-10-31 15:30-16:00");
                printTider("2023-10-31 16:00-16:30");
                printTider("2023-10-31 16:30-17:00");
                printTider("2023-10-31 17:00-17:30");
                printTider("2023-10-31 17:30-18:00");

                break;

            case "onsdag":
                printTider("2023-11-01 10:00-10:30");
                printTider("2023-11-01 10:30-11:00");
                printTider("2023-11-01 11:00-11:30");
                printTider("2023-11-01 11:30-12:00");
                printTider("2023-11-01 12:00-12:30");
                printTider("2023-11-01 12:30-13:00");
                printTider("2023-11-01 13:00-13:30");
                printTider("2023-11-01 13:30-14:00");
                printTider("2023-11-01 14:00-14:30");
                printTider("2023-11-01 14:30-15:00");
                printTider("2023-11-01 15:00-15:30");
                printTider("2023-11-01 15:30-16:00");
                printTider("2023-11-01 16:00-16:30");
                printTider("2023-11-01 16:30-17:00");
                printTider("2023-11-01 17:00-17:30");
                printTider("2023-11-01 17:30-18:00");

                break;

            case "torsdag":
                printTider("2023-11-02 10:00-10:30");
                printTider("2023-11-02 10:30-11:00");
                printTider("2023-11-02 11:00-11:30");
                printTider("2023-11-02 11:30-12:00");
                printTider("2023-11-02 12:00-12:30");
                printTider("2023-11-02 12:30-13:00");
                printTider("2023-11-02 13:00-13:30");
                printTider("2023-11-02 13:30-14:00");
                printTider("2023-11-02 14:00-14:30");
                printTider("2023-11-02 14:30-15:00");
                printTider("2023-11-02 15:00-15:30");
                printTider("2023-11-02 15:30-16:00");
                printTider("2023-11-02 16:00-16:30");
                printTider("2023-11-02 16:30-17:00");
                printTider("2023-11-02 17:00-17:30");
                printTider("2023-11-02 17:30-18:00");

                break;

            case "fredag":
                printTider("2023-11-03 10:00-10:30");
                printTider("2023-11-03 10:30-11:00");
                printTider("2023-11-03 11:00-11:30");
                printTider("2023-11-03 11:30-12:00");
                printTider("2023-11-03 12:00-12:30");
                printTider("2023-11-03 12:30-13:00");
                printTider("2023-11-03 13:00-13:30");
                printTider("2023-11-03 13:30-14:00");
                printTider("2023-11-03 14:00-14:30");
                printTider("2023-11-03 14:30-15:00");
                printTider("2023-11-03 15:00-15:30");
                printTider("2023-11-03 15:30-16:00");
                printTider("2023-11-03 16:00-16:30");
                printTider("2023-11-03 16:30-17:00");
                printTider("2023-11-03 17:00-17:30");
                printTider("2023-11-03 17:30-18:00");

                break;

            case "næste mandag":
                printTider("2023-11-06 10:00-10:30");
                printTider("2023-11-06 10:30-11:00");
                printTider("2023-11-06 11:00-11:30");
                printTider("2023-11-06 11:30-12:00");
                printTider("2023-11-06 12:00-12:30");
                printTider("2023-11-06 12:30-13:00");
                printTider("2023-11-06 13:00-13:30");
                printTider("2023-11-06 13:30-14:00");
                printTider("2023-11-06 14:00-14:30");
                printTider("2023-11-06 14:30-15:00");
                printTider("2023-11-06 15:00-15:30");
                printTider("2023-11-0 15:30-16:00");
                printTider("2023-11-06 16:00-16:30");
                printTider("2023-11-06 16:30-17:00");
                printTider("2023-11-06 17:00-17:30");
                printTider("2023-11-06 17:30-18:00");

                break;

            case "næste tirsdag":
                printTider("2023-11-07 10:00-10:30");
                printTider("2023-11-07 10:30-11:00");
                printTider("2023-11-07 11:00-11:30");
                printTider("2023-11-07 11:30-12:00");
                printTider("2023-11-07 12:00-12:30");
                printTider("2023-11-07 12:30-13:00");
                printTider("2023-11-07 13:00-13:30");
                printTider("2023-11-07 13:30-14:00");
                printTider("2023-11-07 14:00-14:30");
                printTider("2023-11-07 14:30-15:00");
                printTider("2023-11-07 15:00-15:30");
                printTider("2023-11-07 15:30-16:00");
                printTider("2023-11-07 16:00-16:30");
                printTider("2023-11-07 16:30-17:00");
                printTider("2023-11-07 17:00-17:30");
                printTider("2023-11-07 17:30-18:00");

                break;

            case "næste onsdag":
                printTider("2023-11-08 10:00-10:30");
                printTider("2023-11-08 10:30-11:00");
                printTider("2023-11-08 11:00-11:30");
                printTider("2023-11-08 11:30-12:00");
                printTider("2023-11-08 12:00-12:30");
                printTider("2023-11-08 12:30-13:00");
                printTider("2023-11-08 13:00-13:30");
                printTider("2023-11-08 13:30-14:00");
                printTider("2023-11-08 14:00-14:30");
                printTider("2023-11-08 14:30-15:00");
                printTider("2023-11-08 15:00-15:30");
                printTider("2023-11-08 15:30-16:00");
                printTider("2023-11-08 16:00-16:30");
                printTider("2023-11-08 16:30-17:00");
                printTider("2023-11-08 17:00-17:30");
                printTider("2023-11-08 17:30-18:00");

                break;

            case "næste torsdag":
                printTider("2023-11-09 10:00-10:30");
                printTider("2023-11-09 10:30-11:00");
                printTider("2023-11-09 11:00-11:30");
                printTider("2023-11-09 11:30-12:00");
                printTider("2023-11-09 12:00-12:30");
                printTider("2023-11-09 12:30-13:00");
                printTider("2023-11-09 13:00-13:30");
                printTider("2023-11-09 13:30-14:00");
                printTider("2023-11-09 14:00-14:30");
                printTider("2023-11-09 14:30-15:00");
                printTider("2023-11-09 15:00-15:30");
                printTider("2023-11-09 15:30-16:00");
                printTider("2023-11-09 16:00-16:30");
                printTider("2023-11-09 16:30-17:00");
                printTider("2023-11-09 17:00-17:30");
                printTider("2023-11-09 17:30-18:00");

                break;

            case "næste fredag":
                printTider("2023-11-10 10:00-10:30");
                printTider("2023-11-10 10:30-11:00");
                printTider("2023-11-10 11:00-11:30");
                printTider("2023-11-10 11:30-12:00");
                printTider("2023-11-10 12:00-12:30");
                printTider("2023-11-10 12:30-13:00");
                printTider("2023-11-10 13:00-13:30");
                printTider("2023-11-10 13:30-14:00");
                printTider("2023-11-10 14:00-14:30");
                printTider("2023-11-10 14:30-15:00");
                printTider("2023-11-10 15:00-15:30");
                printTider("2023-11-10 15:30-16:00");
                printTider("2023-11-10 16:00-16:30");
                printTider("2023-11-10 16:30-17:00");
                printTider("2023-11-10 17:00-17:30");
                printTider("2023-11-10 17:30-18:00");

                break;

        }
    }

    private static void printTider(String dato) {
        System.out.println("Tider for " + dato + ":");
        for (String tid : tider) {
            if (tid.startsWith(dato)) {
                System.out.println(tid.substring(11));
            }
        }
    }
}
