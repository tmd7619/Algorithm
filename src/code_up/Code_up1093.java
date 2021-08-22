package code_up;

import java.util.Scanner;

// 출석 번호를 n번 무작위로 불렀을 때, 각 번호(1 ~ 23)가 불린 횟수를 각각 출력해보자.

public class Code_up1093 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("부를 횟수 입력 : ");
		int n = sc.nextInt();
		sc.nextLine();

		int[] arr = new int[24]; //0 ~23 번호를 가진 학생 배열생성 // 실제로는 1~23 인덱스만 사
		while(n>0) {
			System.out.print("출석 부를 학생을 입력하세요 : ");
			int cnt = sc.nextInt();
			sc.nextLine();
			for(int i = 1 ; i <= 23; i ++) {
				if(cnt == i )
					arr[i] = arr[i] +1;
			}
			
			n--;
		}
		
		for(int i = 23 ; i >=1; i --) { // 역순으로 부르
			if(arr[i] != 0) {
				System.out.println("부른 학생 " + i + "부른 횟수 : " +arr[i]);
			}
		}
		
	}
}
