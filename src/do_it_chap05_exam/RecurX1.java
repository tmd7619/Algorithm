package do_it_chap05_exam;

import do_it_chap04_exam.IntStack;

// 꼬리 재귀 제거 // 스택을 활용하기
public class RecurX1 {
	
	static void recur(int n ) {
		
		IntStack s = new IntStack(n);
				
		
		while(true) {
			if( n > 0) { 
				s.push(n); // n의 값을 푸시
				n = n-1;   // n이 0이 될때까지 push
				continue;
			}
			
			if(!s.isEmpty()) { // 스택이 비어있지 않다면
				n = s.pop(); // 저장하고 있던 스택의 값을 pop // 여기서 n의 값이 pop값으로 변경
				System.out.println(n);
				n = n - 2 ;
				continue;
				
			}
			
			break;
		}
		
	}
	
	public static void main(String[] args) {
		
		recur(4);
	}
}
