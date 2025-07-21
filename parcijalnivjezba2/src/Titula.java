public enum Titula {
    PROFESOR("Profesor"),
    STUDENT("Student");

    private final String titula;

    Titula(String titula){
        this.titula = titula;
    }

    public static Titula izNaziva(String naziv){
        for(Titula t : Titula.values()){
            if(t.titula.equals(naziv)){
                return t;
            }
        }
        throw new IllegalArgumentException("Ne postoji ova titula " + naziv);
    }
}
