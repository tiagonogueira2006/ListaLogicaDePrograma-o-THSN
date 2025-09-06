
import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String senha;

        do {
            System.out.print("Digite a senha: ");
            senha = leia.next();
        } while (senha !=("1234"));

        System.out.println("Acesso permitido!");
    }
}
