package Notas;

public class Notas {
    private double nota1;
    private double nota2;
    private double media;

    //construtor
    public Notas(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    //getter
    public double getMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public String Aprovacao() {
        String result;
        if (this.getMedia()>=7){
            result="O aluno foi aprovado!";
        }else {
            result="O aluno NÃO foi aprovado.";
        }
        return result;
    }
    public String verificarAprovacao(){
        return Aprovacao();
    }
}