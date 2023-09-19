/*
 * 1~100까지 => 3의 배수의 합, 5의 배수의 합, 7의 배수의 합 => 출력
 */
public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int three=0,five=0,seven=0;
	    for (int i=1;i<=100;i++)
	    {
	    	
	    	//else if 사용할 경우 중복값 제거로 다른 값 출력
	    	if(i%3==0)
	    		three+=i;
	    	if(i%5==0)
	        	five+=i;
	    	if(i%7==0)
	        	seven+=i;
	    }
	    	System.out.println("3의 배수의 합:"+three);
	    	System.out.println("5의 배수의 합:"+five);
	    	System.out.println("7의 배수의 합:"+seven);
	}

}
