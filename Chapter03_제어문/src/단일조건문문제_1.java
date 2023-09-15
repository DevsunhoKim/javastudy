/*
 * 정수 한 개를 입력 받아서, 그 수가 50이상의 수인지 50미만의 수인지 판단.
 */

import java.util.Scanner;
public class 단일조건문문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
		 System.out.println("정수를 입력하시오");
		 int a=scan.nextInt();
				 if(a<50) {
					 System.out.println(a+"은(는)50 미만입니다");
				 }
		         if(a>=50) {
			         System.out.println(a+"은(는) 50 이상입니다");
		         }
		         
		         
	}

}

// 정답