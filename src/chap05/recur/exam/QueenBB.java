package chap05.recur.exam;

//QueenB에서 가지 뻗기를 통해 퀸을 배치하는 조합을 나열할 수는 있지만, 8퀸 문제의 답을 얻을 수 없다 -> 이를 해결하기 위해 분기한정법 사용 
//규칙 추가 : 각 행에 퀸을 1개만 배치합니다.
public class QueenBB { 
	
	static boolean[] flag = new boolean[8]; // 각 행에 퀸을 배치했는지 체크
	static int[] pos = new int[8]; // 각 열의 퀸의 위치
	static int cnt = 0 ; // 경우의 수

	// 각 열의 퀸의 위치를 출력
	static void print() {
		for(int i = 0; i < 8; i ++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	// i열에 퀸을 놓기 // 재귀함수
	static void set(int i) {
		
		for(int j = 0; j < 8; j ++) {
			if(flag[j] == false) { // j행에 퀸을 아직 배치하지 않았다면
				pos[i] = j; // 퀸을 j행에 배치
				if(i==7) {
					print();
					cnt ++;
				}
				else {
					flag[j] = true;
					set( i + 1 ) ;
					flag[j]  = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0); // 0열에 퀸을 배치
		System.out.println("경우의 수 : "+ cnt);
		
	}
	
}
