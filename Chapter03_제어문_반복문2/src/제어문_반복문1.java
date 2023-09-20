/*
 *  데이터 저장
 *  --------
 *    변수/상수 ***
 *    배열
 *    클래스
 *    ------- 메모리
 *    파일
 *    RDMS =======> JDBC (핵심)
 *    ------- 영구적인 저장 장치
 *    사용자가 요청 => 처리 (데이터 가공)
 *    	연산자***
 *      제어문***
 *    ---------- 명령문
 *    	메소드
 *    ------------------------------- 클래스 (컴포넌트)
 *     출력 => 화면
 *     화면 출력 : System.out
 *     브라우저 : HTML / CSS/JavaScript
 *     ------------------------------- 동시에 처리 => Spring
 *     
 *     => 서버(Spring)에서 요청 처리 ==> 화면 변경(구시대)
 *     ------------------------------------------------------
 *     => 차세대 개발
 *     	  Spring boot(서버) <=====> Front
 *          Restful (JSON)        ------ 처리 속도(Vue,React)
 *             |
 *            통합 => 각 프로그램마다 따로 서버를 돌린다 (MSA)
 *            
 *         => AI
 *         ================================================
 *         
 *  ===> 반복문 
 *  	= for : 브라우저 화면 출력
 *  			페이지 나누기
 *  			-------------- 사용자가 한 눈에 볼 수 있따 (15개~20개)
 *  			=========== 반복 횟수가 있는 경우
 *  	
 *  			형식) 
 *  				==> 가독성
 *  				==> 3번 이상
 *  				for(초기값;조건식;증가식)
 *  				{
 *   					반복 수행문장
 *  				}
 *  				초기값 : 한번만 사용이 가능 => 시작점
 *  				조건식 : 반복 횟수
 *  				증감식 : => 총 횟수 => 한개 or 여러개
 *  								   ++       +=	
 *  			순서)          
 *  
 *                  false(종료) ↑  
 *  				     ①  →  ②  ←  ④
 *  				for(초기값;조건식;증가식)
 *  				{    ture ↓   ↗
 *                            ③
 *   					  반복 수행문장
 *  				}
 *  			
 *  				for(int i=1;,i<=10;i++) ==> 10번 수행
 *  				for(int i=1;,i<=10;i+=) ==> 5번 수행
 *  				for(char c='A';c<='Z'c++)
 *  	=========================================================
 *  
 *   2차 for 문
 *   		   1    2    4
 *        for(초기값;조건식;증가식) => 줄수
 *        {         |
 *                  3 
 *         --------------------------------------
 *                 1    2    4
 *            for(초기값;조건식;증가식) => 실제 출력문
 *                      |
 *                      3
 *            {
 *            
 *            	반복 수행 문장
 *            }
 *            system.out.println()
 *        }
 *  		
 *  		for(int i=1;i<=3;i++)
 *          {
 *          	for(int j=1;j<=3;j++)
 *          	{
 *          
 *          	}
 *          
 *          }
 *          i=1 =>j=1
 *          	  j=2
 *          	  j=3
 *  		i=2 =>j=1
 *          	  j=2
 *          	  j=3
 *  		i=3 =>j=1
 *          	  j=2
 *          	  j=3
 *  	    i=4 ==> 종료
 *  ------------------------------------------			
 *  
 *  
 *  	= while : 파일/데이터베이스(오라클)
 */
public class 제어문_반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 웹에서 2차 for문은 사용하지 않는다
		// 코딩테스트 => sort , 중복없는 난수 ....
		for(int i=1;i<=3;i++) 
		{
			for(int j=1;j<=3;j++) 
			{
				System.out.println("i="+i+",j"+j);
			}
			System.out.println();
		}

	}

}
