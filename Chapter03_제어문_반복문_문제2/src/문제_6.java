/*
 * 6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.

 */
import java.util.Scanner;
public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("시작 값 :");
		int a=scan.nextInt();
		System.out.println("끝 값 :");
		int b=scan.nextInt();
		int res=1;
		for(int i=a;i<=b;i++)
		{
			res*=i;
		}
		System.out.println("결과 :"+res);
	}

}
