
import java.util.Scanner;

public class TentativaDeLogin{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final String senhaCorreta = "1234";

    for (int tentativas = 3; tentativas > 0; tentativas--){
        System.err.println("Digite a sua senha: ");
        String senha = scanner.nextLine();

        if(senha.equals(senhaCorreta)){
            System.err.println("Senha Correta! Acesso concedido");
            break;
        } else if(tentativas > 1) {
            System.err.println("Senha incorreta. Você tem " + (tentativas - 1 ) + " 1tentativas restantes.");    
        } else {
            System.err.println("Conta bloqueada temporariamente.");
        }
    }
    scanner.close();
    }
}