package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
	System.out.println("수를 입력하세");
	
	int number = scanner.nextInt();
	
	 if (number % 3 == 0) {
         System.out.println(number + "은(는) 3의 배수입니다.");
		} else {
         System.out.println(number + "은(는) 3의 배수가 아닙니다.");
     }
		
		scanner.close();
	}
}
