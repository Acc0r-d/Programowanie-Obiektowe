public class Zadanie14b {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(toBinary(n));
        System.out.println(toHex(n));
        System.out.println(toOctal(n));

    }
    private static String toBinary(int n){
        return Integer.toBinaryString(n);
    }
    private static String toHex(int n){
        return Integer.toHexString(n);
    }
    private static String toOctal(int n){
        return Integer.toOctalString(n);
    }


}
