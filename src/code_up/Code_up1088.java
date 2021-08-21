package code_up;

import java.util.Scanner;

public class Code_up1088 {
	
	public static void main(String[] args) {
		//1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되,
		//3의 배수인 경우는 출력하지 않도록 만들어보자.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		for(int i = 1 ; i < num ; i ++) {
			if( i % 3 != 0) {
			System.out.print(i + " " );
			}
		}
		
	
	}

}
