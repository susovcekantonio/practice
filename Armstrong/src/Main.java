//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 0;

        while (number <= 10000) {
            int numberTemp = number, sum = 0, digitCount = 0;

            while (numberTemp != 0) {
                digitCount++;
                numberTemp /= 10;
            }

            numberTemp = number;

            while (numberTemp != 0) {
                int numberDigit = numberTemp % 10;
                sum += (int) Math.pow(numberDigit, digitCount);
                numberTemp /= 10;
            }
            if (sum == number) {
                System.out.println(number);
            }
            number++;
        }
    }
}