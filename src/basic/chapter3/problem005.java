package basic.chapter3;

import java.util.Scanner;

public class problem005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1번째 줄에 주어진 수의 갯수 n과 나누는 수 m 입력
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        //n 범위 체크
        if (n >= 1 && n <= 1000000) {
            long[] S = new long[n];

            //합 배열 구하기
            for (int i = 1; i < n; i++) {
                S[i] = S[i - 1] + scanner.nextInt();
            }

            //m 범위 체크
            if (m >= 2 && m <= 1000) {
                long[] mS = new long[n];
                for (int i = 0; i < n; i++) {
                    //합 배열 S 나누기 m 해주고 남은 나머지로 이뤄진 새 배열 구하기
                    mS[i] = (int) (S[i] % m);
                }

                int total = 0;
                for (int i = 0; i < n; i++) {
                    //구간 합 나머지 값이 0인 건 배열의 첫 번째 값부터 구간 합 부분까지가 m으로 나누어 떨어졌다는 의미 !
                    if (mS[i] == 0) total++;

                    //구간 합 나머지 값이 각각 같은 a & b의 경우, 이 둘을 뺐을 때 0이 되므로 a + 1부터 b까지의 합이 m으로 나누어 떨어진다는 것 !
                    for (int j = i + 1; j < n; j++) {
                        if (mS[i] == mS[j]) total++;
                    }
                }

                System.out.println(total);
            } else {
                System.out.println("m의 범위를 확인해주세요.");
            }
        } else {
            System.out.println("n의 범위를 확인해주세요.");
        }
    }
}
