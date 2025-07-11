public abstract class Vozilo {
    protected String registarskiBroj;
    protected String marka;
    protected int godinaProizvodnje;


    public Vozilo(String registarskiBroj, String marka, int godinaProizvodnje) throws NeispravniPodaciException {
        this.registarskiBroj = registarskiBroj;
        this.marka = marka;
        try {
            if (godinaProizvodnje < 1886 || godinaProizvodnje > 2025) {
                throw new NeispravniPodaciException("Auto nije mogao biti napravljen te godine");
            }
        }catch (NeispravniPodaciException e){
                System.out.println(e.getMessage());
            }
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public Vozilo() {

    }

    public abstract void ucitajPodatke(String linija);

    public abstract String prikaziPodatke();

    public abstract String formatirajZaDatoteku();
}
