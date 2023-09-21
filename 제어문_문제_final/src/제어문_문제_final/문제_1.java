/*
 * 1.	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
       십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.

결과)
      2자리수 정수 입력(10~99) >> 77 
        10의 자리와 1의 자리가 같습니다.

 * 
 *   => 조건문
 *   단일 / 선택 / 다중 => 형식 , 순서
 *   ---------------
 *   연산자 => 어떤 연산자 => 결과값 예측
 *   ------------ 비교 , 논리 , 부정
 *   
 *   단일조건문
 *   -------
 *   	if(조건문) => 오류 처리(예외처리) => 사전에 오류방지 , 값입력 유도
 *   	{
 *   		조건이 true 일때만 수행
 *   	}
 *   => 수행 => 건너뛴다
 *   
 *   선택조건문
 *   ------
 *    if(조건문)
 *    {
 *    	조건이 true일때 수행  ==> 사용자,회원
 *    }
 *    else
 *    {
 *    	조건이 false 일때 수행 ==> 관리자,게스트
 *    }
 *    
 *    다중조건문 ==> 조건에 맞는 문장 하나만 수행 ==> switch~case
 *    ------
 *    if(조건문)
 *    {
 *    	조건이 true 일 때 수행
 *      아닐시 다음 조건으로 이동
 *    }
 *    else if(조건문)
 *    {
 *      조건이 true 일 때 수행
 *      아닐시 다음 조건으로 이동
 *    }
 *    else
 *    {
 *    	해당 조건이 없는 경우 처리문장
 *    }
 *    =================================
 *    선택문
 *    switch(정수,문자,문자열)
 *    {
 *     case 값;
 *     	처리문장
 *     	break;
 *     --
 *     --
 *     --
 *     --
 *     default:
 *     처리문장 ==> 생략 가능
 *    }
 *   
 */

package 제어문_문제_final;

import java.util.Scanner;
public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		System.out.println("두 자리 정수 입력(10~99):");
		Scanner scan=new Scanner(System.in);
		// enter , space 
		int a=scan.nextInt();
		
		if(a%11==0)
		{
			System.out.println("두 자리가 같은 수 입니다");
		}
		else
		{
			System.out.println("두 자리는 다른 수 입니다");
		}
	}

}