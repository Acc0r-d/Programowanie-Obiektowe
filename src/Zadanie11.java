import javax.swing.*;
public class Zadanie11 {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Wpisz tekst:");
        text = text.toUpperCase();
        JOptionPane.showMessageDialog(null, text);

        System.exit(1);
    }
}