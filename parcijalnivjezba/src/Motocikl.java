import java.util.Scanner;

public class Motocikl extends Vozilo {
    private String tipMotora;

    public Motocikl(String registarskiBroj, String marka, int godinaProizvodnje, String tipMotora) throws NeispravniPodaciException {
        super(registarskiBroj, marka, godinaProizvodnje);
        this.tipMotora = tipMotora;
    }

    public Motocikl() {
        super();
    }

    @Override
    public void ucitajPodatke(String linija) {
        String[] dijelovi = linija.split("\\|");
        this.registarskiBroj = dijelovi[1];
        this.marka = dijelovi[2];
        this.godinaProizvodnje = Integer.parseInt(dijelovi[3]);
        this.tipMotora = dijelovi[4];
    }

    @Override
    public String prikaziPodatke() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motocikl\n");
        sb.append("Registarski broj: ").append(registarskiBroj).append(" ");
        sb.append("Marka: ").append(marka).append(" ");
        sb.append("Godina proizvodnje: ").append(godinaProizvodnje).append(" ");
        sb.append("Broj vrata: ").append(tipMotora).append(" ");
        return sb.toString();
    }

    @Override
    public String formatirajZaDatoteku() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motocikl|")
                .append(registarskiBroj).append("|")
                .append(marka).append("|")
                .append(godinaProizvodnje).append("|")
                .append(tipMotora);
        return sb.toString();
    }
}

