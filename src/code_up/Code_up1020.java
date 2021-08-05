package code_up;

import java.util.Scanner;

public class Code_up1020 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//주민번호 입력받아 형태 바꿔 출력하기
		
		// 방법 1 
		String num = sc.nextLine();
		
		String[] a = num.split("-");
		
		for(String b : a ) {
			System.out.print(b);
		}
		
		
		// 방법 2 replaceAll 사용
		String num2 = sc.nextLine();
		
		num2 = num2.replaceAll("-", "");
		System.out.println(num2);
	}

}
