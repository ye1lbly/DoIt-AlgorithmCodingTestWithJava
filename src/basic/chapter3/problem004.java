package basic.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem004 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //1번째 줄에 표의 크기(n*n)와 합을 구해야 하는 횟수 m 입력
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        //n 범위 체크
        if (n >= 1 && n <= 1024) {
            long[][] N = new long[n + 1][n + 1];
            long[][] S = new long[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                for (int j = 1; j <= n; j++) {
                    //n*n 표에 숫자를 하나씩 채워넣기
                    N[i][j] = Integer.parseInt(stringTokenizer.nextToken());

                    //구간합 구하기
                    S[i][j] = N[i][j] + S[i][j - 1] + S[i - 1][j] - S[i - 1][j - 1];
                }
            }

            //m 범위 체크
            if (m >= 1 && m <= 100000) {
                for (int i = 0; i < m; i++) {
                    stringTokenizer = new StringTokenizer(bufferedReader.readLine());

                    //(x1, y1)부터 (x2, y2)까지의 합 출력하기 위해 정수 4개 입력.
                    int x1 = Integer.parseInt(stringTokenizer.nextToken());
                    int y1 = Integer.parseInt(stringTokenizer.nextToken());
                    int x2 = Integer.parseInt(stringTokenizer.nextToken());
                    int y2 = Integer.parseInt(stringTokenizer.nextToken());

                    //x1, x2, y1, y2 범위 체크
                    if (x1 <= x2 && x2 < 1000 && y1 <= y2 && y2 < 1000) {
                        //표 생각 ! 전체 구간합 - 제외된 위 가로 구간합 - 제외된 왼 세로 구간합 + 중복으로 빠진 구간합
                        System.out.println(S[x2][y2] - S[x1 - 1][y2] - S[x2][y1 - 1] + S[x1 - 1][y1 - 1]);
                    } else {
                        System.out.println("x1, x2, y1, y2의 범위를 확인해주세요.");
                    }
                }
            } else {
                System.out.println("m의 범위를 확인해주세요.");
            }
        } else {
            System.out.println("n의 범위를 확인해주세요.");
        }
    }
}
