package code_up;

import java.util.Scanner;

public class Code_up1049 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비교할 첫번째 정수 입력 : ");
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print("비교할 두번째 정수 입력 : ");
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.print("a > b ? 1 : 0 >>>> ");
		System.out.println(a > b ? 1 : 0 ); // a가 b보다 크면 1 아님 0
	}

}
