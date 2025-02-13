package Notas.Main;
public class GradeCalculator {

    public double n1,n2;
    public double result;

    public static double Aprovacao(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    public static String ShowResult(double media) {
        String aux;
        if (media >= 7) {
            aux = "O Aluno foi aprovado";
        } else {
            aux = "O Aluno não foi aprovado";
        }
        return aux;
    }
}