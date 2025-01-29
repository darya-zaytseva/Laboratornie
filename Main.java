import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = in.nextDouble();
        if (Math.abs(x)>1)
            System.out.println("Число меньше 1");
        else {
            double sum = 0;
            for (double n = 0; n <= x; n++) {
                double schet = (Math.pow(x, (2 * n + 1)) / (2 * n + 1));
                sum += schet;
            }
            double b = sum * 2;
            System.out.println(b);
        }
    }
}