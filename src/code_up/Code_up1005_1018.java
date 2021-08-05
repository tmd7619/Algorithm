package code_up;

import java.io.IOException;
import java.util.Scanner;

public class Code_up1005_1018 {
	
	public static void main(String[] args) throws IOException {
		
		// 1005번 // 큰따옴표 출력
		System.out.println("  \"Hello World\"  "); // 출력하고자 하는 쌍따옴표 앞에 이스케이프 문자 ' \ ' 를 붙여주면 됨
		
		// 1006번
		System.out.println(" \"!@#$%%^&*()\" "); // 특수문자 그대로 출력 가능
		
		
		// 1008번 //유니코드 특수문자 출력
		System.out.println("\u250c\u252c\u2510\n\u251d\u253c\u2524\n\u2514\u2534\u2518 ");
		
		
		// 1010 정수 1개 입력받고 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나를 입력하세요 : ");
		int i = sc.nextInt();
		sc.nextLine() ; 
		
		System.out.println("입력받은 정수 : "  + i);		
		// 1011 문자 1개 입력받고 출력
		System.out.print("문자 하나 입력 하세요 : ");
		char c = sc.nextLine().charAt(0); // 스캐너는 return 타입이 char가 없음
		System.out.println("문자 입력값 : " + c);
		
		
		// 1015 실수 입력받아 둘째자리 까지 출력
		
		System.out.print("실수를 입력하세요 : ");
		float f =  sc.nextFloat();
		System.out.printf("%.2f", f);
		System.out.println();
		sc.nextLine();
		
		// 1018 시간 입력받아 그대로 출력
		String time = sc.nextLine();
		System.out.println(time);
		
	}
	
	

}
