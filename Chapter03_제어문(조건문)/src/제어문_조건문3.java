/*
 * 다중 조건문 => 결과값이 하나만 도출
 * 형식)
 *     if(조건문)
 *     {
 *      조건이 true 일 떄 수행문장 ==> 종료
 *                        |
 *     }                  |
 *     else if(조건문)   false 
 *     {
 *      조건이 true 일 떄 수행문장 ==> 종료
 *     }                  |
 *     else if(조건문)   false
 *     {                  |
 *      조건이 true 일 떄 수행문장 ==> 종료
 *     }
 *     ...
 *     ...
 *     else => 생략이 가능 => 해당 조건이 없는 경우에 처리
 *     {
 *     }
 *  한 개의 문장만 수행 => 게임 , 네트워크 서버
 *  
 *  국어 ,영어, 수학 점수를 입려받아서 => 총점 , 평균, 학점 , 합격 ,불합격
 *  
 */

import java.util.Scanner;
public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math,total;
		double avg;
		char score=' '; ///명시적인 초기화
		
		//입력값 받는다
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수:");
		kor=scan.nextInt();
		System.out.println("영어 점수:");
		eng=scan.nextInt();
		System.out.println("수학 점수:");
		math=scan.nextInt();
		//초기화
		total=kor+eng+math;
		avg=total/3.0;
		//학점 => 평균 => 90이상이면 A ,80이상 B, 70이상 C,60이상 D , 60이하 F
		if(avg>=90)
		{
			score='A';
		}
		else if(avg>=80)
		{
			score='B';
		}
		else if(avg>=70)
		{
			score='C';
		}
		else if(avg>=60)
		{
			score='d';
		}
		else
		{
			score='F';
		}
		System.out.println("국어 :"+kor);
		System.out.println("영어 :"+eng);
		System.out.println("수학 :"+math);
		System.out.println("총점 :"+total);
		System.out.println("평균 :"+avg);
		System.out.println("학점 :"+score);
	}

}
