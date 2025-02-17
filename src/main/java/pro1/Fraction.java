package pro1;

public class Fraction {
    private long n;
    private long d;

    public Fraction(long d, long n) {
        this.d = d;
        this.n = n;
        long gcd = gcd(d,n);
    }

}
