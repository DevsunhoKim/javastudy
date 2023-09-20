/*
 * 16. 다음 결과를 출력하는 프로그램
 
 출력예) 1 # # # #
	   # 2 # # #
	   # # 3 # #
	   # # # 4 #
	   # # # # 5

 */
public class 문제_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				
				if(i==j)
					System.out.print(i);
				else
					System.out.print('#');
			}
			System.out.println();
		}

	}

}
