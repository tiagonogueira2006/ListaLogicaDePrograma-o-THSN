
import  java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int soma = 0, numero;


        do {System.out.println("Digite numeros para somar (digite 0 para parar):");
            numero = leia.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("Soma total: " + soma);
    }
}
