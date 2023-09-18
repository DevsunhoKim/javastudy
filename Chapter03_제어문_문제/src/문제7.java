/*
 * 정수 2개와 연산자를 입력받아 사칙 연산하는 프로그램을 만들어라
 */
import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		char op=' ';
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력 :");
		a=scan.nextInt();
		System.out.println("두번째 정수 입력 :");
		b=scan.nextInt();
		
		System.out.println("연산자(+,-,*,/) 입력 :");
		op=scan.next().charAt(0);
		
		switch(op)
		{
		case'+':
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case'-':
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case'*':
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case'/':
			if(b==0) // 오류처리 => 처리를 할 수 없는 경우 (예외처리)
			System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.println(a+"/"+b+"="+a/b);
			break;
		default:
			System.out.println("처리할수 없는 연산자 입니다.");
		}
		

	}

}
