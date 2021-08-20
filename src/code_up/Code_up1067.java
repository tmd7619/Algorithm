package code_up;

import java.util.Scanner;

public class Code_up1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1067번 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.(중첩 if사용)
		int a = sc.nextInt();
		sc.nextLine();
		if (a > 0) { // a가 양수인경우,
			if (a % 2 == 0) { // 짝수인경우,
				System.out.println("a는 양수이면서 짝수입니다.");
			} else {
				System.out.println("a는 양수이면서 홀수");
			}

		} else {
			if (a % 2 == 0) {
				System.out.println("a는 음수이면서 짝수");
			} else {
				System.out.println("a는 음수이면서 홀수");
			}
		}

	

	}

}
