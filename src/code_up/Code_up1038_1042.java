package code_up;

import java.util.Scanner;

public class Code_up1038_1042 {
	
	
	public static void main(String[] args) {
		
		
		  Scanner sc = new Scanner(System.in);
		  
		  // 정수 2개 입력받아 합 출력 System.out.println(sc.nextLong() + sc.nextLong());
		  
		  // 1040번 // 부호 바꿔서 출력 System.out.println(-sc.nextInt());
		  
		  // 1041번 // 문자 하나 입력받아 +1 하는 코드 작성
		  System.out.println(sc.nextLine().charAt(0)+1);
		  
		  // 1042번 // 정수 2개 입력받아 나눈 몫 출력하기
		  System.out.println(sc.nextInt()/sc.nextInt());
		  
		  // 실수 포맷
		  System.out.printf("%.3f" , 10.0/3); // 정수/정수 = 정수 -> "%f"포맷 사용불가 // 실수/정수 = 실수 -> "%f" 포맷 사용 가능
		
	}
	
	

	
	
	
}
