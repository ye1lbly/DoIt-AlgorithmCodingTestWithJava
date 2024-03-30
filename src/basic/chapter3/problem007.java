package basic.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem007 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //1번째 줄에 재료의 개수 n 입력
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        //2번째 줄에 갑옷을 만드는 데 필요한 수 m 입력
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        //n 범위 체크
        if (n >= 1 && n <= 15000) {

            //3번째 줄에 n개의 재료들이 가진 고유한 번호들이 공백을 사이에 두고 입력
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int[] N = new int[n];
            for (int i = 0; i < n; i++) {
                N[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            //m 범위 체크
            if (m >= 1 && m <= 10000000) {
                int count = 0;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (m == N[i] + N[j]) count++;
                    }
                }
                System.out.println(count);
            } else {
                System.out.println("m의 범위를 확인해주세요.");
            }
        } else {
            System.out.println("n의 범위를 확인해주세요.");
        }
    }
}
