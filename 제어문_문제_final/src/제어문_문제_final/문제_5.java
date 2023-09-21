/*
 * 5.	정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 
         배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.

 */
package 제어문_문제_final;

public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		
		for(int i=0;i<=10;i++)
		{
			int a=(int) ((Math.random()*10)+1);
			System.out.print(a+" ");
			sum+=a;
			
		}
		
		
		System.out.println("평균 : "+sum/10.0);
	}

}
