
import java.util.Scanner;
public class Atividade30 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite uma letra (A ate D) para escolher a opcao: ");
        String letra = leia.nextLine();


        switch (letra) {
            case "A" -> System.out.println("Voce escolheu a opcao A!");
            case "B" -> System.out.println("Voce escolheu a opcao B!");
            case "C" -> System.out.println("Voce escolheu a opcao C!");
            case "D" -> System.out.println("Voce escolheu a opcao D!");
            default -> System.out.println("Opcao invalida!");
        }
    }
}
