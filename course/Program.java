package course;

public class Program {
    public int a;
    public int b;
    public int c;

    public Program(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String verificacao() {
        String result;
        if (this.a > this.b && this.a > this.c) {
            result="Higher= " + this.a;
        } else if (this.b > this.c) {
            result="Higher= " + this.b;
        } else {
            result="Higher= " + this.c;
        }
        return result;
    }
}