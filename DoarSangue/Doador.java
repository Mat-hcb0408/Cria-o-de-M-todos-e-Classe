package DoarSangue;

public class Doador{
    public int idade;
    public double peso;
    //construtor
    public Doador(int idade,double peso) {
        this.idade = idade;
        this.peso=peso;
    }
    public String verificacao(){
        String result;
        if (this.idade >= 18 && this.idade <= 65 && this.peso >= 50) {
            result = "Apto(a) para doar sangue";
        } else {
            result = "Não está apto(a) para doar sangue";
        }
        return result;
    }
}