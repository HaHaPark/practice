import java.util.Scanner;
import java.util.HashSet;

public class simple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int removals = 0;

        HashSet<Long> seenEdges = new HashSet<>();

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            if (u == v) {
                removals++;
                continue;
            }
            int a = Math.min(u, v);
            int b = Math.max(u, v);

            //二つの頂点を一つの値に合わせる
            long edgeId = (long) a * (N + 1) + b;

            if (seenEdges.contains(edgeId)) {
                removals++;
            } else {

                seenEdges.add(edgeId);
            }
        }



        System.out.println(removals);
    }
}
