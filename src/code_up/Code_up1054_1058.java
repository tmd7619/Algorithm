package code_up;

import java.util.Scanner;

public class Code_up1054_1058 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1054번 // 두개의 참(1) 또는 거짓(0)이 입력될 때, 모두 참일 때에만 참을 출력
		System.out.println(true && true ? 1 : 0);
		System.out.println(true && false ? 1 : 0); // and연산자는 모두다 참일경우 참을 출력 
		
		// 1055번 // 하나라도 참일경우 참 출력
		System.out.println(true || false ? 1: 0); // or연산자는 뒤에 조건 상관없이 앞이 참이면, 참출력
		System.out.println(false || true ? 1: 0);
		
		// 1056번 두 가지의 참(1) 또는 거짓(0)이 입력될 때, 참/거짓이 서로 다를 때에만 참을 출력
		/*
		 	이러한 논리 연산을 XOR(exclusive or , 배타적 논리합) 연산이라고 부른다.
		 	집합의 의미로는 합집합에서 교집합을 뺀 것
		 */
		int a = sc.nextInt();
		int b= sc.nextInt();
		if( (a ==1 && b== 0) || (a == 0 && b == 1) ) // a 와 b가 서로 다른 0 or 1 일때 1을 출력
			System.out.println(1);
		else
			System.out.println(0);
		
		// 1057 // 두 개의 참 또는 거짓이 입력될 때, 참/거짓이 서로 같을 때에만 참이 계산
		a = sc.nextInt();
		b = sc.nextInt();
		if((a == 1 && b ==1) || (a == 0 && b == 0))
			System.out.println(1);
		else
			System.out.println(0);
		
		// 1058 두 개의 참 또는 거짓이 입력, 모두 거짓일 때에만 참이 참이 계산
		a = sc.nextInt();
		b = sc.nextInt();
		
		if( a == 0 && b == 0)
			System.out.println(1);
		else
			System.out.println(0);
		
	}

}
