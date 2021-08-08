package do_it_chap01_exam;

import java.util.Scanner;

public class SumWhile {
	
	// 1 + 2..... n 총합 구하기
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : " );
		int i = sc.nextInt();
		sc.nextLine();
		
		int start = 0;
		int total = 0;
		
		while(start <= i) {
			
			total += start ;
			
			start ++;
		}
		
		System.out.println(total);

		
	}

}
