import java.util.Scanner;

public class AtividadeSala12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double[] notas = new double[3];

//        System.out.println("Digite a primeira nota");
//        notas[0] = leia.nextDouble();
//        System.out.println("Digite a segunda nota");
//        notas[1] = leia.nextDouble();
//        System.out.println("Digite a terceira nota");
//        notas[2] = leia.nextDouble();
//
//        System.out.println("A média das notas digitadas é: "+ (notas[0] + notas[1] + notas[2] )/3);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a " + (i+1) + "ª nota");
            notas[i] = leia.nextDouble();
        }
        System.out.println("A média das notas digitadas é: "+ (notas[0] + notas[1] + notas[2] )/3);
    }
}