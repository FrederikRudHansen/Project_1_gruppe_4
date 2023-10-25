import java.util.ArrayList;
import java.util.Scanner;

public class KalenderTider3 {

    private static ArrayList<String> tider = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vælg en dag, mandag-fredag");
        String valgDag = scanner.nextLine();
        printTiderForDag(valgDag);
    }

    private static void printTiderForDag(String valgDag) {
        String[] uger = {"Mandag", "Tirsdag", "Onsdag", "Torsdag", "Fredag"};
        for (String dag : uger) {
            if (valgDag.equalsIgnoreCase(dag.toLowerCase())) {
                for (int time = 10; time <= 18; time++) {
                    if (time < 18) {
                        printTider(getFormattedTime(dag, time, "00", "30"));
                        printTider(getFormattedTime(dag, time, "30", "00"));
                    } else {
                        printTider(getFormattedTime(dag, time, "00", "00"));
                    }
                }
                break;
            }
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

    private static String getFormattedTime(String dag, int time, String startMinut, String slutMinut) {
        return String.format("2023-10-30 %02d:%s-%02d:%s", time, startMinut, time, slutMinut);
    }
}