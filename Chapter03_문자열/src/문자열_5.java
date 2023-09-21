/*
 * <span class="rank"><span class="rank-up">3<span
 *
 *    
 *    class="hide">상승</span></span></span>
 *    
 *    replace(char , char)
 *    replace(string ,string)
 */
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="1상승";
		String id=s.replaceAll("[가-힣]", "");
		String state=s.replaceAll("[1-9]", "");
		
		System.out.println("id="+id);
		System.out.println("state="+state);
		System.out.println("▲ " +id);
		
		s="Hello Java!!";
		String ss=s.replace('a', 'b');
		System.out.println(ss);
		ss=s.replace("Java", "Python");
		System.out.println(ss);
		

	}

}
