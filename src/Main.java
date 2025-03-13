import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] strings = new String[N];

        for (int i = 0; i < N; i++) {
            strings[i] = scanner.next();
        }

        Arrays.sort(strings, Comparator.comparingInt(String::length));

        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            result.append(s);
        }

        System.out.println(result.toString());

        scanner.close();
    }
}