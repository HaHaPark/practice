import java.util.Scanner;

public class connect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next().trim();
        int count = 0;
        int n = S.length();
        //１目のfor文：可能な全てのiを巡回
        for (int i = 0; i < n; i++) {
            //indexのiの文字が’A'でない場合条件を満たされないので次のiへ進む
            if (S.charAt(i) != 'A') continue;
            //iより大きいindex　jを選択して巡回
            //j＞i の場合だけ考える
            for (int j = i + 1; j < n; j++) {
                //index　jの文字がBじゃなければ条件の満たしていないので次のjに移動
                if (S.charAt(j) != 'B') continue;
                //j - i = k - j  =>  k = 2*j - i
                //k番の文字がCか検査
                int k = 2 * j - i;
                if (k < n && S.charAt(k) == 'C') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
