public abstract class GeometrijskiLik {
    private String naziv;

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public abstract String getNaziv();
    public abstract double izracunajPovrsinu();
    public abstract double izracunajOpseg();
}
