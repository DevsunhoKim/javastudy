/*
 * 
 */
import java.util.*;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int[] arr2=arr;
		// 같은 메모리 제어(얕은 복사)
		
		int[] arr3=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr3[i]=arr[i];
		}
		
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println("====arr====");
		System.out.println(Arrays.toString(arr));
		System.out.println("====arr2====");
		System.out.println(Arrays.toString(arr2));
		System.out.println("====arr3====");
		System.out.println(Arrays.toString(arr3));
		
		arr[0]=1000;
		arr2[0]=100;
		
		System.out.println("arr[0]="+arr[0]);
		System.out.println("arr2[0]="+arr2[0]);
		System.out.println("arr3[0]="+arr3[0]);
		
	}

}
