package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer03_SalarioProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a quantdade de horas trabalhadas: ");
        double qtdHora = sc.nextDouble();

        System.out.println("Digite o valor da hora de trabalho: ");
        double valorHora = sc.nextDouble();

        sc.close();

        double salario = qtdHora * valorHora;

        System.out.printf("O salário do professor no mês é: " + salario);

    }

}