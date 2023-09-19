/*
 * 1~100 까지 5의 배수의 합과 갯수 출력
 */
public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count=0;
		for (int i=1;i<=100;i++) {
			if(i%5==0) {
				sum+=i;
				count++;
			}
		}
			System.out.println("1~100까지 5의 배수의 합:"+sum);
			System.out.println("1~100까지 5의 배수의 수:"+count);
	}
}
