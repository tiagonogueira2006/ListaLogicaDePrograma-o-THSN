
import java.util.Scanner;

public class Atividade36 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero inteiro para calcular o fatorial: ");
        int n = leia.nextInt();
        int fatorial = 1;

        while (n > 1) {
            fatorial *= n;
            n--;
        }

        System.out.println("Fatorial: " + fatorial);
    }
}
