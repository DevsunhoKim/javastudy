/*
 *  식별자 => 변수 , 함수 , 메소드 , 클래스 , 인터페이스
 *  		---------------------------------
 *   자바에서 제공하는 제어문
 *   = 조건문 : 형식 , 사용처
 *     = 선택문 : 값이 1개 => 키보드 , 서버 프로그램 => Application
 *     	 형식)
 *     		switch(정수,문자,무자열)
 *     		{
 *     			case 값:
 *     			실행문장
 *     			break; => 실행문장 수행 후 종료
 *     			------  중보적으로 실행문장이 있는 경우에는 break 생략이 가능
 *     			case 값:
 *     			...
 *     			...
 *     			default : 값이 없는 경우 실행문장
 *     		} 버튼 클릭 ,메뉴 선택
 *     = 단일조건문
 *     형식)
 *        if(조건문) => 조건(T/F)
 *        {           ---------   (비교,논리,부정연산자)
 *          조건이 true일 때 수행하는 문장
 *        }
 *        => 웹 ) 상세보기 , 로그인 , 아이디찾기...
 *        => 독립적이다 (if문마다 따로 수행)
 *        => 조건에 해당되는 모든 내용 출력...
 *     = 다중조건문
 *     	형식) 
 *     		if(조건문)
 *      	{
 *      		조건이 true일때 수행하는 문장 => 수행 후 종료
 *      		조건이 false일때 다음 if 문을 찾아간다
 *      	}
 *      	else if(조건문)
 *      	{
 *      		조건이 true일때 수행하는 문장 => 수행 후 종료
 *      		조건이 false일때 다음 if 문을 찾아간다
 *      	}
 *      	else if(조건문)
 *      	{
 *      		조건이 true일때 수행하는 문장 => 수행 후 종료
 *      		조건이 false일때 다음 if 문을 찾아간다
 *      	}
 *      	else
 *      	{
 *      		위 모든 조건에 false일 경우 수행
 *      	}
 *      =제어문 / 변수 / 연산자 ==> 자바스크립트,오라클
 *      
 *     = 선택조건문 : true와 false를 나눠서 처리
 *     	형식)
 *     		if(조건문)
 *     		{
 *     			조건이 true 일 때 ==>(로그인 성공)
 *     		}
 *     		else
 *     		{
 *     			조건이 false 일 때 ==>(로그인 실패)
 *     		}
 *     ===========================================
 *     DB단 : DBA
 *     View단 : HTML,JS
 *     Back단 : Java
 *     -----------------------------------------
 *     
 *     
 *     
 *     
 *     65p
 *   = 반목문
 *   	=> 종류 ,형식
 *   	1) 종류 
 *   	= for  => 반복횟수가 있는 경우
 *   			웹) 목록출력, 쿠키출력 ...
 *   	= while=> 반복횟수가 없는 경우 (무제한)
 *   			  서버프로그램,게임,데이터베이스프로그램,파일읽기
 *   	  형식)
 *   	  while(조건문)
 *   	  {
 *    		반복 실행 문장
 *   	  }
 *   	= do~while => 반복횟수가 없는 경우 ==> 한 번은 반드시 실행할 때
 *   			   => 후 조건
 *   	  형식)
 *   		do{
 *   			반복 실행문
 *   		  }while(조건문)
 *   	=
 *
 *   = 반복제어문
 *   
 *   1) for  => 2차 for (알고리즘) => 코딩테스트
 *   	형식)	
 *   				 false 면 종료
 *   	         1 => 2 => 4  	
 *   	     for(초기값;조건식;증감식)
 *   		{		  ----
 *   				  true
 *   				   |
 *  		 
 *  				3
 *  			반복 실행 문장
 *  
 *  		}
 *  		초기값 : 조건식에 사용할 변수 선언 => 값은 한 번만 사용
 *  		조건식 : 반복 횟수 => 반복문을 중단할 지 여부 확인
 *  				false => 종료, true => 반복 수행
 *  		증가식 : 조건식이 false가 되는 조건을 만든다
 *  		----
 *  			한개 : ++ ,--
 *  			여러개 : += ,-=
 * 
 */

public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("=======for=======");
		for(int i=1;i<=10;i++) {
			System.out.println("Hello For문");
		}
		for(int i=0;i<10;i++) {
			System.out.println("Hello For문");
	
		}
		System.out.println("=======for=======");
		for(int i=10;i>=0;i--) {
			System.out.println("Hello For문");
		}
	}

}
