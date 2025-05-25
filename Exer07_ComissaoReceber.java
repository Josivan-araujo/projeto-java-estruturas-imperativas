package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer07_ComissaoReceber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o Salario Fixo do vendedor: ");
        double slFixo = sc.nextDouble();

        System.out.println("Infome o valor total de vendas realizadas: ");
        double vtVendas = sc.nextDouble();

        sc.close();

        double comissao = vtVendas * 0.15;
        double vtReceber = slFixo + comissao;

        System.out.printf("Salario total a receber: %.2f\n", vtReceber);

        

    }
}