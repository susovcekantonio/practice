public class Student extends Osoba {
    private String brojIndeksa;

    public Student(String oib, String ime, String prezime, String brojIndeksa) {
        super(oib, ime, prezime, Titula.STUDENT);
        this.brojIndeksa = brojIndeksa;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    //    public void ucitajPodatke(String linija) {
//        String[] dijelovi = linija.split("\\|");
//        this.ime = dijelovi[1];
//        this.prezime = dijelovi[2];
//        this.brojIndeksa = dijelovi[3];
//    }
//
//
//    public String prikaziPodatke() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Ime: ").append(ime).append(", ");
//        sb.append("Prezime: ").append(prezime).append(", ");
//        sb.append("Broj indeksa: ").append(brojIndeksa);
//        return sb.toString();
//    }
}
