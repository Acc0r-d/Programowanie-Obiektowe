import javax.swing.*;
public class Zadanie11 {
    public static void main(String[] args) {
        JOptionPane input = new JOptionPane();
        String text = JOptionPane.showInputDialog(input);
        text = text.toUpperCase();
        JOptionPane.showMessageDialog(null, text);
        System.exit(1);
    }
}