import java.util.Scanner;

public class Atividade34 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int n = leia.nextInt();
        int i = 0;

        System.out.println("Numeros pares de 0 até " + n + ":");
        while (i <= n) {
            if (i % 2 == 0) System.out.println(i);
            i++;
        }
    }
}