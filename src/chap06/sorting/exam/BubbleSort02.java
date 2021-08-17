package chap06.sorting.exam;

import java.util.Scanner;

// 버블 정렬(버전 2) -> '멈춤'으로 개선한 버블 정렬 메서드
// 어떤 패스에서 요소의 교환 횟수가 0이면 더 이상 정렬할 요소가 없음 -> 정렬작업 멈춤


public class BubbleSort02 {
	
	// a[idx1]와 [a[idx2]의 값을 바꾼다
	public static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1] ;  
		a[idx1] = a[idx2]; // a[idx2] to a[idx1]
		a[idx2] = temp ; // temp to a[idx2]
	}
	
	// 버블정렬 (버전2)
	static void bubbleSort(int[] a , int n ) { // n : 배열의 size
		for(int i = 0; i < n-1 ; i ++) {
			int exchg = 0 ; 			// 패스의 교환횟수를 기록 // 다시 패스를 돌때 0으로 초기화
			for(int j = n -1 ; j > i ; j --) {
				if(a[j-1] > a[j]) {
					swap(a,j-1,j);
					exchg++;	// 패스에서 요소를 교환할 때 마다 1씩 증가
				}
			}
			if(exchg==0) break;		// 교환이 이루어지지 않으면 종료
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬(버젼2)");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		sc.nextLine();
		
		int[] x  = new int[nx]; // nx size로 int[] x 배열 초기화
		
		for(int i = 0 ; i < nx; i ++) { // 요솟값 입력
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
			sc.nextLine();
		}
		
		bubbleSort(x, nx); // 배열 x를 버블정렬
		
		System.out.println("오름차순으로 정렬했습니다");
		for(int i = 0 ; i < nx; i ++) {
			System.out.println("x[" + i + "] = "+ x[i]);
		}
		
	}
	
}
