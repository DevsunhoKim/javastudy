/*
 * while 
 * -----
 * 	=> 10개의 난수 발생 => 1~100
 *  => 최대값 / 최소값 
 * 
 * 
 */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0,min=101;
		int i=1; //루프 변수 => 1~10
		while(i<=10)
		{
			int rand=(int)(Math.random()*100)+1;
			System.out.print(rand+" ");
			// 최대값 / 최소값
			i++; // 증가식이 없으면 무한 루프
			if(max<rand)
				max=rand;
			if(min>rand)
				min=rand;
			
		}
		System.out.println("\n최대값 :"+ max);
		System.out.println("최소값 :"+ min);
		
	}

}
