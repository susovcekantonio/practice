public enum DaysOfTheWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);


    private final int broj;

    DaysOfTheWeek(int broj){
        this.broj = broj;
    }

    public static DaysOfTheWeek izBroja(int broj){
        for(DaysOfTheWeek d : DaysOfTheWeek.values()){
            if(d.broj == broj){
                return d;
            }
        }
        throw new IllegalArgumentException("Ne postoji dan s ovim brojem " + broj);
    }
}
