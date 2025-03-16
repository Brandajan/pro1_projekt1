package pro1;
import java.util.Scanner;

public class InteractiveFractionParsing {
    //viz trida IDP + pouzit fraction.parse
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Zadej zlomek: ");
            String input = scanner.nextLine();
            try{
                Fraction fraction = Fraction.parse(input);
                System.out.println("Zadal si zlomek " + fraction);
            } catch (IllegalArgumentException e){
                System.out.println("Zadal si špatný řetězec");
            }
        }
    }
}
