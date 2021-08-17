package chap06.sorting.exam;

import java.util.Scanner;

// 버블 정렬(버전 3) -> 앞쪽 정렬이 이미 되있다면, 그 인덱스까지 패스 탐색을 하지 않고 정렬이 필요한 요소만 패스 탐색 실행


public class BubbleSort03 {
	
	static int cnt = 0 ;// 패스 교환 횟수
	
	// a[idx1]와 [a[idx2]의 값을 바꾼다
	public static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1] ;  
		a[idx1] = a[idx2]; // a[idx2] to a[idx1]
		a[idx2] = temp ; // temp to a[idx2]
		
	}
	
	// 버블정렬 (버전3)
	static void bubbleSort(int[] a , int n ) { // n : 배열의 size
		int k = 0 ; 	// a[k] 보다 앞쪽은 이미 정렬을 마친 상태
		while(k < n -1) {
			int last = n-1; // 마지막으로 요소를 교환한 위치 // 각 패스에서 마지막으로 교환한 두 요소 가운데 오른쪽 요소a[j]를 저장하기 위한 변수
			for(int j = n-1 ; j > k ; j--) {
				if(a[j-1] > a[j] ) {
					swap(a,j-1,j);
					cnt++;
					last = j; // 여기서의 j는 swap 된 이후의 값
				}
			}
			k = last; // last 값을 k에 대입하여 수행할 패스의 범위 제한
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬(버젼3)");
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
		System.out.println("패스 교환 횟수 : "+ cnt);
		
	}
	
}
