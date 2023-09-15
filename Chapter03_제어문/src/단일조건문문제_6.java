

public class 단일조건문문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=' ';
		int a=(int)(Math.random()*2);
		if(a==0) {
			c=(char)((Math.random()*26)+65);
					
		}
		if(a!=0) {
			c=(char)((Math.random()*26)+97);
					
		}
		//System.out.println("c="+c);
		//대소문자 확인
		if(c>='A' && c<='Z') {
			System.out.println(c+" 는 (은) 대문자입니다");
		}
		if(c>='a' && c<='z') {
			System.out.println(c+" 는 (은) 소문자입니다");
		}
	}

}
