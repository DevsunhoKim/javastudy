/*
 *  if~else
 * 
 *  예상되는 결과값이 두 개로 나눠서 나오는 경우 => if~else
 *  단일조건문 > 여러개가 동시에 결과값이 있는 경우
 *  다중조건문 > 여러개중에 1 개만 수행
 * 
 *
 */
//국어,영어,수학 => 평균 ,총전 => 평균이 60점 이상 미만
import java.util.Scanner;
public class 제어문_조건문_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		int kor,eng,math,total;
		double avg;
		// 초기화 => 명시적인 초기화 , 입력값을 받아서 저장, 임의 발생
		//	(int a=10;)            (Scanner)        (random)
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수:");
		kor=scan.nextInt();
		System.out.println("영어 점수:");
		eng=scan.nextInt();
		System.out.println("수학 점수:");
		math=scan.nextInt();
		
		//총점
		total=kor+eng+math;
		//평균
		avg=total/3.0;
		System.out.println("=====결과값=====");
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		
		if(avg>=60)
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
		}
		// 결과값 도출


	}

}
