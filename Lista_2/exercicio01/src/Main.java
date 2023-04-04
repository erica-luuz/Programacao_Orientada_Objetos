import java.util.Scanner;
public class Main {

    static  String categoria(int idade){
        if ( idade >= 5 && idade < 8){
            String solucaoA = "Infantil A";
            return solucaoA;
        }
        if ( idade >= 8 && idade < 11){
            String solucaoB = "Infantil B";
            return solucaoB;
        }
        if ( idade >= 11 && idade < 14){
            String solucaoC = "Juvenil A";
            return solucaoC;
        }
        if ( idade >= 14 && idade < 18){
            String solucaoD = "Juvenil B";
            return solucaoD;
        }
        if (idade >= 18){
            String solucaoE = "Adulto";
            return solucaoE;
        }
        else {
            return "Idade não permitida";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        String resultado = categoria(idade);
        System.out.println(resultado);






    }
}