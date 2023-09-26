/*
 *  subString() => 문자를 자른다 
 *  
 *  "Hello Java"
 *   0123456789
 *   
 *   subString(6) ==> Java
 *   
 *   subString(0,5) ==> Hello
 *               -- 마지막 번호는 제외 (0~4까지 가져옴)
 */
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="서울특별시 강남구 도산대로51길 36 지번 서울시 강남구 신사동 655";
		//String s1=s.substring(0,5);
		//String s1=s.substring(6);  // 6번 인덱스 부터 출력
		//String addr=s.substring(0,s.indexOf("지번"));
		//String addr=s.substring(s.indexOf("지번"),s.length());
		//String addr=s.substring(s.indexOf("지번")+3);
		/*
		int a=s.lastIndexOf(" ");
		String addr=s.substring(a-3,a);
		*/
		String ext="Hello.java.java";
		String a=ext.substring(ext.lastIndexOf(".")+1);
		System.out.println(a);
		
	}

}
