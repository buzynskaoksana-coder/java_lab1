import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    static double calc(double x, double y) {
        return 1.0 / (x * y) + (1.0 / (x * x + y * y)) * (x - y);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("1) Enter double x and y:");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double res1 = calc(x1, y1);
        System.out.println("Result (double): " + res1);

        System.out.println("\n2) Enter int x and y:");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        double res2 = 1.0 / (x2 * y2) + (1.0 / (x2 * x2 + y2 * y2)) * (x2 - y2);
        System.out.println("Result (double): " + res2);

        System.out.println("\n3) Enter double x and y:");
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        int res3 = (int) calc(x3, y3);
        System.out.println("Result (int): " + res3);

        in.close();
    }
}