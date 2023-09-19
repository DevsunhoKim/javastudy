package 제어문_반복문_문제;

public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0)
			sum-=i;
			else if(i%2!=0)
			sum+=i;
		}
		System.out.println(sum);
	}

}
