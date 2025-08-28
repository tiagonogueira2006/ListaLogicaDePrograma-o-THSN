
import java.util.Scanner;

public class AtividadeSala15 {

    public static double soma(double x, double y){
        return x + y;
    }
    public static double sub(double x, double y){
        return x - y;
    }
    public static double divi(double x, double y){
        return x / y;
    }
    public static double mult(double x, double y){
        return x * y;
    }

    public static void printResultado(char op, double x, double y, double resultado) {
        System.out.println( x + " "+ op + y + " = " + resultado);
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao = 0;
        double x = 0;
        double y = 0;
        String historico = "";

        do {

            System.out.println("Calculadora: \n" +
                    "Escolha uma das opões abaixo:");
            System.out.println("1- Soma \n" +
                    "2- Subtração \n" +
                    "3- Multiplicação \n" +
                    "4- Divisão \n"+
                    "5- Sair");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Soma");
                    System.out.println("Digite o número para x");
                    x = leia.nextDouble();
                    System.out.println("Digite o número para y");
                    y = leia.nextDouble();
                    printResultado('+', x, y, soma(x,y));
                    historico += x + " + " + y + " = " + soma(x,y) + "\n";
                    break;
                case 2:
                    System.out.println("Subtração");
                    System.out.println("Digite o número para x");
                    x = leia.nextDouble();
                    System.out.println("Digite o número para y");
                    y = leia.nextDouble();
                    printResultado('-', x, y, sub(x,y));
                    historico += x + " - " + y + " = " + sub(x,y) + "\n";
                    break;
                case 3:
                    System.out.println("Multiplicação");
                    System.out.println("Digite o número para x");
                    x = leia.nextDouble();
                    System.out.println("Digite o número para y");
                    y = leia.nextDouble();
                    printResultado('*', x, y, mult(x,y));
                    historico += x + " * " + y + " = " + mult(x,y) + "\n";
                    break;
                case 4:
                    System.out.println("Divisão");
                    System.out.println("Digite o número para x");
                    x = leia.nextDouble();
                    System.out.println("Digite o número para y");
                    y = leia.nextDouble();
                    printResultado('/', x, y, divi(x,y));
                    historico += x + " / " + y + " = " + divi(x,y) + "\n";
                    break;
                case 5:
                    System.out.println("Histórico:");
                    System.out.println(historico);
            }
        } while (opcao < 5);


        //Utilizando funções e procedimentos faça:
        /*

        1- Quatros operações básicas da matemática (soma, subtração, divisão, multiplicação)
        2- Metodo para calcular a potência de um número real elevado a um número inteiro, tal como: potenciacao(numero,expoente);
        3- Faça um menu para escolha das 5 operações e a opção de sair;
        4- Crie um procedimento que dado o 'char' da operação, imprima os valores, tal como: printResultado(op,x,y);
        6- Se opção 'sair' escolhido, listar todas as operações realizadas;
         */

    }
}