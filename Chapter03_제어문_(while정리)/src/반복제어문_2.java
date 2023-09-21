import java.util.Scanner;
public class 반복제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 9개의 메뉴
		while(true)
		{
			System.out.print("메뉴 선택 :");
			int menu=scan.nextInt();
			if(menu<1 || menu>9) // 없는 메뉴 선택
			{
				System.out.println("없는 메뉴 입니다");
				continue; //조건 식으로 이동 (처음부터 실행)
			}
			if(menu==9) {
				//System.exit(0); ==> 프로그램 전체 종료
				break; // while 문만 종료
			}
			System.out.println(menu+"번 메뉴를 선택하셨습니다");
		}
		
		System.out.println("프로그램 종료");
	}

}
