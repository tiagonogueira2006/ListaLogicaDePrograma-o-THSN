import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1 = 0, n2 = 0, n3 = 0;
        double media = 0;
        System.out.println("Digite 3 valores para saber sua média");

        n1 = leia.nextInt();
        n2 = leia.nextInt();
        n3 = leia.nextInt();

        media = (n1 + n2 + n3)/3;
        System.out.println("A média dos números escolhidos é igual a: " + media);
    }
}