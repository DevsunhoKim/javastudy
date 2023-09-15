// 54p
/*
 *  변수 => 저장(데이터)
 *  연산자 => 결과값 , 사용처, 형식
 *  제어문 => 흐름 파악(동작) , 사용처 , 형식
 *  1. 제어문의 종류
 *  ****** 제어문은 무조건 한 개의 문장만 수행할 수 있다.
 *   if(조건문)
 *   문장1====> 제어
 *   문장2====>일반 문장
 *   
 *   if (조건문)
 *   {
 *   	문장1
 *   	문장2
 *   }
 *   
 *  = 조건문
 *    = 단일 조건문
 *    형식)
 *       if(조건문) => 조건문 비교연산자 , 논리연산자 , 부정연산자
 *       {
 *        조건문이 true일 경우에 수행할 문장
 *        }
 *        => 명령문을 제어한다(수행 (X), 수행)
 *        => 단점은 속도가 느리다 (단일조건문 여러개 사용시)
 *        => 1개가 독립문장이기 때문에
 *        => 중복이 있는 경우 사용이 가능
 *        1~100까지 중에 3,5,7 배수를 출력
 *        
 *    = 선택 조건문 : true 와 false를 나눠서 작업
 *    ====> 삼항연산자 
 *     if(조건문)
 *     {
 *     조건문이 true 일 때
 *     }
 *     else
 *     {
 *     조건문이 false 일 때
 *     }
 *    = 다중 조건문 : 한 번만 수행할 때 주로 사용 (중복없음)
 *      => 계산기 : + ,-,*,/
 *      
 *    if(조건문)
 *    {
 *       조건문이 true 면 수행하는 문장 ==> 종료
 *       false ↘
 *       	밑에 조건문으로 이동
 *    }
 *    else if(조건문)
 *    {
 *      조건문이 true 면 수행하는 문장 ==> 종료
 *       false ↘
 *       	밑에 조건문으로 이동
 *    }
 *    else if(조건문)
 *    {
 *    조건문이 true 면 수행하는 문장 ==> 종료
 *       false ↘
 *       	밑에 조건문으로 이동
 *    }
 *    else 
 *    {
 *    // 생략이 가능
 *    해당 조건이 없는 경우 처리하는 문장
 *    }
 *    
 *    ex) 
 *    int score =80;
 *    if(score >=90)
 *    A
 *    if(score >=80)   ===> 에서 탈출하지 못해서 조건이 만족하는 D 까지 수행 (최종적으로 D)
 *     B
 *    if(score >=70)
 *     C
 *    if(score >=60)
 *     D
 *    if(score <60)
 *     F
 *     ----------------------------------------
 *     
 *     int a=15;
 *     if(a%3==0)  ========> 3,5 를 동시에 출력하지 못함 첫번째 조건에서 탈출
 *     else if(a%5==0) =======> 5를 동시에 출력하려면 if 문을 어려개 사용
 *     else if(a%7==0)
 *    
 *  = 선택문
 *  = 반복문
 *  = 반복제어문
 *  
 *  
 */
import java.util.Scanner;
public class 제어문의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 는 클래스 => 키보드로 입력해서 저장 => 엔터 메모리 저장
		/*
		 * 기능: 메소드
		 * 정수: nextInt()
		 * 문자열: next()
		 * 실수: nextDouble()
		 * 논리: nextBoolean()
		 * 문자는 X ==> System.in => 정수
		 * 웹/윈도우 (char(x))
		 * 
		 */
		// Scanner 클래스 저장 => 클래스를 저장 (new)
		// 동적바인딩 
		Scanner scan=new Scanner(System.in);
		//System.in ,System.out => 자바 표준 입출력
		System.out.print("정수 입력:");
		int num=scan.nextInt();
		// 가공 
		if(num%2==0)
		{
			System.out.println(num+"는(은) 짝수입니다");
		}
		
		if(num%2!=0) 
		{
			System.out.println(num+"는(은) 홀수입니다");
		}

	}

}
