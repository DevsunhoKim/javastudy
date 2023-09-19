/*
 * 1. 반복문 => 중복을 제거
 * 			  -------- 메소드
 * 	1. 데이터 저장
 * 		변수 (한개만 저정이 가능) => 묶어서 사용
 * 		국어,영어,수학,총점,평균
 * 		------------------ 배열	===> 클래스
 *  2. 명령문 => 묶어서 사용 ==> 
 *     ---------------------메소드
 *     				        --------- 클래스
 * 
 * 2. 반목문의 종류
 *   1.for 횟수가 지정된 경우에 주로 사용
 *   		=> 화면 출력 (영화목록 , 맛집목록)
 *  
 * 	   일반 for 문 / 향상된 for 문 (배열,컬렉션)
 *         |
 *         => 2차 for 까지(웹에서 아주 가끔) -> 코딩 테스트
 * 	2. while : 횟수가 없는 경우에 주로 사용
 * 			=>루프 (파일 읽기)
 *  3.do~while : 반드시 한 번 이상을 수행하는 반복문(사용빈도 거의 없음)
 *  ------------------------------------------------------
 *       |
 *     규정/문법 사항은 아니다.
 *     
 *  4. 제어 (다시 시작, 종료, )
 *  	----------------
 *      break; -> 반복문 중단
 *      continue-> 특정 부분을 제외 시킴
 *      ---------------------------------------
 *      for : 1)형식 2)동작(순서) 3)패턴
 *           for(초기값;조건식;증감식;) => 블록을 생략할 수 있으나 가급적 블록을 입력
 *           {
 *            반복 실행문장
 *            일반 문장 ==> for문 소속 문장이 아니다
 *           }
 *           
 *           동작       | false 면 종료
 *                1    2    4
 *                
 *           for(초기값;조건식;증감식;)      1/2/3/4
 *           {         |                 2/3/4
 *                      3                ....
 *                  반복 실행문장
 *           }
 */
import java.io.*;
public class 반복문_1 {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
	/*	String s="ABCDEGHIJKLMNOP";
		String[] alpha=s.split("");
		for(int i=0;i<alpha.length;i++)
		{
			System.out.println(alpha[i]);
		}
		System.out.println();
		for(String ss:alpha) {
			System.out.println(ss);
		} */

		FileReader fr=new FileReader("C:\\javaDev\\javaStudy\\Chapter03_제어문_반복문1\\src\\반복문_1.java");
		int i=0;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
	}

}
