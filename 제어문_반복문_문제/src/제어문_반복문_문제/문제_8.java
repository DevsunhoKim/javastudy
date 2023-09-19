package 제어문_반복문_문제;

public class 문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count=0;
		for (int i=100;i<=999;i++) {
			if(i%7==0) {
				sum+=i;
				count++;
			}
		}
			System.out.println("1~100까지 7의 배수의 합:"+sum);
			System.out.println("1~100까지 7의 배수의 수:"+count);

	}
	
}
