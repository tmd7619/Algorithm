package chap04.stackQ.exam;

import java.util.Scanner;
// 링 버퍼 -> 오래된 데이터를 버리는 용도로 사용 가능 
// 정수 입력은 무한히 할 수 있지만 배열에 저장되는 데이터는 가장 최근에 입력한 x개의 데이터만 링 버퍼에 남아있다.
// 원하는 개수만큼 값을 입력 받아 요솟수 N인 배열에 마지막 N개를 저장
// 

class LastNElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 size를 입력하세요 : ");
		final int n = sc.nextInt();
		sc.nextLine();
		
		int[] a = new int[n];		// 입력 받은 값을 저장
		int cnt = 0;				// 입력 받은 개수
		int retry;					// 다시 한 번?

		System.out.println("정수를 입력하세요.");

		do {
			System.out.printf("%d번째 정수：", cnt + 1);
			a[cnt++ % n] = sc.nextInt();
			sc.nextLine();

			System.out.print("계속 할까요? (예.1／아니오.0）：");
			retry = sc.nextInt();
			sc.nextLine();
		} while (retry == 1);

		int i = cnt - n;
		if (i < 0) i = 0;

		for ( ; i < cnt; i++)
			System.out.printf("%2d번째의 정수 ＝ %d\n", i + 1, a[i % n]);
	}
}
