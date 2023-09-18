import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("점수 입력 :");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		
		if(a>=90 && a<=100) {
			System.out.println("A 학점입니다.");
		}
		if(a>=80 && a<90) {
			System.out.println("B 학점입니다.");
		}
		if(a>=70 && a<=80) {
			System.out.println("C 학점입니다.");
		}
		if(a>=60 && a<=70) {
			System.out.println("D 학점입니다.");
		}
		if(a<60) {
			System.out.println("F 학점입니다.");
		}
	}

}
