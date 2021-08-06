package code_up;

import java.util.Scanner;

/*
 * 정수 1개 입력받아 나누어 출력
 * 
 * 
 */

public class Code_up1025 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
				
		String b = Integer.toString(a);
		int size = b.length();
		
		for(int i = 0 ; i < size ; i ++	) {
				
			System.out.println(b.charAt(i));
			
		}
		
	}
	

}
