package pro1;

public class Fraction {
    private long n;
    private long d;

    public Fraction(long n, long d) {
        long gcd = Utils.gcd(d,n);
        this.n = n / gcd;
        this.d = d / gcd;
    }

    public static Fraction parse(String s) {
        return new Fraction(1,1);
    }

    public String toString() {
        return n + "/" + d;
    }
}
