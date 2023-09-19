// 1~30 사이의 짝수만 출력
public class 반복문_12 {
	public static void main(String[] args) {
		
		int a=0;
		for(int i=1;i<=30;i++) {
			if(i%2==0) {            
				System.out.printf("%2d\t",i);
			}
			if(i%6==0) {             // 2의 배수를 3개씩 출력
				System.out.println();
			}
		}
	}

}
