package code_up;

import java.util.Scanner;

public class Code_up1087 {
	
	public static void main(String[] args) {
		// 1, 2, 3 ... 을 순서대로 계속 더해나갈 때,
		// 그 합이 입력한 정수보다 작을 동안만 계속 더하는 프로그램을 작성해보자.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
			for(int i = 1 ; ; i++) { // for문에 중간 조건을 정의하지 않으면, 무한 루프
				sum = sum + i;
				
				if(sum > num)
					break;
			
			}
			
			System.out.println("출력값은 : " + sum + " 입니다.");
	}

}
