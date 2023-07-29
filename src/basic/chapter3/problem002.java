package basic.chapter3;

import java.util.Scanner;

public class problem002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1번째 줄에 시험 본 과목 개수 입력
        int n = scanner.nextInt();

        //과목 개수 체크
        if (n <= 1000) {
            //과목 개수만큼 배열 생성
            int[] scoreArray = new int[n];

            //2번째 줄에 세준이 현재 성적 입력
            for (int i = 0; i < n; i++) {
                scoreArray[i] = scanner.nextInt();
            }

            //최댓값 찾기
            int M = 0;
            int sum = 0;
            for (int j : scoreArray) {
                if (M < j) M = j;
                sum += j;
            }

            //점수 범위 체크
            if (M == 0) {
                System.out.println("점수 중 적어도 하나는 0점이 아니어야 합니다.");
            } else if (M > 100) {
                System.out.println("점수는 100점을 넘길 수 없습니다.");
            } else {
                //점수 조작 및 평균 구하기
                double avg = sum * 100.0 / M / n;
                System.out.println(avg);
            }
        }
    }
}
