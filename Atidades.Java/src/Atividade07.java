
import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int a = 0, b = 0;
        int soma = 0;
        System.out.println("Digite os valores para a soma");

        a = leia.nextInt();
        b = leia.nextInt();

        soma = a + b;
        System.out.println("A soma dos números escolhidos é igual a: " + soma);
    }
}
