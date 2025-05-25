package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer01_Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();

        sc.close();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double divisao = (double) num1 / num2;
        double multiplicacao = num1 * num2;
        
        
        System.out.println("Resultados: ");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicação: " + multiplicacao);

    }
}