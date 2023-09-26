/*
 * 40 30 10 50 20 ===> ASC
 * -- --
 * 30 40
 * 	  -- --
 * 	  10 40
 *       -- --
 *       40 50
 *          -- --
 *          20 50
 *             (맨 마지막 고정) 0-4
 * ----------------------------
 *  30 10 40 20 50
 *  -- --
 *  10 30
 *     -- --
 *     30 40
 *        -- --
 *        20 40 (40 고정) 1-3
 * --------------------------- 
 *  10 30 20 40 50
 *  -- --
 *  10 30
 *     -- --
 *     20 30 (30고정)  2-2
 * ---------------------------
 *  10 20 30 40 50   1-3
 *  -- --
 *  10 20
 *  ---------------------------
 *  10 20 30 40 50
 *  
 *  i     j
 *  0	  4 => i+j=4  ==> j=4(length-1)-i
 *  1     3
 *  2     2
 *  3     1
 *  
 *     
 */
import java.util.*;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		// 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("=====정렬전=====");
		System.out.println(Arrays.toString(arr));
		System.out.println("=====정렬후=====");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.println("======"+(i+1)+"round======");
			System.out.println(Arrays.toString(arr));
			
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
