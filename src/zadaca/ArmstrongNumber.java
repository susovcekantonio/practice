package zadaca;

public class ArmstrongNumber {
    public static void findAll(){
        int number = 0;

        while (number <= 10000){
            int numberCheck = number, sum = 0, digitCount = 0;
            while(numberCheck !=0){
                digitCount++;
                numberCheck /= 10;
            }
            numberCheck = number;
            while(numberCheck != 0){
                int numberDigit = numberCheck % 10;
                sum += (int) Math.pow(numberDigit, digitCount);
                numberCheck /= 10;
            }
            if(sum == number){
                System.out.println(number);
            }
            number++;
        }
    }
}
