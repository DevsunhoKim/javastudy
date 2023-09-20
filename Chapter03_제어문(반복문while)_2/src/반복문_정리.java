/*
 * 2차 for
 * ------
 * for(초기값,조건식,증가식) ==>홀수 (row)
 * {
 *   for(초기값,조건식,증가식) ===> 실제 출력
 *   {       ----- 설정 (수열=방정식) => 수와 수의 관계
 *   				   ------------ 분석 (Numpy ,Pandas)
 *   					            Matplolib => 시각화
 *   								R => 자바에서 연동 (Rserve)
 *     반복 수행문장
 *   }
 *    System.out.println();
 *  }
 *  
 *  ==> 등수 구하기 ,빈도 구하기 ,정렬(선택,버블)
 *  
 *      *
 *     **
 *    ***
 *   ****
 *  ***** 
 *    i   j   k
 *    줄수 공백 별표
 *    1   4   1
 *    2   3   2
 *    3   2   3
 *    4   1   4
 *    5   0   5
 *    -----
 *     i+j=5 ==> j=5-i
 *             k=i
 */
public class 반복문_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
