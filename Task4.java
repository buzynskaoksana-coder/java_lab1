import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = in.nextLine();

        String[] words = text.split("[\\s,.:;\\-?!]+");

        int maxLen = 0;
        for (String w : words) {
            if (w.length() > maxLen) {
                maxLen = w.length();
            }
        }

        StringBuilder result = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty() && w.length() < maxLen) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(w);
            }
        }

        System.out.println("Текст після вилучення найдовших слів:");
        System.out.println(result);

        in.close();
    }
}