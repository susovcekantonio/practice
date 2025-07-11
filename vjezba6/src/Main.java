import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite putanju izvorne datoteke");
        String izvor = scanner.nextLine();

        System.out.println("Unesite putanju destinacijske datoteke");
        String destinacija = scanner.nextLine();

        File destinacijskaDatoteka = new File(destinacija);

        if (destinacijskaDatoteka.exists()) {
            System.out.println("Datoteka postoji. Želite li ju obrisati(y/n)");
            String delete = scanner.nextLine();
            if (!delete.equals("n")) {
                if(destinacijskaDatoteka.delete()) {
                    System.out.println("Datoteka obrisana");
                }
            }else{
                System.out.println("Datoteka nije obrisana");
            }
        } else {
            System.out.println("Datoteka ne postoji, kreirat će se");
        }

        copy(izvor, destinacija);
        if (destinacijskaDatoteka.exists()) {
            System.out.println("Datoteka uspješno kopirana.");
        }else{
            System.out.println("Datoteka nije kopirana");
        }
    }

    public static void copy(String izvor, String destinacija) {
        try (
                FileInputStream fileInputStream = new FileInputStream(izvor);
                FileOutputStream fileOutputStream = new FileOutputStream(destinacija)
        ) {
            byte[] buffer = new byte[1024];
            int total = 0;

            while ((total = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, total);
            }
        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
        }
    }
}
