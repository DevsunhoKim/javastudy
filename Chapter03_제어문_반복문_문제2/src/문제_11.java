/*
 * 11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성

 */
import java.util.Scanner;
public class 문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		for (int i=1;i<=10;i++)
		{
			System.out.println("정수 입력 :");
			Scanner scan=new Scanner(System.in);
			int a=scan.nextInt();
			if(a%2==0)
			{
				count++;
			}
			
			
		}
		
		System.out.println("짝수 갯수 : " + count);

	}

}
