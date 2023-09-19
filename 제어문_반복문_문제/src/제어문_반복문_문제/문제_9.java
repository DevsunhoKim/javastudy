package 제어문_반복문_문제;

public class 문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0,count=0;
		for (int i=100;i<=999;i++) {
			if(i%4!=0) {
				sum+=i;
				count++;
			}
		}
			System.out.println("100~999 4의 배수가 아닌 수의 합:"+sum);
			System.out.println("100~999 4의 배수가 아닌 수의 수:"+count);

	}

}
