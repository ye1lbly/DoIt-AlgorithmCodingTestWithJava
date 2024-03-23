package basic.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem005 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //1번째 줄에 주어진 수의 갯수 n과 나누는 수 m 입력
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        //n 범위 체크
        if (n >= 1 && n <= 1000000) {
            long[] A = new long[n + 1];
            long[] S = new long[n + 1];
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int i = 1; i <= n; i++) {
                //2번째 줄에 n개의 수 입력
                A[i] = Integer.parseInt(stringTokenizer.nextToken());

                //합 배열 구하기
                S[i] = S[i - 1] + A[i];
            }

            //m 범위 체크
            if (m >= 2 && m <= 1000) {
                long[] mS = new long[n + 1];
                for (int i = 1; i <= n; i++) {
                    //합 배열 S 나누기 m 해주고 남은 나머지로 이뤄진 새 배열 구하기
                    mS[i] = S[i] % m;
                }

                int total = 0;
                for (int i = 1; i <= n; i++) {
                    //구간 합 나머지 값이 0인 건 배열의 첫 번째 값부터 구간 합 부분까지가 m으로 나누어 떨어졌다는 의미 !
                    if (mS[i] == 0) total = total + 1;

                    //구간 합 나머지 값이 각각 같은 a & b의 경우, 이 둘을 뺐을 때 0이 되므로 a + 1부터 b까지의 합이 m으로 나누어 떨어진다는 것 !
                    for (int j = i + 1; j <= n; j++) {
                        if (mS[i] == mS[j]) total = total + 1;
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
