/*
 *  equals() == (==)
 */
import java.util.Scanner;
public class 문자열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String MID ="admin",MPWD="1234";
		Scanner scan=new Scanner(System.in);
		System.out.println("아이디 입력 :");
		String id=scan.next();
		System.out.println("비밀번호 입력 :");
		String pwd=scan.next();
		// 대소문자 구분
		
		if(id.equals(MID) && pwd.equals(pwd))
			//equalsIgnoreCase를 사용하면 대소문자 구분 x  ex) 검색창
		{
			System.out.println(id+"님 로그인");
		}
		else
		{
			System.out.println("ID나 Password가 틀렸습니다.");
		}
		
	}

}
