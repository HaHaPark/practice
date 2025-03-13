import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        StringBuilder sb = new StringBuilder(n);
        int i = 0;
        while (i < n) {
            char c = s.charAt(i);
            if (c == 'W') {
                int j = i;
                while (j < n && s.charAt(j) == 'W') {
                    j++;
                }
                if (j < n && s.charAt(j) == 'A') {
                    int countW = j - i;
                    sb.append('A');
                    for (int k = 0; k < countW; k++) {
                        sb.append('C');
                    }
                    i = j + 1;
                } else {

                    while (i < j) {
                        sb.append('W');
                        i++;
                    }
                }
            } else {
                sb.append(c);
                i++;
            }
        }
        System.out.println(sb.toString());
    }
}
