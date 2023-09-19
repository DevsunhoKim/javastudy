/*
 *  up-down 게임 
 *  -----------
 *  컴퓨터가 난수 발생: 1~100
 *  --------------------
 *  => 힌트
 *     ---
 *     => 정답이 나올때 까지 반복
 *        ---------------- 무한 루프
 *        for(;;) => while(true)
 */
// import java.lang.*
import java.util.Scanner;
public class 반복문_9 {
	//*** 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 발생
		int com=(int)(Math.random()*100)+1;
		
		// 종료 => break , System.exit(0)
		Scanner scan=new Scanner(System.in);
		int count=0;
		for(;;)//무한 루프
		{
			System.out.print("1~100사이의 값 입력:");
			int user=scan.nextInt();
			if(user<1 || user>100) 
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			count++;
			//hint
			if(com>user)
			{
				System.out.println("높은 정수 입력(UP)");
				
			}
			else if(com<user)
			{
				System.out.println("낮은 정수 입력(DOWN)");
			}
			else //정답
			{
				System.out.println("Game Over");
				System.out.println("입력횟수 :"+count);
				System.exit(0); // 컴퓨터 종료
			}
		}
	}

}
