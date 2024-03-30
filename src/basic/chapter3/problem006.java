package basic.chapter3;

import java.util.Scanner;

public class problem006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1번째 줄에 자연수 n 입력
        int n = scanner.nextInt();

        //n 범위 체크
        if (n >= 1 && n <= 10000000) {
            int[] N = new int[n];

            for (int i = 0; i < n; i++) {
                N[i] = i + 1;
            }

            int count = 1;

            for (int s = 0; s < n - 1; s++) {
                int sum = N[s];
                for (int e = s + 1; n > sum; e++) {
                    sum = sum + N[e];

                    if (n == sum) count++;
                }
            }

            System.out.println(count);
        } else {
            System.out.println("n의 범위를 확인해주세요.");
        }
    }
}
