package chap05.recur.exam;

import java.util.Scanner;


// 분할 정복법(divide end conquer):  문제를 세분화하고 세분된 작은 문제의 풀이를 결합해 전체 문제 풀이를 하는 기법
public class Hanoi {
	// n개의 원반을 x번 기둥에서 y번 기둥으로 옮김
	
	static void move(int n , int x , int y) {
		// 6-x-y : 중간기둥 // 기둥 번호는 1 ,2 ,3  기둥 번호 합 : 6
		
		if( n > 1)
			move(n -1 , x, 6 -x - y);  // n-1 개의 원반을 x기둥에서 중간기둥으로 옮김
		System.out.println("원반["+ n + "] 을 "+ x +"기둥에서 " + y + "기둥으로 옮김");
		
		if( n > 1)
			move(n -1, 6 -x -y , y);  // n-1 개의 원반을 중간기둥에서 y기둥으로 옮김
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반 개수 :");
		int n = sc.nextInt();
		sc.nextLine();
		
		move(n, 1, 3); // 1번 기둥의 n개의 원반을 3번 기둥으로 옮김
	}
}
