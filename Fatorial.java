
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.err.println("Digite um número: ");
    int number = scanner.nextInt();
    
    scanner.close();

    int fatorial = 1;

    for (int i = 1; i <= number; i++) {
        fatorial *= i;
    }
    System.err.println("O fatorial de " + number + " é: " + fatorial);
    }
}
