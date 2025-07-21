public abstract class Osoba {
    protected String oib;
    protected String ime;
    protected String prezime;
    protected Titula titula;

    public Osoba(String oib, String ime, String prezime, Titula titula) {
        this.oib = oib;
        this.ime = ime;
        this.prezime = prezime;
        this.titula = titula;
    }

    protected String getIme() {
        return ime;
    }

    protected String getPrezime() {
        return prezime;
    }

    protected String getOib() {
        return oib;
    }
}
