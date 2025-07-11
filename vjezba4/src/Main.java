import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        File outputFile = new File("vjezba4/my-output.txt");
        PrintWriter printWriter = new PrintWriter(outputFile);


        String nastavak;
        Ucilica ucilica = new Ucilica();

        do {
            System.out.println("Upisite geometrijski lik:trokut, krug ili pravokutnik");
            String oblik = scanner.nextLine();

            switch (oblik) {
                case "trokut":
                    System.out.println("Unesite stranicu a");
                    double aTrokut = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Unesite stranicu b");
                    double bTrokut = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Unesite stranicu c");
                    double cTrokut = scanner.nextDouble();
                    scanner.nextLine();
                    Trokut trokut = new Trokut("Trokut", aTrokut, bTrokut, cTrokut);
                    ucilica.dodajUListu(trokut);
                    break;
                case "krug":
                    System.out.println("Unesite radijus");
                    double radijus = scanner.nextDouble();
                    scanner.nextLine();
                    Krug krug = new Krug("Krug", radijus);
                    ucilica.dodajUListu(krug);
                    break;
                case "pravokutnik":
                    System.out.println("Unesite stranicu a");
                    double aPravokutnik = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Unesite stranicu b");
                    double bPravokutnik = scanner.nextDouble();
                    scanner.nextLine();
                    Pravokutnik pravokutnik = new Pravokutnik("Pravokutnik", aPravokutnik, bPravokutnik);
                    ucilica.dodajUListu(pravokutnik);
                    break;
                default:
                    System.out.println("Nije unesen ispravan oblik");
                    break;
            }

            System.out.println("Zelite li unijeti novi lik? (y/n)");
            nastavak = scanner.nextLine();
        } while (!nastavak.equals("n"));

        printWriter.write(ucilica.ispisiListu());
        printWriter.close();
    }
}