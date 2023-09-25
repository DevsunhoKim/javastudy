/*
 *  1. 86p~
 *     'new' = new를 만나는 순간 메모리 확보
 *     		   ----------------------
 *     				|
 *     			  메모리 주소를 전송
 *     			=> new를 사용할 때마다 메모리 주소가 달라진다
 *     
 *     예) int[] arr=new int[5]; : new를 이용하면 자동 초기화(0)
 *       ----------------------
 *       arr
 *       ----   100-[0]-[1]-[2]-[3]-[4]--
 *       100         0   0   0   0   0
 *       ----   -------------------------
 *       메모리 주소를 이용해서 데이터를 제어 ==> 참조 변수
 *       							   --------
 *       								1.배열
 *       								2.클래스
 *       
 *       데이터의 형변환
 *       double[] arr={10,20,'A','B',30}
 *       	=> arr[0]=10.0
 *       	   arr[1]=20.0
 *       	   arr[2]=65.0
 *       	   arr[3]=66.0
 *       	   arr[4]=30.0
 *       
 *       int[] arr={10.0,'A','B',20,30} => 오류
 *       		   -----
 *       
 *       boolean[] arr={true,true,false,true...}
 *       
 *       데이터형[] 배열명;
 *       		 ----- 참조변수
 *       => 전체 크기(지정된 갯수) => length
 *       => 데이터형[] 배열명=new 데이터형[]; => 오류발생
 *       				 ------------ 갯수 설정
 *       
 *       배열 복사
 *       => 얕은 복사 : 참조 (공유)
 *       	깊은 복사 : 새로운 배열을 만든다.
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 얕은 복사 => Call by Reference
		int[] arr=new int[5];
		// 0으로 초기화 => 연속적인 메모리구조
		//System.out.println(arr);
		int[] arr2=arr;
		System.out.println(arr);  //
		System.out.println(arr2); // 같은 메모리 주소로 제어됨
		// 배열이나 클래스인 경우에 가튼 주소를 가지고 있으면 같은 메모리 제어
		// 얕은복사
		
		arr[0]=100;
		arr[1]=200;
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
		

	}

}
