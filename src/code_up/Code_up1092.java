package code_up;

import java.util.Scanner;

public class Code_up1092 {
	// 최소 공배수 구하기 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		int num2 = sc.nextInt();
		sc.nextLine();
		int num3 = sc.nextInt();
		sc.nextLine();

		int day = 1;
		while(true) {
			if(day % num == 0 && day % num2 == 0 && day % num3 ==0) {
				System.out.println(day);
				break;
			} else {
				day++;
			}
			
		}
	
	}

}
