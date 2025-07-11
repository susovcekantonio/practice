public class Krug extends  GeometrijskiLik{
    private double radijus;


    public Krug(String naziv, double radijus) {
        super(naziv);
        this.radijus = radijus;
    }

    @Override
    public String getNaziv() {
        return "Krug";
    }

    @Override
    public double izracunajPovrsinu() {
        return Math.PI * radijus * radijus;
    }

    @Override
    public double izracunajOpseg() {
        return 2 * Math.PI * radijus;
    }
}
