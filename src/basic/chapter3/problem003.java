package basic.chapter3;

import java.util.Scanner;

public class problem003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1번째 줄에 수의 개수 n과 합을 구해야하는 횟수 m 입력
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        //n 범위 체크
        if (n >= 1 && n <= 100000) {
            //입력할 수의 개수 n만큼 크기의 배열 생성
            int[] nums = new int[n];

            //2번째 줄에 n개의 수 입력
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            //m 범위 체크
            if (m >= 1 && m <= 100000) {
                int sum = 0;

                //세 번째 줄부터 m개 줄에 합을 구해야하는 구간 [i, j] 입력
                for (int k = 0; k < m; k++) {
                    //n개의 수 중 i번째 수에서 j번째 수까지 합 구하기
                    int i = scanner.nextInt();
                    for (int j = scanner.nextInt(); j >= i && j <= nums.length; j--) {
                        //합할 수 범위 체크
                        if (nums[j-1] <= 1000) {
                            sum += nums[j-1];
                        }
                    }
                    System.out.println(sum);

                    //한 줄 합 구한 뒤 sum 0으로 초기화
                    sum = 0;
                }
            } else {
                System.out.println("m의 범위를 확인하고 다시 입력해주세요.");
            }
        } else {
            System.out.println("n의 범위를 확인하고 다시 입력해주세요.");
        }
    }
}
