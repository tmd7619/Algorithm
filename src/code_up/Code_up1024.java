package code_up;

import java.util.Scanner;

/*
 * 입력한 단어를 한글자씩 나누어 출력 
 * 
 * 
 */

public class Code_up1024 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		int size = a.length() ;
		
		
		for(int i = 0 ; i < size ; i ++	) {
				
			System.out.println(a.charAt(i));
			
		}
		
	}
	

}
