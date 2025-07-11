import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broj;
        String upit;
        boolean nastavi = true;

        do {
            System.out.print("Unesite pozitivni cijeli broj za izračun faktorijela: ");
            try {
                broj = scanner.nextInt();
                scanner.nextLine();

                if (broj < 0) {
                    throw new NegativeNumberException();
                } else {
                    System.out.println("Faktorijel broja " + broj +  " je " + faktorijel(broj));
                    System.out.println("Želite li nastaviti (y/n)");
                    upit = scanner.nextLine();
                    if(upit.equals("n")){
                        nastavi = false;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Niste unijeli broj");
                scanner.nextLine();
            } catch (NegativeNumberException e){
                System.out.println(e.getMessage());
            }
        }while(nastavi);

    }

    public static int faktorijel(int broj){
        int faktorijel=1;
        for(int i=2;i<=broj;i++){
            faktorijel*= i;
        }
        return faktorijel;
    }
}