package code_up;

import java.util.Scanner;

/*
 *  시 : 분 : 초 형식으로 입력받아 분만출력
 * 
 * 
 */

public class Code_up1026 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String time = sc.nextLine();
		
		String[] arr = time.split(":");
		
		System.out.println("분은 : " + arr[1] + "분");
		
	}
	

}
