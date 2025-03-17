import javax.swing.*;

public class Zadanie13 {
    public static void main(String[] args) {
        JOptionPane input = new JOptionPane();
        int n = Integer.parseInt( JOptionPane.showInputDialog(input));
        int score = sum(n);
        JOptionPane.showMessageDialog(null, score);
        System.exit(1);
    }
    private static int sum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                sum += i;
            }
        }
        return sum;
    }
}
