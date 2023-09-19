/*
 * 20개의 정수 난수 발생 => 3의배수 5의배수 7의배수 갯수
 */
public class 반복문_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0,a5=0,a7=0;
		for(int i=0;i<20;i++)
		{
			int rand=(int)(Math.random()*10)+1;
			System.out.print(rand+" ");
			if(rand%3==0)
				a3++;
			if(rand%5==0)
				a5++;
			if(rand%7==0)
				a7++;
		}
		System.out.println("\n===========결과값===========");
		System.out.println("3의 배수 갯수:"+a3);
		System.out.println("5의 배수 갯수:"+a5);
		System.out.println("7의 배수 갯수:"+a7);
		
		System.out.println("============================");
		//1-2+3-4+5-6+7-8+9-10
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}
		
		
				for(char c='B';c<='Z';c+=2)
				{
					System.out.println(c+" ");
				}
	}
	   /*
	    * for 문 수행시 => 수열 (숫자마다 패턴을 가지고 있어야 반복문이 수행된다.)
	    */

}
