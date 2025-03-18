public class Zadanie23 {
    public static void main(String[] args) {
        Wielomian w[] = new Wielomian[3];
        w[0] = new Liniowa(2, 1); // 2x + 1
        w[1] = new Kwadratowa(1, -2, 2); // x*x - 2x + 2
        w[2] = new Kwadratowa(1, 0, -1); // x*x - 1
        for (Wielomian wi : w) {
            wi.wypiszMiejscaZerowe();
        }
    }
}

interface Wielomian
{
    public void wypiszMiejscaZerowe();

}

class Liniowa implements Wielomian {

    double a, b;
    public Liniowa(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    @Override
    public void wypiszMiejscaZerowe() {
        if(a == 0 && b == 0)
        {
            System.out.println("Błąd");
        };
        double score = - a / b;
        System.out.println(score);

    }

}

class Kwadratowa implements Wielomian
{
    double a, b, c;
    public Kwadratowa(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void wypiszMiejscaZerowe() {
        double delta = b * b - 4 * a * c;
        if(a == 0) return;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("[" + x1 + ", " + x2 +"]");
            return;
        }
        else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("[" + x + "]");
            return;
        }
        System.out.println("brak");
        return;
    }
}