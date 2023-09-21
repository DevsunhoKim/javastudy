/*
 * 문자열
 * ---- String 기능이 많다
 *   1. 문자의 갯수 확인 .length() 
 *   2. 검색
 *   	----
 *   	.startWith("검색어") : 시작하는 문자열이 같은 경우
 *   	endsWith : 끝나는 문장이 동일 => cookie
 *   	***contains : 포함된 문자가 있는지
 *   	-------- 추천
 *   	***equals : 같은 값 ==> id,password
 *   	 ---------- 대소문자 구분
 *   3. 문자열 제어
 *   	= 변경 : replace() , repalceAll()
 *   	replace('a','b')
 *      repalceAll("[가-힣]","")
 *      repalceAll("[0-9A-Za-z","")
 *      
 *      
 *   4. 문자 자르기 : substring(1) , substring(4,7)
 *   				1번부터 출력        4~6번까지 출력
 *   =대문자 : toUpperCase()
 *   =소문자 : toLowerCase()
 *   
 *   4. 모든 데이터형을 문자열로 변경
 * 	
 * 	   =valueOf(1)  ===> "1" 윈도우,웹에서는 숫자전송 불가
 * 
 *   5. 분리 : split() 
 *   	charAt(index)
 *   ==> "Hello java" ==> charAt(0) ==> "H"
 *   	****java의 index는 0번부터 시작한다 (오라클 1번)
 *   
 *   String => 일반형 => 
 *   ------------------ Call By Value / Call By Reference
 *   						|            => 배열 / 클래스
 *   					  String
 *   
 *   형식) String s="";
 *   	 String s=new String("")
 *   
 */
import java.util.Scanner;
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello Java!!";
		System.out.println(s.length()); // 문자 갯수 => 공백 포함
		if(s.startsWith("Hello"))   // suggest ==> ***로 시작되는 검색어
		{
			System.out.println("포함됨");
		}
	}

}
