package chap05.recur.exam;

import java.util.Scanner;

public class Recur {
	
	static void recur(int n ) { 
		
		// 메서드 안에서 재귀 호출을 2번 실행
		if(n > 0) {
			recur(n-1);
			System.out.println(n);
			recur( n -2 );
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		sc.nextLine();
		
		recur(x);
	}

}
