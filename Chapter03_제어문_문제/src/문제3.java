import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하시오 :");
		a=scan.nextInt();
		if(a>0) {
			System.out.println("절대값 :"+a);
		}
		else if(a<0) {
			System.out.println("절대값 :"+a*(-1) );
		}
		else {
			System.out.println("0입니다.");
		}
	}

}
