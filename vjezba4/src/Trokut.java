public class Trokut extends GeometrijskiLik{
    private double a, b, c;

    public Trokut(String naziv, double a, double b, double c) {
        super(naziv);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getNaziv() {
        return "Trokut";
    }

    @Override
    public double izracunajPovrsinu() {
        return 0.25f * Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c));
    }

    @Override
    public double izracunajOpseg() {
        return a + b + c;
    }
}
