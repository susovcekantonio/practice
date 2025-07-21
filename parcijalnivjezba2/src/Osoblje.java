import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Osoblje {
    private final ArrayList<Osoba> osobe;
    private final String DELIMITER = "\\|";
    private final String ISPIS_DELIMITER = ", ";

    public Osoblje() {
        osobe = new ArrayList<>();
    }

    public void dodajOsobu(Osoba osoba){
        osobe.add(osoba);
    }

    public boolean isOibValidan(String oib) throws InvalidOibException {
        for (Osoba osoba : osobe) {
            if (osoba.getOib().equals(oib)) {
                throw new InvalidOibException();
            }
        }
        return true;
    }

    public String ispisiOsobe() {
        StringBuilder profesorBuilder = new StringBuilder();
        StringBuilder studentBuilder = new StringBuilder();
        int professorCount = 0;
        int studentCount = 0;

        for (Osoba osoba : osobe) {
            if (osoba instanceof Profesor p) {
                professorCount++;
                profesorBuilder.append("Oib: ")
                        .append(p.getOib())
                        .append(ISPIS_DELIMITER)
                        .append("Ime: ")
                        .append(p.getIme())
                        .append(ISPIS_DELIMITER)
                        .append("Prezime: ")
                        .append(p.getPrezime())
                        .append("\n");
            }else if (osoba instanceof Student s) {
                studentCount++;
                studentBuilder.append("Oib: ")
                        .append(s.getOib())
                        .append(ISPIS_DELIMITER)
                        .append("Ime: ")
                        .append(s.getIme())
                        .append(ISPIS_DELIMITER)
                        .append("Prezime: ")
                        .append(s.getPrezime())
                        .append(ISPIS_DELIMITER)
                        .append("Broj indeksa: ")
                        .append(s.getBrojIndeksa())
                        .append("\n");
            }
        }

        String brojProfesora = "Profesori (" + professorCount + "):\n";
        String brojStudenata = "Studenti: (" + studentCount + "):\n";

        return brojProfesora + profesorBuilder + brojStudenata + studentBuilder;


//        sb.append("Profesori (").append(professorCount).append("):\n");
//        for (Osoba osoba : osobe) {
//            if (osoba instanceof Profesor) {
//                sb.append(osoba.prikaziPodatke()).append("\n");
//            }
//        }
//
//        sb.append("Studenti (").append(studentCount).append("):\n");
//        for (Osoba osoba : osobe) {
//            if (osoba instanceof Student) {
//                sb.append(osoba.prikaziPodatke()).append("\n");
//            }
//        }

    }

    public String filtrirajPoTipu(String tip) {
        StringBuilder sb = new StringBuilder();

        for (Osoba osoba : osobe) {
            if (tip.equals("student") && osoba instanceof Student s) {
                sb.append("Oib: ")
                   .append(s.getOib())
                   .append(ISPIS_DELIMITER)
                   .append("Ime: ")
                   .append(s.getIme())
                   .append(ISPIS_DELIMITER)
                   .append("Prezime: ")
                   .append(s.getPrezime())
                   .append(ISPIS_DELIMITER)
                   .append("Broj indeksa: ")
                   .append(s.getBrojIndeksa())
                   .append("\n");
            } else if (tip.equals("profesor") && osoba instanceof Profesor p) {
                sb.append("Oib: ")
                   .append(p.getOib())
                   .append(ISPIS_DELIMITER)
                   .append("Ime: ")
                   .append(p.getIme())
                   .append(ISPIS_DELIMITER)
                   .append("Prezime: ")
                   .append(p.getPrezime())
                   .append("\n");
            }
        }

        return sb.toString();
    }

    public ArrayList<Osoba> ucitajOsobeIzDatoteke (String putanja){
        try (BufferedReader reader = new BufferedReader(new FileReader(putanja))) {
            String linija;
            while ((linija = reader.readLine()) != null) {
                osobe.add(dohvatiOsobu(linija));
            }
        } catch (Exception e) {
            System.out.println("Greška pri učitavanju: " + e.getMessage());
        }
        return osobe;
    }


    private Osoba dohvatiOsobu (String linija) throws Exception {
        String[] stupci = linija.split(DELIMITER);
        String tip = stupci[0];
        String ime = stupci[1];
        String prezime = stupci[2];
        Titula titula = Titula.izNaziva(tip);
        switch (titula) {
            case Titula.PROFESOR:
      //          return new Profesor(ime, prezime);
            case Titula.STUDENT:
  //              return new Student(ime, prezime, stupci[3]);
            default:
                throw new Exception("Nepoznat tip osobe: " + tip);
        }
    }
}

