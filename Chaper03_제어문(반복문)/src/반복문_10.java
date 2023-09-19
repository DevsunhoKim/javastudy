/*
 * 사용자가 정수 1개 입력=> 입력받은 수까지의 합을 출력
 */
import java.util.Scanner;
public class 반복문_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력 :");
		int input=scan.nextInt();
		
		int sum=0;
		for(int i=1;1<=input;i++)
		{
			sum+=1;
			
		}
		System.out.println("1~"+input+"까지의 합 :"+sum);
	}

}
