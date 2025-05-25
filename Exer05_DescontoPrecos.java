package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer05_DescontoPrecos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String produto = sc.nextLine();

        System.out.println("Digite o valor atual do produto: ");
        double valorAtual = sc.nextDouble();

        sc.close();

        double desconto = valorAtual * 0.045;
        double novoValor = valorAtual - desconto;

        System.out.println("Nome do produto: " + produto);
        System.out.printf("Valor do produto com desconto: %.2f\n", novoValor);


    }
}