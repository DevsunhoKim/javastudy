//=> 정수 2개입력 ,연산자(+,-,*,/) => 연산 처리
// 다중조건문 사용
/*
 * if(op=='+')
 * else if(op=="-")
 * else if(op=="*")
 * else if(op=="/")
 * else ==> 잘못된 연산자일 경우
 */
import java.util.Scanner;
public class 제어문_조건문_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 명시적 초기화
		// 사용자로부터 입력받은 값을 저장하기 위한 메모리 공간 설정
		int num1=0,num2=0;
		char op = ' ';
		// 사용자 입력값
		// 사용자 요청에 따라 결과 값을 출력 (가공)= 연산자,제어문
		//									 =========== 메소드
		//---------------------------------- 재사용
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수입력:");
		num1=scan.nextInt();
		System.out.print("두번째 정수입력:");
		num2=scan.nextInt();
		System.out.println("연산자 입력(+,-,*,/)");
		op=scan.next().charAt(0);
		// 사용자의 요청에 따라 결과 값을 출력 (가공) =연산자 , 제어문
		//                                    ================ 메소드
		// -------------------------------------------- 재사용
		if(op=='+')
		{
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}
		else if(op=='-')
		{
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}
		else if(op=='*')
		{
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}
		else if(op=='/') {
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else
			{
				System.out.println(num1+"/"+num2+"="+(num1/num2));
			}
		}
		else
		{
			System.out.println("잘못된 연산자입니다");
		}

	}

}
