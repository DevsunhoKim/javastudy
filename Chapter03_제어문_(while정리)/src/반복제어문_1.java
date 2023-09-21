// break ==> while , for => System.exit(0)

public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * i=1  j=1
		 * 		j=2
		 * 		j=3
		 * 
		 * i=2  j=1
		 * 		j=2
		 * 		j=3
		 * 
		 * i=3  j=1
		 * 		j=2
		 * 		j=3 ==>9회 루프
		 */
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break;   //==> i변수는 제어하지 못하고 j만 제어
				System.out.println("i="+i+","+"j="+j);
			}
		}
		System.out.println("=====continue=====");
		/*
		 * i=1 j=1,3
		 * i=2 j=1,3
		 * i=3 j=1,3
		 */
		
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					continue;   // 소속 문장만 제어
				System.out.println("i="+i+","+"j="+j);
			}
		}
		System.out.println("========이름있는 break========");
		
		outer:for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break outer;   // 이름있는 break 1,2차 for문 동시제어
				System.out.println("i="+i+","+"j="+j);
			}
		}
	}

}
