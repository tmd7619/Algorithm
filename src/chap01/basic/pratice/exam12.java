package chap01.basic.pratice;

public class exam12 {

	public static void main(String[] args) {
		
		
		System.out.println("--|1\t2\t3\t4\t5\t6\t7\t8\t9");
		System.out.println("--*---------------------------------------------------------------");
		
		for(int i = 1 ; i <= 9 ; i ++) {
			
			System.out.print(i + " |");
			for(int j = 1 ; j <= 9 ;  j++) {
				System.out.print(j*i+"\t");
				if(j == 9) {
					System.out.println();
				}
			}
		}
	}
	
	
	
	
	
}
