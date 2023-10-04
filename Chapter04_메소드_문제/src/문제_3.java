//1. 1~10까지 출력하는 메소드 구현
/*
 * 리턴형 메소드명(매개변수...)
 * {          --------------- 가변 매개변수
 * 			=> 자체에서 출력 void (결과값이 없는 상태)
 * }
 */

public class 문제_3 {
	static void print()
	{
		for(int i=1;i<=10;i++)
		{
			
			System.out.print(i +" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
	}

}
