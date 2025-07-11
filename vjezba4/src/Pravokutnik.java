public class Pravokutnik extends GeometrijskiLik{
    private double a, b;

    public Pravokutnik(String naziv, double a, double b) {
        super(naziv);
        this.a = a;
        this.b = b;
    }

    @Override
    public String getNaziv() {
        return "Pravokutnik";
    }

    @Override
    public double izracunajPovrsinu() {
        return a * b;
    }

    @Override
    public double izracunajOpseg() {
        return 2 * (a + b);
    }


}
