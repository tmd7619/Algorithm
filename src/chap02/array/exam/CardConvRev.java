package chap02.array.exam;

public class CardConvRev {
	/*
	 * 
	 * 입력받은 10진수를 2진수 ~ 36진수로 기수 변환하여 나타냄
	 */
	
	
	//정수값 x 를 r진수로 변환하여 배열 d에 아릿자리부터 넣어두고 자릿수로 변환한다
	static int cardConvR(int x, int r , char[] d ) {
		
		int digits = 0;  // 변환후의 자리수
		
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				
		
		do {
			
			d[digits++] = dchar.charAt(x % r) ; // r로나눈 나머지 저장
			x /= r; // x = x / r 나눈 몫을 x값에 저장
		} while (x != 0); // x가 0이 아닐때까지 계속 반복
		
		return digits;
		
	}

}
