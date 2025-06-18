import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite iznos za povrat u eurima ");
        double iznos = scanner.nextDouble();

        double[] novcanice = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        for(int i=0; i<novcanice.length;i++){
            int count =0;
            while(iznos>=novcanice[i]){
                if(iznos-novcanice[i]<0){
                    break;
                }
                iznos -= novcanice[i];
                iznos = Math.round(iznos * 100.0) / 100.0;
                count++;
            }
            if(count>0) System.out.println("Vrati " + count + " od " + novcanice[i] + " eura");
            if(iznos==0) break;
        }
    }
}