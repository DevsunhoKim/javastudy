package 제어문_반복문_문제;
import java.util.Scanner;
public class 문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println(num);
		System.out.println(sum);
		
	}

}
