package 제어문_문제_final;

public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, i=1;
		while(i<=100)
		{
			if(i%3==0)
			{
				i++;
				continue;
				
				
				
			}
			else
			{
				sum+=i;
				i++;
			}
		}
		System.out.println(i);
	}

}
