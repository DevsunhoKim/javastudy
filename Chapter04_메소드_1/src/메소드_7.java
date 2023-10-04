/*
 * 로그인 처리
 * 사용자로 부터 id,pw(매개변수) 받음
 * 로그인 여부 확인 ==> void (해당 메소드 처리) , 결과값 받는다
 * 결과값을 받아서 처리 : boolean , int(0,1) , String
 *                  -------
 */

import java.util.Scanner;
public class 메소드_7 {
	static String userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+"를 입력하시오 :");
		String input=scan.next();
		return input;
	}
	static boolean isLogin(String id,String pwd)
	{
		final String ID="admin"; // 상수
		final String PWD="1234"; // 상수
		boolean bCheck=false;
		// 파일 , 오라클 저장
		if(id.equals(ID) && pwd.equals(PWD))
		{
			bCheck=true;
			//return true;
		}
		/*
		else
		{
			bCheck=false;
		}
		*/
		return bCheck;
	}
	static void process()
	{
		String id=userInput("아이디");
		String pwd=userInput("비밀번호");
		boolean bCheck=isLogin(id,pwd);
		// boolean => bXxxxx
		// isXxxx => 리턴형 boolean
		// 처리
		if(bCheck==true)
		{
			System.out.println("메인 화면으로 이동....(response).sendRedirect('main.jsp')");
		}
		else
		{
			System.out.println("ID나 비밀번호가 틀리다..(history.back())");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
