/*
 * 정수 입력을 1개받는다
 * >>-11
 * 같은 숫자입니다
 * 
 */


import java.util.Scanner;
public class 단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("0~99 사이의 숫자를 입력하시오.");
		
		int a=scan.nextInt();
		
		int b=a/10;
		int c=a%10;
		
       
		
		if(b==c) {
			System.out.println("같은 숫자 입니다.");
			
		}
		if(b!=c) {
			System.out.println("다른 숫자 입니다.");
			
		}
	}

}
