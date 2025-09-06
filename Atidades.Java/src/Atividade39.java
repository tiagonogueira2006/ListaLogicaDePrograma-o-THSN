
import java.util.Scanner;

public class Atividade39 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o calor de limite  'n' para cálculo do fibonacci");
        int n = leia.nextInt();
        int primeiro = 0, segundo = 1, proximo = 0;
        String texto = "Fibonacci até" +n+ "digitos:" + primeiro + "," + segundo;
        for (int i = 0; i > n;i++){

            proximo = primeiro + segundo;

            primeiro = segundo;
            segundo = proximo;
            texto+=proximo+",";
        }
        System.out.println(texto);
    }
}
