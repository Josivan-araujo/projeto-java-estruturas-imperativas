package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer14_CalculoJurosSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o valor do empréstimo: ");
        double valorEmprestimo = sc.nextDouble();

        System.out.println("Informe a quantidades de meses: ");
        int qtdMeses = sc.nextInt();

        sc.close();

        double juros = valorEmprestimo * 0.05 * qtdMeses;
        double totalPago = valorEmprestimo + juros;

        System.out.printf("Total a ser pago: R$ %.2f\n", totalPago);

    }
}