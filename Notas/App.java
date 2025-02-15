package Notas;
import Notas.Notas;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double nota2 = sc.nextDouble();
        sc.close();
        Notas notas=new Notas(nota1,nota2);
        System.out.printf("Média das notas:"+ notas.getMedia()+"\n"+notas.verificarAprovacao());
    }
}