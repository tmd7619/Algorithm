package code_up;

import java.util.Scanner;

// 비트시프트 연산 정수 1개 입력받아, 2배 곱해 출력

/* 비트시프트 연산은 8자리의 비트 자리수로 나타내고, 자리수를 직접 옮기기
 */
public class Code_up1047_1048_bitShift {
	
	public static void main(String[] args) {
		
		// 1047
		int a=10; // 2진수 : 0000 1010
		System.out.println( a<<1); // 0001 0100 // 20
		System.out.println( a>>1); // 0000 0101 // 5
		System.out.println( a<<2); // 0010 1000 // 40
		System.out.println( a>>2); // 0000 0010 // 2
		
		
		// 1048
		Scanner sc = new Scanner(System.in);
		
		a = 10;
		System.out.print("제곱승 수를 입력하세요 : ");
		int b = sc.nextInt();
		System.out.println("a << " + b +" : " + Integer.toString(a<<b));

	}

}
