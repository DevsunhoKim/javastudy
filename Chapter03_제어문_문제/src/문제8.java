import java.util.Scanner;
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*3);
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2)");
		int user=scan.nextInt();
		
		switch(a)  // 중첩 switch문
		{
			case 0:
				switch(user) 
				{
				case 0:
					System.out.println("비겼다.");
					break;
				case 1:
					System.out.println("사용자 승.");
					break;
				case 2:
					System.out.println("컴퓨터 승.");
					break;
				}
			case 1:
				switch(user) 
				{
				case 0:
					System.out.println("컴퓨터 승.");
					break;
				case 1:
					System.out.println("비겼다.");
					break;
				case 2:
					System.out.println("사용자 승.");
					break;
				}
			case 2:
				switch(user) 
				{
				case 0:
					System.out.println("사용자 승.");
					break;
				case 1:
					System.out.println("컴퓨터 승.");
					break;
				case 2:
					System.out.println("비겼다.");
					break;
				}
				
		}
		

	}

}
