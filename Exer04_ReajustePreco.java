package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer04_ReajustePreco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do curso: ");
        String nomeCurso = sc.nextLine();

        System.out.println("Digite o valor atual do curso: ");
        double valorAtual = sc.nextDouble();

        sc.close();

        double aumento = valorAtual * 0.075; 
        double novoValor = valorAtual + aumento;

        System.out.println("Nome do Curso: " + nomeCurso);
        System.out.printf("O novo valor do curso: %.2f\n ", novoValor);


    }
}