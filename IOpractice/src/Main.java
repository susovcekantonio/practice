import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File destination = new File("IOpractice/destination.txt");
        File source = new File("IOpractice/source.txt");

        try (BufferedWriter bufferedWriter = new BufferedWriter (new FileWriter(destination));
             BufferedReader bufferedReader = new BufferedReader (new FileReader(source))) {
            String line = bufferedReader.readLine();
            bufferedWriter.write(line);
        } catch (Exception e) {
            System.out.println("Desio se neki exception");
        }

        System.out.println();
    }
}