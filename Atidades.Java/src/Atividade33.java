
import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade, soma = 0, cont = 0;

        System.out.println("Digite idades (digite um numero negativo para parar):");
        do {
            idade = leia.nextInt();
            if (idade >= 0) {
                soma += idade;
                cont++;
            }
        } while (idade >= 0);

        if (cont > 0) System.out.println("Media das idades: " + (soma / (double)cont));
    }
}
