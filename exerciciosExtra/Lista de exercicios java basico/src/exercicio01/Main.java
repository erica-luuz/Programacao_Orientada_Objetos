package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade em anos,meses e dias:");
        int ano = scan.nextInt();
        int meses = scan.nextInt();
        int dias = scan.nextInt();

        ano = ano * 365;
        meses =meses * 30;
        int resposta = ano + meses + dias;

        System.out.println(resposta + " dias.");
    }
}