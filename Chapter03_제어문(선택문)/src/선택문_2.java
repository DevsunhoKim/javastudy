//사칙연산
// 정수 2개 => 연산자 (문자열)
// 정수 3개 => 1개 결과 값
import java.util.Scanner;
public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2; // 입력받는 변수는 초기값이 필요없음
 		int result=0;  // 초기값을 받지 않은 변수는 오류발생 , 초기값 없음(연산에 의한 값)
		Scanner scan=new Scanner(System.in);
		//초기화
		System.out.print("첫번째 정수입력:");
		num1=scan.nextInt();
		System.out.print("두번째 정수입력:");
		num2=scan.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/):");
		switch(scan.next())
		{
		case"+":
			result=num1+num2;
			break;
		case"-":
			result=num1-num2;
			break;
		case"*":
			result=num1*num2;
			break;
		case"/":
			result=num1/num2;
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
		}
		System.out.println("계산 결과 :"+result);
	}

}
