/*
 * 문자열을 입력받아서 A,a 몇개인지 확인
 */
import java.util.Scanner;
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력:");
		String data=scan.next();
		
		int count=0;  // A || a 의 개수
		// charAt 문자를 하나씩 잘라올 때 사용
		// "Hello" 01234 ==> charSt(5)=> 오류
		for(int i=0;i<data.length();i++)
		{
			
			char c=data.charAt(i);
				if(c=='A' || c=='a')
				
					count++;
				
			
			
		}
		
		
		System.out.println(count);
	}

}
