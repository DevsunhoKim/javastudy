import java.util.Scanner;
public class 문제4 {
	public static void main(String[] args) {
		int a;
		System.out.println("정수 입력");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		
		if((a%4==0 && a%100!=0)||(a%400==0)) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("윤년이 아닙니다");
		}
	}
}
