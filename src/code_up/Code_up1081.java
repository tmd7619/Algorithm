package code_up;

public class Code_up1081 {
	
	public static void main(String[] args) {
		
		// 1081번 //1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
				for (int i = 1; i <= 6; i++) {
					for (int j = 1; j <= 6; j++) {
						System.out.print("[" + i + ", " + j + "]");
					}
					System.out.println();
				}
		
		
	}

}
