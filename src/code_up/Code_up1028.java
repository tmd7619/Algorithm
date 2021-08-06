package code_up;

import java.util.Scanner;

/*
 *		10진수를 입력받아 8진수(octal)로 출력해보자.
 * 
 * 
 */

public class Code_up1028 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = Integer.toOctalString(sc.nextInt()); // Integer.toOctalString -> 10진수를 8진수로 변환(String) 타입
		String b = Integer.toHexString(sc.nextInt()); // Integer.toHexString 입력값을 16진수로 변환
		
		System.out.println(a);
		
	}
	

}
