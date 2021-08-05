package code_up;

import java.util.Scanner;

public class Code_up1019 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// 1019번 시간 입력받아 , 로 구분하여 출력 
		
		// 내 방법
		System.out.print("년도를 입력하세요 : " );
		String year = sc.nextLine();
		
		System.out.print("월을  입력하세요 : " );
		String month = sc.nextLine();
		System.out.print("일을 입력하세요 : " );
		String day = sc.nextLine();
		
		String[] list = {year, month, day};
		System.out.println(year+"." + month + "." + day );
		
		// 다른 방법 ( split 사용)
		/*
			split의 매개변수는 String이 아니라 정규식이고, 정규식에서의 .은 임의의 문자열을 의미한다.
			정규식에서는 []안에 있거나 \\다음에 오는 문자만 특수문자로 취급한다. split("[.]") or split("\\.")
		*/
		String a = sc.next();
		String[] arr = a.split("\\."); 
		System.out.println(arr[0] +"." +  arr[1] +"." + arr[2]);
		
		
	}

}
