import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class hee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 내림차순 정렬을 위해 Integer 배열을 사용
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
            // 양의 요소가 1개 이하이면 종료
            if (positiveCount <= 1) break;

            // 배열을 내림차순으로 정렬
            Arrays.sort(arr, Collections.reverseOrder());
            // A1, A2를 각각 1씩 감소 (양의 요소가 2개 이상 있으므로 arr[0]과 arr[1]은 반드시 양수)
            arr[0]--;
            arr[1]--;
            operations++;
        }
        System.out.println(operations);
        sc.close();


    }
}
