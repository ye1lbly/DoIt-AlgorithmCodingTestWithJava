package basic.chapter3;

import java.util.Scanner;

public class problem001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1번째 줄에 숫자 개수 입력
        int n = scanner.nextInt();

        //2번째 줄에 숫자 공백 없이 입력 -> 문자열로 저장
        String string = scanner.next();

        //문자열 문자로 변환해 저장
        char[] chars = string.toCharArray();

        //숫자 개수와 입력된 숫자 길이가 다른 경우 체크
        if (chars.length != n) {
            System.out.println("숫자를 첫 번째 줄에 입력한 개수에 맞게 입력해주세요.");
        } else {
            //각 배열의 값 하나씩 더하기
            int sum = 0;
            for (char aChar : chars) {
                sum += aChar - '0';
            }
            System.out.println(sum);
        }
    }
}
