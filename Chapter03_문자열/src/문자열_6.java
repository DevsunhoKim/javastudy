/*
 * startsWith , endsWith , contain==> 검색기 or 자동완성기
 * 
 */
import java.util.Scanner;
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] data= {
				"Java와 JSP",
				"Java와 Oracle",
				"Oracle Programming",
				"JQuery AND AJAX",
				"Spring AND Java",
				
		};
		Scanner scan=new Scanner(System.in);
		System.out.println("검색어 입력 :");
		String findData=scan.nextLine();  // => 공백까지 포함
		System.out.println(findData);
		
		for(int i=0;i<data.length;i++)
		{
			if(data[i].contains(findData))     //==> 포함된 내용
			//if(data[i].endsWith(findData))   // ==> ~로 시작하는 내용
			//if(data[i].startsWith(findData)) // ==> ~로 끝나는 내용
				// JavaScript 도 같은 메소드 사용
			{
				try {
					Thread.sleep(1000);
				}catch(Exception ex) {}
				System.out.println(data[i]);
			}
		}
		
		
	}

}
