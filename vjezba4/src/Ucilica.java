import java.util.ArrayList;
import java.util.List;

public class Ucilica {
    private List<GeometrijskiLik> geometrijskiLikovi= new ArrayList<>();

    public void dodajUListu(GeometrijskiLik geometrijskiLik){
        geometrijskiLikovi.add(geometrijskiLik);
    }

    public String ispisiListu(){
        StringBuilder stringBuilder = new StringBuilder();
        for (GeometrijskiLik geometrijskiLik : geometrijskiLikovi) {
            stringBuilder.append("Naziv je ").append(geometrijskiLik.getNaziv());
            stringBuilder.append(" ,opseg je ").append(geometrijskiLik.izracunajOpseg());
            stringBuilder.append(" ,povrsina je ").append(geometrijskiLik.izracunajPovrsinu()).append("\n");
        }
        return stringBuilder.toString();
    }

}
