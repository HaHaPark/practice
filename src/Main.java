import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        if (isStrictlyIncreasing(A)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean isStrictlyIncreasing(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] >= A[i + 1]) {
                return false;
            }
        }
        return true;
    }
}