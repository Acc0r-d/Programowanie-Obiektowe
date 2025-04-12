public class Zadanie22 {

}

class RownanieKwadrat{
    private double a, b , c;

    public RownanieKwadrat()
    {
        a = 0;
        b = 0;
        c = 0;
    }
    public void UstawParametry(double a , double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double ObliczY(double x)
    {
        return a * x * x + b * x + c;
    }
    public double liczPierwiastki()
    {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            return 2;
        } else if (delta == 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
