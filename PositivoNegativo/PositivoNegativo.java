package PositivoNegativo;

public class PositivoNegativo {
    public int numero;

    public PositivoNegativo(int numero) {
        this.numero = numero;
    }
    public String Verificacao(int numero){
        String result;
        if (this.numero>0){
            result=this.numero+" é positivo";
        }else if(this.numero<0){
            result=this.numero+" é negativo";
        }else{
            result=this.numero+" é nulo";
        }
        return result;
    }
}
