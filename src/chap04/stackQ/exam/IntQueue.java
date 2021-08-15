package chap04.stackQ.exam;

public class IntQueue {

	private int max; 
	private int front ; // 첫 번째 요소 커서
	private int rear;  // 마지막 요소 커서
	private int num; // 현재 데이터 수 
	private int[] que; // 큐 본체
	
	
	// 실행시 예외 : 큐가 비어있음
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	// 실행시 예외 : 큐가 가득참
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	// 생성자
	public IntQueue(int capacity) {
		num = front = rear = 0; 
		max = capacity;
		try {
			que = new int[max]; // 큐 본체용 배열을 생성
		} catch(OutOfMemoryError e ) { // 생성할 수 없음
			max = 0;
		}
	}
	
	// 큐에 데이터를 인큐
	public int enque(int x) throws OverflowIntQueueException{
		if (num >= max) {
			throw new OverflowIntQueueException();
		}
		
		que[rear++] = x; // 현재 rear에 x값 인큐 후, rear++ // 스택의 포인터와 비슷한 원리
		num ++; // 데이터 수 +1
		
		if(rear == max) { // 인덱스 초과문제 방지
			rear = 0;
		}
		return x;
		
		
	}
	
	// 큐에서 데이터를 디큐
	public int deque() throws EmptyIntQueueException{
		
		if(num <=0) {
			throw new EmptyIntQueueException();
		}
		
		int x = que[front++]; // 디큐시에는 front에부터 꺼낸다. // que[front] 값을 꺼내고, front 값 ++
		num --;
		
		if(front == max) { // 인덱스 초과문제 방지
			front  = 0;
		}
		
		return x;
	}
	
	// 큐에서 데이터를 피크(프론트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException{
		if(num <= 0	) {
			throw new EmptyIntQueueException();
		}
		
		return que[front];
	}
	
	// 큐에서 x를 검색하여 인덱스를(찾지못하면 -1)를 반환
	public int indexOf(int x) {
		
		for(int i = 0 ; i < num; i++) {
			int idx = (i + front ) % max; // front에서 i를 계속 더함(1씩더함).....인덱스가 max가 되면 %을 통해 다시초기화 // 그림그려 이해하기
			if(que[idx] == x) {
				return idx; // 검색성공
			}
		}
		
		return -1; // 검색실패
	}	
		
	public void clear() {
		num = front = rear = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	// 큐에 쌓여 있는 데이터 수 반환
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num <= 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	
	// 큐 안의 모든 데이터를 프린터 -> 리어 순으로 출력
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비어있습니다.");
		} else {
			for(int i = 0; i < num; i ++) {
				System.out.print(que[(i+front) % max] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
