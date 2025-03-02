import java.util.Scanner;
public class Main {
    public static class Schet{
        private double x;
        private double a;
        private double b;
        public Schet(double x, double a, double b){
            this.x=x;
            this.a=a;
            this.b=b;
        }
        public double Schet1(){
            return 3*this.x+5;
        }
        public double Schet2(){
            if(this.a==this.b){
                System.out.println("Деление на ноль(");
                return 0;
            }
            return (this.a+this.b)/(this.a-this.b);
        }
        public double Schet3(){
            if (this.x==0||this.a==0||this.b==0){
                System.out.println("Деление на ноль(");
                return 0;
            }
            double primer = this.a*this.x/this.b;
            int prim = (int)Math.round(primer);
            return factorial(prim);
        }
        private double factorial(int prim){
            if (prim<0){
                System.out.println("Отрицательные числа не вводить(");
                return 0;
            }
            double f = 1;
            for (int i=1; i<=prim; i++){
                f*=i;
            }
            return f;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();
        Schet one = new Schet(x, a, b);
        Schet two = new Schet(x, a, b);
        Schet three = new Schet(x, a, b);
        System.out.println("Результат для y=3x+5: " + one.Schet1());
        System.out.println("Результат для y=(a+b)/(a-b): " + two.Schet2());
        System.out.println("Результат для y=(ax/b)!: " + three.Schet3());
    }
}