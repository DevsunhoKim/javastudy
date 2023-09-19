/*
 * 2~100까지 짝수의 합
 * 초기값 : 2
 * 증가식 : <=100
 * 증가식 : 2
 */
package 제어문_반복문_문제;

public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========문제1========");
		int sum=0;
		for(int i=2;i<=100;i+=2)
		{
			sum+=1;
			
		}
		System.out.println(sum);
		for(int i=5;i<=50;i+=5)
		{
			if(i==50)
			{
				System.out.print(i);
			}
			else
				System.out.println(i+",");
		}
	}

}
