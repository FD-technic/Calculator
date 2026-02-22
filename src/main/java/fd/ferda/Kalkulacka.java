package fd.ferda;

public class Kalkulacka {
    /**
     * Vrati soucet dvou celych cisel
     * @param a scitanec
     * @param b scitanec
     * @return soucet
     */
    public int secti( int a, int b) {
        return a+b;
    }

    public int odecti(int a, int b) {
        return a-b;
    }public int nasob( int a, int b) {
        return a*b;
    }

    public int vydel(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b nesmí být 0");
        }

        return a / b;
    }
}
