import java.util.Scanner;
public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자 입력");
		char ch =scan.next().charAt(0);
		System.out.println("ch="+ch);
		boolean b=(ch>='A' && ch<='Z' || 
				ch>='a' && ch<='z' || 
				ch>='0' && 
				ch<='9'?true:false);
		System.out.println(b);
	}

}
