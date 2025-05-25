package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer09_ContaEnergia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.println("Informe a quantidade de quilowatt consumido: ");
        double qtdKw = sc.nextDouble();

        sc.close();

        double valorKw = salarioMinimo / 1000;
        double valorConta = valorKw * qtdKw;
        double desconto = valorConta * 0.15;
        double contaDesconto = valorConta - desconto;

        System.out.printf("Valor do KW: R$ %.2f\n", valorKw);
        System.out.printf("Valor da conta: R$ %.2f\n", valorConta);
        System.out.printf("Valor com 15%% de desconto: R$ %.2f\n", contaDesconto);
        
    }
}