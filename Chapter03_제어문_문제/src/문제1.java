import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		a=scan.nextInt();
		/*
		 *  정수  : nextInt()
		 *  실수  : nextDouble()
		 *  논리  : nextBoolean()
		 *  문자열  : next()
		 *  
		 *  단점은 char는 읽지 못한다
		 *       ------ 문자열로 읽어서 첫번째 문자를 자른다
		 *       	    charAt(0)
		 */
		
		if(a>0)
		{
			System.out.println("은(는) 양수입니다");
		}
		else {
			System.out.println("은(는) 음수입니다");
		}
	}

}
