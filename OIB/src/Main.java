import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite OIB (11 znamenki): ");
        String oib = scanner.nextLine();
        if (isValidOIB(oib)) {
            System.out.println("OIB je valjan.");
        } else {
            System.out.println("OIB nije valjan.");
        }
    }

    public static boolean isValidOIB(String oib){
        if(oib.length()!= 11){
            return false;
        }

        int[] digits = new int[11];
        for (int i = 0; i < 11; i++) {
            digits[i] = Character.getNumericValue(oib.charAt(i));
        }

        int control = 10;
        for (int i = 0; i < 10; i++) {
            control = control + digits[i];
            control = control % 10;
            if (control == 0) control = 10;
            control *= 2;
            control = control % 11;
        }

        int checkDigit = 11 - control;
        if (checkDigit == 10) checkDigit = 0;

        return digits[10] == checkDigit;
    }
}