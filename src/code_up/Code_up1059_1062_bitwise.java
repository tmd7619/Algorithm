package code_up;

import java.util.Scanner;

public class Code_up1059_1062_bitwise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		// 1059번 비트 단위로 NOT 하여 출력
		int a = sc.nextInt(); 
		System.out.println(~a); // 입력받은 int의 비트를 뒤집은 후, 그 값을 10진수로 출력
		
		
		// 1060번 비트 단위로 AND 하여 출력 
		/*
		 	비트단위 and 연산은 두 비트열이 주어졌을 때,
			둘 다 1인 부분의 자리만 1로 만들어주는 것과 같다. ( 1 or 0 일경우 0)
			네트워크를 구하는 ip 계산 방식을 떠올리자.
			
		 */
		a = sc.nextInt(); 
		int b = sc.nextInt(); 
		System.out.println(a&b); 
		
		// 1061번 비트단위로 OR로 출력
		/*
			둘중 하나라도 1이면, 1로 만들어줌. ( 1 or 1 일때 1, 0 or 0 일때는 0)
		*/
		a = sc.nextInt(); 
		b = sc.nextInt(); 
		System.out.println(a|b); 
		
		// 1062번 비트단위로 XOR로 출력
		/*
		 	1 or 0 일때만 1로 출력 ( 1 or 1 일때 0으로(OR과 차이점), 0 or 0 일때 0으로)
		*/
		a = sc.nextInt(); 
		b = sc.nextInt(); 
		System.out.println(a^b);
	}
	
}
