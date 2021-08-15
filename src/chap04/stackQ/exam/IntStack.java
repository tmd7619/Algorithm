package chap04.stackQ.exam;

//int 형 스택
public class IntStack {
	
	private int max; // 스택 용량
	private int ptr; // 스택 포인터
	private int[] stk; // 스택 본체
	
	//실행 시 예외 : 스택이 비어있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
			System.out.println("스택이 비어있습니다.");
		}
	}
	
	//실행시 예외 : 스택이 가득참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {
			System.out.println("스택이 가득찼습니다.");
			
		}
	}
	
	// 생성자 
	public IntStack(int capacity) {
		ptr = 0;				// 스택이 비어있으면 0, 가득차면 max 값과 같다
		max = capacity;
		try {
			stk = new int[max]; // 스택 본체용 배열 생성
			
		}catch (OutOfMemoryError e) { // 생성할 수 없음 error
			max = 0 ;
		}
	}
	
	// 스택에 x를 푸시 하는 메서드
	public int push(int x) throws OverflowIntStackException{
		if(ptr == max) { // 스택이 가득찬 경우
			throw new OverflowIntStackException();
		} 
		
		return stk[ptr++] = x; // stk[ptr]에 x를 대입한 후, ptr을 increment // 반환값은 x를 저장한 후의 stk[ptr]의 값이다.
	}
	
	// 스택에서 데이터를 팝
	public int pop() throws EmptyIntStackException{
		if(ptr == 0) // 스택이 비어있을 경우
			throw new EmptyIntStackException();
		
		return stk[--ptr]; // 전위연산자를 하는 이유? : 현재 포인터는 push 메서드에 의해 increment된 상태이다. 따라서 포인터를 먼저 decrement 해준다.
	}
	
	// 스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int peek() throws EmptyIntStackException{
		if(ptr == 0 )			// 스택이 비어있을 경우
			throw new EmptyIntStackException();
		
		return stk[ptr -1]; // 꼭대기의 요소를 반환 // 이때, --를 하지 않고 ptr-1를 하는 이유는 데이터의 입력과 출입이 없으므로 포인터 변화x(단순 조회)
	
	}
/*=============================================================================================================================================*/	
	
	// 스택에서 x를 찾아 인덱스(없으면-1)를 반환
	public int indexOf(int x) {
		for(int i = ptr -1; i >=0 ; i --) { // 정상쪽에서(제일 마지막 인덱스)부터 선형검색 (top -> bottom)
			if(stk[i] == x) { // 존재할 경우,
				return i;
			}
		}
		
		return -1;
	}
	
	// 스택을 비움 // 스택에 대한 푸시와 팝 등 모든 작업은 스택 포인터를 바탕으로 이루어짐 -> 따라서 스택의 배열 요소값을 변경할 필요x 포인터 값만 0으로 변경
	public void clear() {
		ptr = 0;
	}
	
	
	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 스택에 쌓여있는 데이터 수를 반환
	public int size() {
		return ptr; // stk[0] ....stk[ptr-1] 의 개수 = ptr 
	}
	
	// 스택이 비어있는지 유무
	public boolean isEmpty() {
		return ptr <= 0 ; // 이 조건이 참이면 true값 리턴
	}
	
	// 스택이 가득찼는지 유무
	public boolean isFull() {
		return ptr >= max;
	}
	
	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if(ptr <= 0) { // 비어있을 경우,
			System.out.println("스택이 비어있습니다.");
		} else {
			
			for(int i = 0 ; i < ptr; i++) {
				System.out.print(stk[i] + " "); 
			}
			System.out.println();	
		}
	}
	
	
	

}