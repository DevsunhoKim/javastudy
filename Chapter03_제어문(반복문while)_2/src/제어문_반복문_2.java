//가위 바위 보 => 10번 ==> 3승 2무 5패
import java.util.Scanner;
class A
{
	
}
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0,lose=0,same=0;
		
		int i=1;
		
		Scanner scan=new Scanner(System.in);
		
		while(i<=10)
		{
			System.out.println("======"+i+"번째 게임=======");
			int com=(int)(Math.random()*3);
			System.out.print("가위(0),바위(1),보(2)");
			int user=scan.nextInt();
			
			
			while(true)
			{
				System.out.print("가위바위보를 입력하시오");
				
				if(user>0 || user>2) {
					
					continue;
			}
				break;
			}
			System.out.print("컴퓨터: ");
			if(com==0)
				System.out.println("가위");
			else if(com==1)
			    System.out.println("바위");
			else if(com==2)
				System.out.println("보");
			
			System.out.print("사용자: ");
			if(user==0)
				System.out.println("가위");
			else if(user==1)
			    System.out.println("바위");
			else if(user==2)
				System.out.println("보");
			
			// 승,패 결정
			int res=com-user;
			if(res==-1 || res==2)
			{
				System.out.println("사용자 승");
				win++;
			}
			else if(res==1 || res==-2)
			{
				System.out.println("컴퓨터 승");
				lose++;
			}
			else
			{
				System.out.println("무승부");
				same++;
			}
			
			i++;
		}
		System.out.println("======결과값=======");
		System.out.printf("%d승 %d무 %d패\n",win,same,lose);
	}

}
