package ExerciciosEstruturasImperativas;
import java.util.Scanner;

public class Exer08_EstatisticaConcursoPublico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.println("Qtde de Homens presentes: ");
        int qtdeHomensPresentes = sc.nextInt();

        System.out.println("Qtde de Mulheres presentes: ");
        int qtdeMulheresPresentes = sc.nextInt();

        System.out.println("Qtde de Ausentes: ");
        int qtdeAusentes = sc.nextInt();

        sc.close();

        int totalInscritos = qtdeAusentes + qtdeHomensPresentes + qtdeMulheresPresentes;

        double p1 = (double) qtdeHomensPresentes / totalInscritos * 100;
        double p2 = (double) qtdeAusentes / totalInscritos * 100;

        System.out.printf("P1 = %.4f%%\n", p1);
        System.out.printf("P2 = %.4f%%\n", p2);
        
    }
}