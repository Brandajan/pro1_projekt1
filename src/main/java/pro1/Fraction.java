package pro1;

public class Fraction {
    private long n;
    private long d;

    public Fraction(long d, long n) {

        long gcd = Utils.gcd(d,n);
        this.d = d / gcd;
        this.n = n / gcd;
    }

}
