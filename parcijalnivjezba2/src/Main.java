import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Osoblje osoblje = new Osoblje();

        String izbor;

        do {
            System.out.println("1. Unos profesora");
            System.out.println("2. Unos studenta");
            System.out.println("3. Filtriraj osobe");
            System.out.println("4. Prikaži sve osobe");
            System.out.println("0. Izlaz");
            System.out.print("Odaberite opciju: ");
            izbor = scanner.nextLine();

            switch (izbor) {
                case "1":
                    unesiProfesora(scanner, osoblje);
                    break;
                case "2":
                    unesiStudenta(scanner, osoblje);
                    break;
                case "3":
                    filtrirajOsobe(scanner, osoblje);
                    break;
                case "4":
                    System.out.println(osoblje.ispisiOsobe());
                    break;
                case "0":
                    System.out.println("Izlaz iz programa.");
                    break;
                default:
                    System.out.println("Nije opcija.");
            }

        } while (!izbor.equals("0"));
    }

    private static void unesiProfesora(Scanner scanner, Osoblje osoblje) {
        String oib = unesiValidanOib(scanner, osoblje);
        System.out.print("Unesite ime: ");
        String ime = scanner.nextLine();
        System.out.print("Unesite prezime: ");
        String prezime = scanner.nextLine();

        Profesor profesor = new Profesor(oib, ime, prezime);
        osoblje.dodajOsobu(profesor);
        System.out.println("Profesor dodan.");
    }

    private static void unesiStudenta(Scanner scanner, Osoblje osoblje) {
        String oib = unesiValidanOib(scanner, osoblje);
        System.out.print("Unesite ime: ");
        String ime = scanner.nextLine();
        System.out.print("Unesite prezime: ");
        String prezime = scanner.nextLine();
        System.out.print("Unesite broj indeksa: ");
        String brojIndeksa = scanner.nextLine();

        Student student = new Student(oib, ime, prezime, brojIndeksa);
        osoblje.dodajOsobu(student);
        System.out.println("Student dodan.");
    }

    private static String unesiValidanOib(Scanner scanner, Osoblje osoblje) {
        String oib;
        boolean validan = false;
        do {
            System.out.print("Unesite OIB: ");
            oib = scanner.nextLine();
            try {
                validan = osoblje.isOibValidan(oib);
            } catch (InvalidOibException e) {
                System.out.println(e.getMessage());
            }
        } while (!validan);
        return oib;
    }

    private static void filtrirajOsobe(Scanner scanner, Osoblje osoblje) {
        System.out.print("Unesite tip osobe za filtriranje (student/profesor): ");
        String tip = scanner.nextLine();
        System.out.println(osoblje.filtrirajPoTipu(tip));
    }
}
