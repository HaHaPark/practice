import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int operations = 0;
        while (true) {
            int positiveCount = 0;
            for (int num : arr) {
                if (num > 0) {
                    positiveCount++;
                }
            }

            if (positiveCount <= 1) break;

            Arrays.sort(arr, Collections.reverseOrder());

            arr[0]--;
            arr[1]--;
            operations++;
        }
        System.out.println(operations);
        sc.close();
    }
}
