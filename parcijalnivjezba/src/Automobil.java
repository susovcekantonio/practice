public class Automobil extends Vozilo {
    private int brojVrata;

    public Automobil(String registarskiBroj, String marka, int godinaProizvodnje, int brojVrata) throws NeispravniPodaciException {
        super(registarskiBroj, marka, godinaProizvodnje);
            if (brojVrata < 1) {
                throw new NeispravniPodaciException("Broj vrata ne može biti manji od 1");
            }
        this.brojVrata = brojVrata;
    }

    public Automobil() {
        super();
    }

    @Override
    public void ucitajPodatke(String linija){
        String[] dijelovi = linija.split("\\|");
        this.registarskiBroj = dijelovi[1];
        this.marka = dijelovi[2];
        this.godinaProizvodnje = Integer.parseInt(dijelovi[3]);
        this.brojVrata = Integer.parseInt(dijelovi[4]);
    }

    @Override
    public String prikaziPodatke() {
        StringBuilder sb = new StringBuilder();
        sb.append("Automobil\n");
        sb.append("Registarski broj: ").append(registarskiBroj).append(" ");
        sb.append("Marka: ").append(marka).append(" ");
        sb.append("Godina proizvodnje: ").append(godinaProizvodnje).append(" ");
        sb.append("Broj vrata: ").append(brojVrata).append(" ");
        return sb.toString();
    }

    @Override
    public String formatirajZaDatoteku() {
        StringBuilder sb = new StringBuilder();
        sb.append("Automobil|")
                .append(registarskiBroj).append("|")
                .append(marka).append("|")
                .append(godinaProizvodnje).append("|")
                .append(brojVrata);
        return sb.toString();
    }
}
