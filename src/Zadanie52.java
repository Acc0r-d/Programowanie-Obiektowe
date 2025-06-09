import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class Zadanie52
{
    public static void main(String[] args) {
        HashMap mapa = new HashMap();
        mapa.put(new Wspolrzedne(2, 3), new String("czerwony"));
        mapa.put(new Wspolrzedne(-3, 0), new String("czarny"));
        mapa.put(new Wspolrzedne(-1, 2), new String("czerwony"));
        mapa.put(new Wspolrzedne(2, -1), new String("czarny"));
        Wspolrzedne w = new Wspolrzedne(-1, 2);
        System.out.println("Punkt " + w.toString()
                + " ma kolor " + mapa.get(w));
    }
}

class Wspolrzedne  {
    private int x, y;
    public Wspolrzedne(int _x, int _y) {
        x = _x;
        y = _y;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wspolrzedne w = (Wspolrzedne) o;
        return x == w.x && y == w.y;
    }

}