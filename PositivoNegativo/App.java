package PositivoNegativo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero:");
        int numero=sc.nextInt();
        sc.close();
        PositivoNegativo positivoNegativo=new PositivoNegativo(numero);
        System.out.println(positivoNegativo.Verificacao(numero));
    }
}
