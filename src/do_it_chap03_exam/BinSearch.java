package do_it_chap03_exam;

import java.util.Scanner;

public class BinSearch {
	// 이진 검색
	
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 이진검색
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;		// 검색 범위의 첫 인덱스
		int pr = n - 1; /// 검색 범위의 끝 인덱스
		
		do {
			int pc = (pl + pr) / 2  ; // 중앙요소의 인덱스
			if (a[pc] == key) {
				return pc;		// 검색성공
			} else if (a[pc] < key) // 중앙요소 값보다 key값이 클 경우, 
				pl = pc + 1 ; // 첫 인덱스를 중앙요소 인덱스 바로 뒤쪽으로 변경 
			else
				pr = pc-1;
		} 
		while(pl<=pr); // 
		
		return -1; // 검색 실패
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[num];
		
		System.out.println("오름차순으로 입력하세요 ");
		System.out.print("arr[0] : ");
		arr[0] = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1 ; i < num; i++) {
			while(true) {
			System.out.print("arr[" + i +"] : "  );
			arr[i] = sc.nextInt();
			sc.nextLine();
			
			if(arr[i] < arr[i-1]) {
				System.out.println("바로 앞의 요소보다 작은 수입니다. 다시 입력하세요");
				continue;
			} else {
				break;
			}
			}
		}
		
		System.out.print("검색할 key 값 입력 : ");
		int key = sc.nextInt();
		sc.nextLine();
		
		int idx = binSearch(arr, num, key); // 이진 탐색
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 존재하지 않습니다");
		} else {
			System.out.println(key+"는 arr[" +idx+"]에 있습니다.");
				
			}
		}
		
	}
