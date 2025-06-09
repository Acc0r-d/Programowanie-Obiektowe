import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.TreeSet;

public class Zadanie51
{
    private static void wypiszElementy(TreeSet zbior)
    {
        Iterator it = zbior.iterator();
        while (it.hasNext()) {
            System.out.println((it.next()).toString());
        }
    }
    public static void main(String[] args)
    {
        TreeSet zbior = new TreeSet<>();
        zbior.add( new Wspolrzedna(2, 3) );
        zbior.add( new Wspolrzedna(-3, 0) );
        zbior.add( new Wspolrzedna(-1, 2) );
        zbior.add( new Wspolrzedna(-1, 2) );
        zbior.add( new Wspolrzedna(-3, -2) );
        wypiszElementy(zbior);
    }
}

class Wspolrzedna implements Comparable<Wspolrzedna> {
    private int x, y;
    public Wspolrzedna(int _x, int _y) {
        x = _x;
        y = _y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int compareTo(@NotNull Wspolrzedna o) {
        if(x == o.x) return y - o.y;
        return x - o.x;
    }
}