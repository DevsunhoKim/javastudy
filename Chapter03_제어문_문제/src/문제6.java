import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,g;
		System.out.println("점수 입력 :");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		
		g=(char)a/10;
		g=' ';
		
		switch(g) {
		case 10:  // avg==10 || avg==9
		case 9:
			g='A';
			break;
		case 8:
			g='B';
			break;
		case 7:
			g='C';
			break;
		case 6:
			g='D';
			break;
		default:
			g='F';
			
			
			System.out.println("학점:"+ a);
	}
		
		
	}

}
