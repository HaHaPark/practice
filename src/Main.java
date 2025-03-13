import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long globalT = 1;

        for (int i = 0; i < N; i++) {
            long H = sc.nextLong();

            int m = (int)((globalT - 1) % 3);
            int[] pattern;
            int[] prefix = new int[4];
            if (m == 0) {
                pattern = new int[]{1, 1, 3};
            } else if (m == 1) {
                pattern = new int[]{1, 3, 1};
            } else {
                pattern = new int[]{3, 1, 1};
            }
            prefix[1] = pattern[0];
            prefix[2] = pattern[0] + pattern[1];
            prefix[3] = 5;

            long bestA = Long.MAX_VALUE;
            for (int r = 1; r <= 3; r++) {
                long q;
                if (H <= prefix[r]) {
                    q = 0;
                } else {
                    long diff = H - prefix[r];
                    q = (diff + 5 - 1) / 5;
                }
                long candidateA = 3 * q + r;
                bestA = Math.min(bestA, candidateA);
            }
            globalT += bestA;
        }

        System.out.println(globalT - 1);
        sc.close();
    }
}
