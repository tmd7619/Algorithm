package chap05.recur.exam;

//QueenBB는 퀸이 대각선으로 이동하는 것을 고려하지 않았음 -> 어떤 대각선에서 보더라도 퀸을 1개만 배치하는 한정 조작을 추가해야함
public class EightQueen { 
	
	static boolean[] flag_a = new boolean[8]; // 각 행에 퀸을 배치했는지 체크
	static boolean[] flag_b = new boolean[15]; //  ' / ' 대각선 방향으로 퀸을 배치했는지 체크
	static boolean[] flag_c = new boolean[15]; //  ' \ ' 대각선 방향으로 퀸을 배치했는지 체크
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
			if(flag_a[j] == false && // 가로(j)행에 아직 배치 x
			   flag_b[i + j] == false &&  // 대각선 / 에 아직 배치 x
			   flag_c[i - j + 7 ] == false) { // 대각선 \ 에 아직 배치 x
				
				pos[i] = j; // 퀸을 j행에 배치
				if( i == 7) {
					print();
					cnt++;
				}
				else {
					flag_a[j] = flag_b[i + j] = flag_c[ i - j + 7] = true;
					set(i+1);
					flag_a[j] = flag_b[i + j] = flag_c[ i - j + 7] = false;
				}
				
				
			}
		}
	}
	
	public static void main(String[] args) {
		set(0); // 0열에 퀸을 배치
		System.out.println("경우의 수 : "+ cnt);
		
	}
	
}
