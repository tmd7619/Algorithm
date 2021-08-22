package code_up;

import java.util.Scanner;

// 출석 번호를 n번 무작위로 불렀을 때, 가장 빠른 번호를 출력해 보자.

public class Code_up1094 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("부를 횟수 입력 : ");
		int n = sc.nextInt();
		sc.nextLine();

		int[] arr = new int[24]; //0 ~23 번호를 가진 학생 배열생성 // 실제로는 1~23 인덱스 사용
		while(n>0) {
			System.out.print("출석 부를 학생을 입력하세요 : ");
			int cnt = sc.nextInt();
			sc.nextLine();
			for(int i = 1 ; i <= 23; i ++) {
				if(cnt == i )
					arr[i] = i ;
			}
			
			n--;
		}
		
		//출력
		int temp ;
		for(int i = 0 ; i < arr.length; i ++) {
			if(arr[i] !=0) {
				System.out.println("가장 빠른학생은 번호는 : " +arr[i] + "번 입니다.");
				break;
			}
		}
		
	}
}
