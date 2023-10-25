import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Okonomi {
    public static void okonomi(){




    }
}
class betal{
    int klipnig = 200;

}
class transaction {
    String text;
    LocalDate date;
    double amount;
    double newBalance;

    transaction(String text, double amount, double newBalance) {
        this.text = text;
        this.amount = amount;
        this.newBalance = newBalance;
        date = LocalDate.now();
    }

    @Override
    public String toString() {
        return text + "\t" + date + "\t" + amount + "\t" + newBalance;

    }
}
