package 제어문_반복문_문제;

public class 문제_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,sum1=0;
		for (int i=1;i<=30;i++) {
			if(i%2==0) {
				sum+=i;
				
			}
			else {
				sum1+=i;
			}
		}
			System.out.println("1~30까지 짝수의 합:"+sum);
			System.out.println("1~30까지 홀수의 합:"+sum1);
	}

}
