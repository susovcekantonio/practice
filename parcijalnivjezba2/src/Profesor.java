public class Profesor extends Osoba {

    public Profesor(String oib, String ime, String prezime) {
        super(oib, ime,prezime, Titula.PROFESOR);
    }

//    public void ucitajPodatke(String linija) {
//        String[] dijelovi = linija.split("\\|");
//        this.ime = dijelovi[1];
//        this.prezime = dijelovi[2];
//    }
//
//
//    public String prikaziPodatke() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Ime: ").append(ime).append(", ");
//        sb.append("Prezime: ").append(prezime);
//        return sb.toString();
//    }
}
