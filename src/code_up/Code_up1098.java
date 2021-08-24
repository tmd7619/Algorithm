package code_up;

import java.util.Scanner;

public class Code_up1098 {

    // 다시풀어보기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x좌표 입력 : ");
        int sizeX = scanner.nextInt();
        System.out.println("y좌표 입력 : ");
        int sizeY = scanner.nextInt();

        // 배열 생성
        int[][] arr = new int[sizeX][sizeY];

        int n = scanner.nextInt();
        int l, d, x, y;

        // 갯수 만큼 반복
        for (int i = 0; i < n; i++) {
            l = scanner.nextInt();
            d = scanner.nextInt();
            x = scanner.nextInt();
            y = scanner.nextInt();

            // 막대의 가로 세로 구분
            if (d == 0) {
                for (int a = y; a < y + l; a++) {
                    arr[x - 1][a - 1] = 1;
                }
            } else {
                for (int a = x; a < x + l; a++) {
                    arr[a - 1][y - 1] = 1;
                }
            }

        }

        // 배열 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
