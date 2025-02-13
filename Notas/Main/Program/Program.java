package Notas.Main.Program;

import Notas.Main.GradeCalculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double n2 = sc.nextDouble();

        double media = GradeCalculator.Aprovacao(n1, n2);

        // Exibe o resultado da aprovação
        System.out.println(GradeCalculator.ShowResult(media));

        sc.close();
    }
}