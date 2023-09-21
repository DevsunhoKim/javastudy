/*
 * 2.	숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 
 * 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해 볼 것.

              결과)
             달을 입력하세요(1~12) >> 9
            가을

 */
package 제어문_문제_final;

import java.util.Scanner;
public class 문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~12의 숫자 입력");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		/*
		if(a>=3 && a<=5)
		{
			System.out.println("봄 ");
		}
		else if(a>=6 && a<=8)
		{
			System.out.println("여름");
		}
		else if(a>=9 && a<=11)
		{
			System.out.println("가을");
		}
		else
		{
			System.out.println("겨울");
		}
		*/
		
		switch(a)
		{
		  case 3:
		  case 4:
		  case 5:
			  System.out.println("봄 ");
			  
			  
	      case 6:
		  case 7:
		  case 8:
				  System.out.println("여름");
				  
		  case 9:
		  case 10:
		  case 11:
				  System.out.println("가을");
		
		  case 12:
		  case 1:
		  case 2:
				  System.out.println("겨울");
			
		}
		
	}

}
