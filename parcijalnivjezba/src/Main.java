import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NeispravniPodaciException{
        EvidencijaVozila evidencija = new EvidencijaVozila();

        try {
            evidencija.dodajVozilo(new Automobil("ZG1234AB", "Opel", 2010, 0));
            evidencija.dodajVozilo(new Motocikl("ST5678CD", "Yamaha", 2018, "Sport"));
            evidencija.dodajVozilo(new Automobil("ZG1234AB", "Opel", 2030, 4));
            evidencija.dodajVozilo(new Motocikl("ST5638CD", "Kawasaki", 2008, "Sport"));
        } catch (NeispravniPodaciException e) {
            System.out.println("Greška: " + e.getMessage());
        }

        evidencija.spremiVozilaUDatoteku("parcijalnivjezba/vozila.txt");
        System.out.println("Podaci iz datoteke:");
        evidencija.ocistiEvidenciju();
        ArrayList<Vozilo> ucitana = evidencija.ucitajVozilaIzDatoteke("parcijalnivjezba/vozila.txt");
        for (Vozilo v : ucitana) {
            System.out.println(v.prikaziPodatke());
        }
    }
}