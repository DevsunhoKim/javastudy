import java.util.Scanner;
public class 단일조건문문제_2 {
// 정수 한 개를 입력 받아서, 그 수가 3의 배수인지 판단해보자.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수입력");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		if(a%3==0) {
			System.out.println("3의 배수입니다.");
		}
		if(a%3!=0) {
			System.out.println("3의 배수가 아닙니다.");
		}
	}

}
//정답