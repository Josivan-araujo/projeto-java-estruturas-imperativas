package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer02_CalculoMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a nota 1: ");
        double nota1 = sc.nextDouble();
        
        System.out.println("Digite a nota 2: ");
        double nota2 = sc.nextDouble();

        sc.close();

        double soma = nota1 + nota2;
        double media = soma / 2;

        System.out.printf("A média do aluno foi: " + media);
    }
}