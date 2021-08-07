package do_it_chap01;

import java.util.Scanner;

public class Median {
	/*
		3개의 정수값을 입력하고, 중앙값을 구한 다음 출력
	*/
	
	static int med3(int a , int b , int c ) {
		int temp = 0 ; 
		if(a>=b) {
			if(b>=c) {
				temp = b;
			}
			else if(a<=c) {
				temp = a;
			}
			else {
				temp = c;
			}
		}
		else if(a > c ) { // a < b 
			temp = a;
		}
		else if( a < c ) {
			temp = c ;
		}
		else {
			temp = b ; 
		}
		
		return temp;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" a 값 : "  );
		int a = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" b 값 : "  );
		int b = sc.nextInt();
		sc.nextLine();
		
		System.out.print(" c 값 : "  );
		int c = sc.nextInt();
		sc.nextLine();
		
		System.out.println("중앙값은 : " + med3(a,b,c) + "입니다.");
	}
}
