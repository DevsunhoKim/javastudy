import java.util.Scanner;

public class 단일조건문문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수:");
		int kor=scan.nextInt();
		
		System.out.println("영어 점수:");
		int eng=scan.nextInt();
		
		System.out.println("수학 점수:");
		int math=scan.nextInt();
		
		System.out.println("국어점수:" +kor);
		System.out.println("영어점수:" +eng);
		System.out.println("수학점수:" +math);
		System.out.println("총점:" + (kor+eng+math));
		double avg=(kor+eng+math)/3.0;
		System.out.printf("평균:%.2f\n",avg);
		
		int temp=(int)avg/10;
		if(temp==10 || temp==9) {
			System.out.println("학점 : A");
		}
		if(temp==9 || temp==8) {
			System.out.println("학점 : B");
		}
		if(temp==8 || temp==7) {
			System.out.println("학점 : C");
		}
		if(temp==7 || temp==6) {
			System.out.println("학점 : D");
		}
		if(temp<6) {
			System.out.println("학점 : F");
		}
	}

}
