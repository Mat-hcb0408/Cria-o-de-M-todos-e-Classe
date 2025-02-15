package Senha;
import Senha.Senha;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua senha: ");
        int senha= sc.nextInt();
        sc.close();
        //instancia
        Senha senha1=new Senha(senha);
        System.out.println(senha1.verificarAcesso());
    }
}