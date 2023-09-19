/*
 * 1~100 => 루프변수
 * 총합,짝수의 합, 홀수의 합=> 누적 변수
 */
public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,even=0,odd=0;
		// => 0 => 장바구니 => 결제 금액
		for(int i=1;i<=100;i++) {
			sum+=i; //*** 누적하는 함수
			if(i%2==0) 
				even+=i;
			else
				odd+=i;
			
			System.out.println("sum="+sum+"  i="+i);
		}
			System.out.println("총합:"+sum);
			System.out.println("짝수합:"+even);
			System.out.println("홀수합:"+odd);
	}

}
