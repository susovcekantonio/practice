import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class EvidencijaVozila {
    private final ArrayList<Vozilo> vozila;

    public EvidencijaVozila() {
        vozila = new ArrayList<>();
    }

    public void dodajVozilo(Vozilo vozilo) {
        vozila.add(vozilo);
    }

    public void ocistiEvidenciju(){
        vozila.clear();
    }

    public void spremiVozilaUDatoteku(String putanja) {
        try (PrintWriter writer = new PrintWriter(putanja)) {
            for (Vozilo vozilo : vozila) {
                writer.println(vozilo.formatirajZaDatoteku());
            }
        } catch (Exception e) {
            System.out.println("Greška pri spremanju: " + e.getMessage());
        }
    }

    public ArrayList<Vozilo> ucitajVozilaIzDatoteke(String putanja) {
        ArrayList<Vozilo> ucitana = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(putanja))) {
            String linija;
            while ((linija = reader.readLine()) != null) {
                Vozilo vozilo = getVozilo(linija);
                ucitana.add(vozilo);
            }
        } catch (Exception e) {
            System.out.println("Greška pri učitavanju: " + e.getMessage());
        }
        return ucitana;
    }

    private static Vozilo getVozilo(String linija) throws Exception {
        String tip = linija.split("\\|")[0];
        Vozilo vozilo;
        switch (tip) {
            case "Automobil":
                vozilo = new Automobil();
                break;
            case "Motocikl":
                vozilo = new Motocikl();
                break;
            default:
                throw new Exception("Nepoznat tip vozila: " + tip);
        }
        vozilo.ucitajPodatke(linija);
        return vozilo;
    }
}
