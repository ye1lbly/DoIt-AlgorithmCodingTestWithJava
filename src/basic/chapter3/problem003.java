package basic.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class problem003 {
    public static void main(String[] args) throws IOException {
        /* use prefix sum to solve the problem in time limit */

        //Scanner 대신 BufferedReader 와 InputStreamReader 사용해 입력 객체 생성 -> 입출력 관련한 IOException 사용 필수
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //BufferedReader 는 줄바꿈만 구분하기 때문에, 즉 줄단위로 읽어오므로 반환값이 String 인 readLine() 메서드를 사용해 String 을 입력 받는다.
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //입력 받은 문자열은 Integer.parseInt()를 사용해 정수로 변환해준다.
        int numNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long[] longs = new long[numNo + 1];

        //stringTokenizer 에 입력받을 문자열을 넣는다.
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= numNo; i++) {
            //반환값이 String 인 nextToken() 메서드로 입력받은 문자열을 공백을 기준으로 하나씩 가져온다.
            longs[i] = longs[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int q = 0; q < quizNo; q++) {
            //StringTokenizer 는 지정한 구분자로 문자열을 쪼개 저장하는 클래스이고, 쪼개진 문자열을 token 이라고 한다.
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(longs[j] - longs[i - 1]);
        }

        /* my solution */
//        Scanner scanner = new Scanner(System.in);
//
//        //1번째 줄에 수의 개수 n과 합을 구해야하는 횟수 m 입력
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//
//        //n 범위 체크
//        if (n >= 1 && n <= 100000) {
//            //입력할 수의 개수 n만큼 크기의 배열 생성
//            int[] nums = new int[n];
//
//            //2번째 줄에 n개의 수 입력
//            for (int i = 0; i < n; i++) {
//                nums[i] = scanner.nextInt();
//            }
//
//            //m 범위 체크
//            if (m >= 1 && m <= 100000) {
//                int sum = 0;
//
//                //세 번째 줄부터 m개 줄에 합을 구해야하는 구간 [i, j] 입력
//                for (int k = 0; k < m; k++) {
//                    //n개의 수 중 i번째 수에서 j번째 수까지 합 구하기
//                    int i = scanner.nextInt();
//                    for (int j = scanner.nextInt(); j >= i && j <= nums.length; j--) {
//                        //합할 수 범위 체크
//                        if (nums[j-1] <= 1000) {
//                            sum += nums[j-1];
//                        }
//                    }
//                    System.out.println(sum);
//
//                    //한 줄 합 구한 뒤 sum 0으로 초기화
//                    sum = 0;
//                }
//            } else {
//                System.out.println("m의 범위를 확인하고 다시 입력해주세요.");
//            }
//        } else {
//            System.out.println("n의 범위를 확인하고 다시 입력해주세요.");
//        }
    }
}
