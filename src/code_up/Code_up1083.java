package code_up;

public class Code_up1083 {
	
	public static void main(String[] args) {
		
		// 3 6 9 프로그램 // 3 6 9 시, 박수  // 33시, 박수박수
		for (int i = 1; i <= 100; i++) {
			if (i < 10) {
				if (i % 3 == 0) {
					System.out.println("박수");
				} else {
					System.out.println(i);
				}

			} else { // 10 이상부터
				String str = Integer.toString(i);
				if (str.charAt(0) == '3' || str.charAt(0) == '6' || str.charAt(0) == '9') { // 십의자리 수가 3, 6, 9 일때
					System.out.print("박수");
					if (str.charAt(1) == '3' || str.charAt(1) == '6' || str.charAt(1) == '9') { // 일의자리 수가 3,6,9 일때
						System.out.println("박수");
					} else {
						System.out.println();
					}
				} else { // 십의자리수가 3,6 9가 아닐때
					if (str.charAt(1) == '3' || str.charAt(1) == '6' || str.charAt(1) == '9') { // 일의자리 수가 3,6,9 일때
						System.out.println("박수");
					}else {
						System.out.println(i);
					}
				}

			}

		}
		
	}

}
