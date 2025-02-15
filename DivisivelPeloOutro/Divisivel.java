package DivisivelPeloOutro;

public class Divisivel {
    public int num1;
    public int num2;
    //construtor
    public Divisivel(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public String verificacao() {
        String result;
        if (this.num1 % this.num2 == 0) {
            result = this.num1 + " é divisível por " + this.num2;
        } else if (this.num2 % this.num1 == 0) {
            result = this.num2 + " é divisível por " + this.num1;
        } else {
            result = "Nenhum dos números é divisível pelo outro.";
        }
        return result;
    }
}