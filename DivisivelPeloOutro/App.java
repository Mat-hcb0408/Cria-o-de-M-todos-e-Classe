package DivisivelPeloOutro;
import DivisivelPeloOutro.Divisivel;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int num1 = sc.nextInt();
        System.out.println("Insira outro numero");
        int num2 = sc.nextInt();
        sc.close();
        //instanciação
        Divisivel divisivel=new Divisivel(num1,num2);
        System.out.println(divisivel.verificacao());
    }
}