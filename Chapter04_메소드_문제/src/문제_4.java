// 1~10까지 합을 구하는 메소드 구현
/* -------------- 사용자 요청값 없음 (매개변수 X)
 * 
 * 리턴형
 */
public class 문제_4 {
	static int oPut()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			
			sum+=i;
			
			
		}
		System.out.print(sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oPut();
	}

}
