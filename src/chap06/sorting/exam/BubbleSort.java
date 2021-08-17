package chap06.sorting.exam;

import java.util.Scanner;

// 버블 정렬(버전 1)


public class BubbleSort {
	
	// a[idx1]와 [a[idx2]의 값을 바꾼다
	public static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1] ;  
		a[idx1] = a[idx2]; // a[idx2] to a[idx1]
		a[idx2] = temp ; // temp to a[idx2]
	}
	
	// 버블정렬
	static void bubbleSort(int[] a , int n ) { // n : 배열의 size
		for ( int i = 0; i < n -1 ; i ++) { // 요소의 개수가 n개인 배열에서 n-1회 패스 실행 
			for(int j = n -1 ; j > i; j--) { // 첫 번째 패스에는 j 값이 1이 될 때까지 반복, 두 번째 패스에는 j 값이 2가 될 때까지 반복....
				if(a[j -1 ] > a[j]) // j번째 요소값이 바로 앞의 요소보다 작으면,
					swap(a, j-1 ,  j); // 패스
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬(버젼1)");
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
