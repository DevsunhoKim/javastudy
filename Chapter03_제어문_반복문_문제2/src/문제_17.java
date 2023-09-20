/*
 * 17. 다음 결과를 출력하는 프로그램
 
 출력예) A B C D E
	   A B C D E
	   A B C D E
	   A B C D E
	   A B C D E
 */
public class 문제_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				
				System.out.print(c);
				c++;
			
			}
			System.out.println();
		}

	}

}
