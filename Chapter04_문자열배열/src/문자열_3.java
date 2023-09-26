/*
 *  String		toUpperCase() => 대문자 변환
 *  String		toLowerCase() => 소문자 변환
 */
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="Hello Java";
		msg.toUpperCase();
		System.out.println(msg); // 변경 안됨
		//msg=msg.toUpperCase(); ==> 대문자로 변환하여 다시저장
		System.out.println(msg.toUpperCase()); //값을 다시 저장해야 적용
		//msg=msg.toLowerCase();  ==> 소문자로 변환하여 다시저장
		System.out.println(msg); // 값을 다시 저장해야 적용
		// 처리 => 다시 저장하지 않는 경우에는 원본을 유지
		// 대문자로 변환하는 것은 가끔
		// 오라클에서 대문자 구분
	} 

}
