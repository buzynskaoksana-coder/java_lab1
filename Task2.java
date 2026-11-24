import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть радіус r: ");
        double r = in.nextDouble();

        System.out.print("Введіть кількість точок n (n <= 200): ");
        int n = in.nextInt();

        double[] a = new double[2 * n];
        System.out.println("Введіть " + (2 * n) + " координат (x1 y1 x2 y2 ...):");
        for (int i = 0; i < 2 * n; i++) {
            a[i] = in.nextDouble();
        }

        int count = 0;
        for (int i = 0; i < 2 * n; i += 2) {
            double x = a[i];
            double y = a[i + 1];
            if (x * x + y * y <= r * r) {
                count++;
            }
        }

        System.out.println("Кількість точок, що належать кругу: " + count);
        in.close();
    }
}