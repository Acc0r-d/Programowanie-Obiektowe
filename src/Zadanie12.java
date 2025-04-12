import javax.swing.*;
import java.math.BigInteger;

public class Zadanie12 {
    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Wprowadz liczbe"));
        BigInteger out = Silnia(n);
        JOptionPane.showMessageDialog(null, out);
        System.exit(1);
    }
    private static BigInteger Silnia(int n) {
        BigInteger score = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            score = score.multiply(BigInteger.valueOf(i));
        }
        return score;

    }
}
