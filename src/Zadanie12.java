import javax.swing.*;

public class Zadanie12 {
    public static void main(String[] args) {
        JOptionPane input = new JOptionPane();
        int n = Integer.parseInt(JOptionPane.showInputDialog(input));
        JOptionPane.showMessageDialog(null, Silnia(n));
    }
    private static int Silnia(int n) {
        int score = 1;
        for (int i = 1; i <= n; i++) {
            score *= i;
        }
        return score;

    }
}
