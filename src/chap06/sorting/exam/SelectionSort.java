package chap06.sorting.exam;

// 단순 선택 정렬
public class SelectionSort {
	
	static void selectSortMethod(int[]a , int n) {
		for(int i = 0 ; i < n-1 ; i ++) {
			int min = i	; 			// 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스 기록
			for(int j = i +1 ; j < n; j++) {
				if(a[j] < a[min])
					min = j;
			BubbleSort.swap(a,i,min); // 아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환
			}
		}
	}
	
}
