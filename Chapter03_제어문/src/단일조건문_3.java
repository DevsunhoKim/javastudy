/*
 * 1~100 사이의 난수를 3개 발생
 * => 발생된 난수 출력
 * => Max,min 출력
 */

public class 단일조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		System.out.println(a+","+b+","+c);
		
		int max=a;
		if(max<b) {
			max=b;
		}
		if(max<c) {
			max=c;
		}
      System.out.println("MAX :"+max);

      int min=a;
		if(min>b) {
			min=b;
		}
		if(min>c) {
			min=c;
		}
    System.out.println("Min :"+min);
	}

}
