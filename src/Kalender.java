import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Kalender {

    private static final String FILNAVN = "Kalender.txt";
    private static List<String> bookedeTider = new ArrayList<>();

    public static void main(String[] args) {
        indlæsTekstFraFil();

        while (true) {
            String valg = JOptionPane.showInputDialog(null, "Vælg en handling:\n1. Indskriv bookning\n2. Slet tider\n3. Se indskrevet tider\n4. Afslut program");

            if (valg.equals("1")) {
                String tekst = JOptionPane.showInputDialog(null, "Indskriv navn, dato og tid:");
                bookedeTider.add(tekst);
                gemTekstIFil(tekst);
            } else if (valg.equals("2")) {
                sletTekstsegment();
            } else if (valg.equals("3")) {
                visIndtastetTekst();
            } else if (valg.equals("4")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Ugyldigt valg.");
            }
        }

        gemTekstTilFil();
    }

    private static void indlæsTekstFraFil() {
        try {
            Path filsti = Paths.get(FILNAVN);
            if (Files.exists(filsti)) {
                bookedeTider = Files.readAllLines(filsti);
            }
        } catch (IOException e) {
            System.out.println("Fejl under indlæsning af tider: " + e.getMessage());
        }
    }

    private static void gemTekstIFil(String tekst) {
        try {
            FileWriter filskriver = new FileWriter(FILNAVN, true);
            filskriver.write(tekst + "\n");
            filskriver.close();
        } catch (IOException e) {
            System.out.println("Fejl under indskrivning af tider: " + e.getMessage());
        }
    }

    private static void sletTekstsegment() {
        if (bookedeTider.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingen indtastet tider.");
            return;
        }

        String[] muligheder = bookedeTider.toArray(new String[0]);
        String valgtTekst = (String) JOptionPane.showInputDialog(null, "Vælg booking til sletning:", "Slet tid", JOptionPane.PLAIN_MESSAGE, null, muligheder, muligheder[0]);

        bookedeTider.remove(valgtTekst);
        JOptionPane.showMessageDialog(null, "Tid slettet: " + valgtTekst);
    }

    private static void visIndtastetTekst() {
        if (bookedeTider.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingen indtastede tider.");
        } else {
            StringBuilder tekstBuilder = new StringBuilder();
            for (String tekst : bookedeTider) {
                tekstBuilder.append(tekst).append("\n");
            }
            JOptionPane.showMessageDialog(null, "Indtastet tider:\n" + tekstBuilder.toString());
        }
    }

    private static void gemTekstTilFil() {
        try {
            FileWriter filskriver = new FileWriter(FILNAVN);
            for (String tekst : bookedeTider) {
                filskriver.write(tekst + "\n");
            }
            filskriver.close();
        } catch (IOException e) {
            System.out.println("Fejl under indkskrivning af tider: " + e.getMessage());
        }
    }
}