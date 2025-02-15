package Senha;

public class Senha {
    private int senha;
    //construtor
    public Senha(int senha) {
        this.senha = senha;
    }
    private String Acesso () {
        String result;
        if (this.senha == 1234) {
            result="acesso liberado";
        } else {
            result="acesso negado";
        }
        return result;
    }
    //metodo para vizualisar o resultado
    public String verificarAcesso(){
        return Acesso();
    }
}