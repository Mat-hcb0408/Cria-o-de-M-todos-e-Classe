package course;
import course.Program;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter three numbers:");
    int a=sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt();
    sc.close();
    Program program=new Program(a,b,c);
        System.out.println(program.verificacao());
}
}