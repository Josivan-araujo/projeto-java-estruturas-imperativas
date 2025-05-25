package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer12_Rateio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de apt: ");
        int qtdAptos = sc.nextInt();
        
        System.out.println("Digite o valor da conta de energia: ");
        int valorEnergia = sc.nextInt();

        System.out.println("Digite o valor da conta de água: ");
        int valorAgua = sc.nextInt();

        sc.close();

        double rateio = (valorAgua + valorEnergia) / qtdAptos;

        System.out.printf("O valor de rateio %.2f", + rateio);


    }
}