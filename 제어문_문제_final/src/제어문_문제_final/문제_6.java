/*
 * 6.	1부터 100 까지의 정수 중에서 짝수만을 더해 출력하는 코드를 for 문을사용해 작성해 보세요
 */
package 제어문_문제_final;

public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			
			sum+=i;
			
		}
		
		System.out.println(sum);
	}

}
