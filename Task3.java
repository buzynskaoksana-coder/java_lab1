import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть розмірність матриці n (n <= 15): ");
        int n = in.nextInt();

        int[][] x = new int[n][n];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = in.nextInt();
            }
        }

        boolean[] l = new boolean[n];
        for (int i = 0; i < n; i++) {
            int neg = 0;
            int pos = 0;
            for (int j = 0; j < n; j++) {
                if (x[i][j] < 0) {
                    neg++;
                } else if (x[i][j] > 0) {
                    pos++;
                }
            }
            l[i] = neg > pos;
        }

        System.out.println("Логічний вектор L:");
        for (int i = 0; i < n; i++) {
            System.out.print(l[i] + " ");
        }
        System.out.println();

        in.close();
    }
}