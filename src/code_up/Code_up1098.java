package code_up;

import java.util.Scanner;

public class Code_up1098 { 
	
	// 다시풀어보기
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt(); // width
		sc.nextLine();
		int h = sc.nextInt(); // height 
		sc.nextLine();
		int n = sc.nextInt(); // 막대개수 
		sc.nextLine();
		
		
		while(n>0) {
		
			System.out.print("방향을 입력해 주세요 : ");
			int d = sc.nextInt(); // 방향 (가로 == 1 or 세로 == 0)
			sc.nextLine();
			
			System.out.print("x좌표 입력 : ");
			int x = sc.nextInt(); // x좌표 
			sc.nextLine();
			System.out.print("y좌표 입력 : ");
			int y = sc.nextInt(); // y좌표 
			sc.nextLine();
			
			for(int i = 0 ; i < h ; i ++) { //row add
				for(int j = 0 ; j < w ; j ++) { // col add
					if(d == 1) { // 막대 모양이 가로일 경우 
						if(j < x)
							System.out.print(0 + " ");
						else 
							System.out.print(1 + " ");
					}
				}
			}
		
			n--;
		
		}
	
	}

}
