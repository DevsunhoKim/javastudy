/*
 * 형식)
 * if(조건문)
 * {
 *   실행문장 => 조건문이 true 일때만 수해이 가능
 * }
 * =>조건문: 반드시(true/false)
 * 				------------
 * 				비교,논리,부정
 * 두개의 정수 , 연산자 + , - , *, / 
 * => 간단한 계산기
 */
import java.util.Scanner;
public class 단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num1,num2;
		char op;
		
		System.out.println("첫번째 정수 :");
		num1=scanner.nextInt();
		
		System.out.println("두번째 정수 :");
		num2=scanner.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/):");
		op=scanner.next().charAt(0);
		
		if(op=='+') {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
		if(op=='-') {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		if(op=='*') {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}
		if(op=='/') {
			//중첩 if 문
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
			}
			if(num2!=0)
			{
			System.out.println(num1+"/"+num2+"="+(num1/num2));
			}
		}
		if(!(op=='+' || op=='-' || op=='*' ||op=='/'))
		{
			System.out.println("잘못된 연산자 입니다.");
		}
			
	}

}
