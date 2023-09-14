import java.util.Scanner;
public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   
	    
	    
	    Scanner scan=new Scanner(System.in);
	    System.out.println("문자 입력: ");
	    char ch =scan.next().charAt(0);
	    System.out.println("ch=" + ch);
	    char lowerCase=(ch>='A'&& ch<='Z'?(char)(ch+32):(char)(ch-32) );
	    System.out.println("변경된 값 :" + lowerCase);

	}

}
