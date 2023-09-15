/*
 *  형식
 *  54p 
 *  if(조건문)
 *  {
 *  조건문이 true 일 때 실행하는 문장
 *  ----- (true,false)
 *  		------------
 *  		비교연산자,논리연산자,부정연산자
 *  }
 *  단일 조건문 : 독립수행
 *  			------if문이 한개 문장으로 사용
 *  55p : 중첩 if
 *  if(조건문)    ========>     if(조건&& 조건) 으로도 사용가능
 *  {
 *  	if(조건문)
 *          {
 *          }
 *  }
 */
public class 단일조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 가위 바위 보
		int com=(int)(Math.random()*3);
		if(com==0) {
			System.out.println("가위");
		}
		if(com==1) {
			System.out.println("바위");
		}
		if(com==2) {
			System.out.println("보");
		}
	}

}
