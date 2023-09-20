/*
 * 사용자로부터 정수 1개 받아서 => 구구단 출력
 */
import java.util.Scanner;
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		a=scan.nextInt();
		
		int b=1;
		while(b<=9)
		{
			System.out.printf("%d * %d = %d\t",a,b,a*b);
			System.out.println();
			b++;
		}
	}

}
