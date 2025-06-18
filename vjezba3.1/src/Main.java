import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int numberCount=0, wordCount=0, otherCount=0;

        for(int i = 0; i<input.length();i++){
            if(input.charAt(i)>47 && input.charAt(i)<58){
                numberCount++;
            }
            else if((input.charAt(i)>64 && input.charAt(i)<91) || (input.charAt(i)>96 && input.charAt(i)<123)){
                wordCount++;
            }
            else{
                otherCount++;
            }
        }
        System.out.println("Brojke " + numberCount + " znakovi " + wordCount + " ostali " + otherCount);
    }
}