/*
 *  split ==> String[] (결과값)
 */
import java.util.*;
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		String actor="하정우,임시완,배성우,김상호";
		String[] movie=actor.split(",");
		System.out.println(movie[0]);
		*/
		/*
		String actor="하정우|임시완|배성우|김상호";
		String[] movie=actor.split("\\|"); // |문자는 정규식으로 텍스트로 읽으려먼 \\추가
		System.out.println(movie[1]);
		*/
		String name=" Hello Java ";
		System.out.println(name.trim()); // 좌우 공백 삭제 (중앙 공백은 제외)
		// 인덱스 숫자도 공백이 제거된 상태로 변경
		
		//replace => 원하는 문자를 변경
		String s="Hello Java";
		System.out.println(s.replace('a', 'b')); // 문자를 하나씩 대응해서 변경
		System.out.println(s=s.replace("Java","Oracle")); // 단어를 변경
		System.out.println(s); // 대입하지 않으면 원래 문자열 출력
		
		// 문자열 결합
		String msg="나라가 독립을 했으면 당연히 우리 기록도 독립이 되어야지!";
		if(msg.length()>20)
		{
			//msg=msg.substring(0,20)+"...";  concat 과 같은 의미
			msg=msg.substring(0,20).concat("...");
		}
		System.out.println(msg);
		

	}

}
