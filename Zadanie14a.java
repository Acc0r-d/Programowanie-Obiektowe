import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Zadanie14a {
    public static void main(String[] args) {
        int n = 15;
        //System.out.println(toBinary(n));
        System.out.println(toHex(20));
        //System.out.println(toOctal(n));
        System.exit(0);
    }
    private static String toBinary(int n){
        String binary = "";
        while(n > 0){
            if(n % 2 == 0){
                binary = binary + '1';
            } else {
                binary = binary + '0';

            }
            n /= 2;
        }
        return binary;
    }
    private static String toHex(int n) {
        String hex = "";
        String binary = toBinary(n);


        while (binary.length() % 4 != 0) {  ///
            binary = "0" + binary;          /// Upewniamy się czy napewno każdy z segmentów kodu będzie mieć po 4 znaki
        }                                   ///


        List<String> podzial = new ArrayList<>();
        for (int i = 0; i < binary.length(); i += 4) {
            int koniec = Math.min(i + 4, binary.length());
            podzial.add(binary.substring(i, koniec));
        }


        for (String s : podzial) {
            int sum = 0;
            int power = 3;


            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    sum += Math.pow(2, power);
                }
                power--;
            }


            if (sum > 9) {
                char hexChar = (char) ('A' + (sum - 10));
                hex += hexChar;
            } else {
                hex += sum;
            }
        }

        return hex;
    }
    private static String toOctal(int n){
        StringBuilder octal = new StringBuilder();
        while(n > 0){
            if(n % 8 != 0){
                octal.append((n % 8));
            } else {
                octal.append('0');
            }
            n /= 8;
        }
        return revert(octal.toString());
    }
    private static String revert(String binary){
        String reverted = "";
        for(int i = binary.length() - 1; i >= 0; i--){
            reverted += binary.charAt(i);

        }
        return reverted;
    }


}
