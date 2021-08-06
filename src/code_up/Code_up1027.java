package code_up;

import java.util.Scanner;

/*
 *		년월일(yyyy.mm.dd)를 입력받아,

		일월년(dd-mm-yyyy)로 출력해보자.
 * 
 * 
 */

public class Code_up1027 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String time = sc.nextLine();
		
		String[] arr = time.split("\\.");
		
		
		System.out.println(arr[2] +  "-"  + arr[1] + "-" + arr[0]);
	}
	

}
