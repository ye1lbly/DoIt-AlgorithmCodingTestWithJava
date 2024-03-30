package basic.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class problem007 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //1번째 줄에 재료의 개수 n 입력
        int n = Integer.parseInt(bufferedReader.readLine());

        //2번째 줄에 갑옷을 만드는 데 필요한 수 m 입력
        int m = Integer.parseInt(bufferedReader.readLine());

        //n 범위 체크
        if (n >= 1 && n <= 15000) {

            //3번째 줄에 n개의 재료들이 가진 고유한 번호들이 공백을 사이에 두고 입력
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int[] N = new int[n];
            for (int i = 0; i < n; i++) {
                N[i] = Integer.parseInt(stringTokenizer.nextToken());
            }

            //n개의 수 오름차순으로 정렬
            Arrays.sort(N);

            //m 범위 체크
            if (m >= 1 && m <= 10000000) {
                int count = 0;

                //투 포인터 정의
                int i = 0;
                int j = n - 1;

                //포인터 이동해가며 조건에 맞는 처리
                while (i < j) {
                    if (m > N[i] + N[j]) { //번호의 합이 m보다 작으므로 작은 번호 index 올리기
                        i++;
                    }
                    else if (m < N[i] + N[j]) { //번호의 합이 m보다 크므로 큰 번호 index 내리기
                        j--;
                    }
                    else { //번호의 합이 m과 같아졌으므로 양쪽 포인터 모두 이동시키기
                        count++;
                        i++;
                        j--;
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
