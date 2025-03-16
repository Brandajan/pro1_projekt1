package pro1;
import java.util.Scanner;

public class InteractiveDoubleParsing {
    //přidat scanner, main metoda, while(true), Double.parseDouble,trycatch
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Zadej číslo: ");
            String input = scanner.nextLine();
            try {
                double number = Double.parseDouble(input);
                System.out.println("Zadal si číslo " + number);
            } catch (NumberFormatException e) {
                System.out.println("Zadal si špatný řetězec");
            }
        }
    }
}
