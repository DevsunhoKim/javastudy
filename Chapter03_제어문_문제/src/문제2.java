import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a;
      Scanner scan=new Scanner(System.in);
      System.out.println("정수를 입력하시오");
      a=scan.nextInt();
      if(a%3==0) {
    	  System.out.println("3의 배수입니다");
      }
      else {
    	  System.out.println("3의 배수가 아닙니다");
      }
	}

}
