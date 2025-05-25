package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer13_PromocaoLoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto 1: ");
        double produto1 = sc.nextDouble();

        System.out.println("Digite o valor do produto 2: ");
        double produto2 = sc.nextDouble();

        System.out.println("Digite o valor do produto 3: ");
        double produto3 = sc.nextDouble();

        sc.close();

        double promocao = produto3 * 0.50;
        double valorTotal = produto1 + produto2 - promocao;

        System.out.printf("Valor da Compra: R$ %.2f\n", valorTotal);

    }
}