package DoarSangue;

import DoarSangue.Doador;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Informe seu peso (kg): ");
        double peso = sc.nextDouble();
        sc.close();
        //instanciação
        Doador doador=new Doador(idade,peso);
        System.out.println(doador.verificacao());
    }
}