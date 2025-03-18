public class Zadanie21 {
    public static void main(String[] args) {
        Rational rat = new Rational(3, 4);
        Rational rat2 = new Rational(1, 4);
        Rational ratSum =  rat.Div(rat2);
        System.out.println(ratSum.toString());
    }
}

class Rational {
    public int _licznik , _mianownik;
    public Rational( int licznik , int mianownik){
        _licznik = licznik;
        _mianownik = mianownik;
    }

    public Rational Add(Rational arg){
        if(_mianownik == arg._mianownik) return new Rational(_licznik + arg._licznik, _mianownik);

        int temp = _licznik;
        _licznik = _licznik * arg._mianownik  + arg._licznik * _mianownik;
        _mianownik = _mianownik * arg._mianownik;


        return new Rational(_licznik, _mianownik);
    }
    public Rational Mul(Rational arg){
        return new Rational(_licznik * arg._licznik, _mianownik * arg._mianownik);
    }
    public Rational Div(Rational arg){
        return new Rational(_licznik * arg._mianownik , _mianownik * arg._licznik);
    }
    public boolean Equals(Rational arg){
        if(arg._licznik != _licznik) return false;
        if(arg._mianownik != _mianownik) return false;
        return true;
    }
    public int compareTo(Rational arg){
        int temp = _licznik;
        int licznik1 = _licznik * arg._mianownik;
        int licznik2 = arg._licznik * _mianownik;
        if(licznik1 != licznik2){
            if(licznik1 > licznik2) return 1;
            return -1;
        }
        return 0;
    }
    public Rational Sub(Rational arg){
        if(_mianownik == arg._mianownik) return new Rational(_licznik - arg._licznik, _mianownik);

        int temp = _licznik;
        _licznik = _licznik * arg._mianownik  - arg._licznik * _mianownik;
        _mianownik = _mianownik * arg._mianownik;


        return new Rational(_licznik, _mianownik);
    }
    @Override
    public String toString(){
        return _licznik + "/" + _mianownik;
    }

}