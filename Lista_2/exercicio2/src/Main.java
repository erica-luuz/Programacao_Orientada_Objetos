import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0, numeroFichas = 3;
        double somaSalario = 0.0, mediaSalario = 0.0, somaFilhos = 0.0, mediaFilhos = 0.0;
        double maiorSalario = 0.0;

        while ( contador < numeroFichas ) {
            System.out.println("Digite o " + (contador + 1) + "º Salário R$ ");
            double salario = scanner.nextDouble();
            System.out.println("Digite a quantidade de filhos: ");
            double qtdaFilhos = scanner.nextDouble();
            contador++;

            if (maiorSalario < salario){
                maiorSalario = salario;
            }

            somaSalario = somaSalario + salario;
            mediaSalario = somaSalario / numeroFichas;

            somaFilhos = somaFilhos + qtdaFilhos;
            mediaFilhos = somaFilhos / numeroFichas;


        }
        System.out.println("A média dos Salários é R$ " + mediaSalario);
        System.out.println("A média do números de filhos é:  " + mediaFilhos);
        System.out.println("O maior Salário é:  " + maiorSalario);
    }
}