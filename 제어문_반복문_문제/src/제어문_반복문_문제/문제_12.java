package 제어문_반복문_문제;

public class 문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a7=0,a9=0;
		for (int i=1;i<=1000;i++) {
			if(i%7==0) {
				a7+=i;
			if(i%9==0)
				a9+=i;
			}
		}
			System.out.println("7배수 합:"+a7);
			System.out.println("9배수 합:"+a9);

	}

}
