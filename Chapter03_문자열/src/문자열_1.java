/*
 *  문자열 : " "
 *  문자  : '' => 한 글자 저장 =>char
 *  일반 데이터형
 *  String name="홍길동";
 *  클래스형
 *   기능 => 메소드
 *  => 웹은 데이터형이 존재하지 않는다 => 모든데이터가 문자열
 *  
 *   
 */
import java.util.Scanner;
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="홍길동";
		System.out.println(name);
		char a='홍';
		char b='길';
		char c='동';
		System.out.print(a+b+c);
		
		String add="서울특별시 마포구 연남로1길 11 1F";
		System.out.println("\n"+add);
		Scanner scan=new Scanner(System.in);
		System.out.println("검색어:");
		String findData=scan.next();
		
	}

}
