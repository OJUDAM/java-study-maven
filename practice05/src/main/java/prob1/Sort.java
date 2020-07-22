package prob1;

import java.util.Arrays;

public class Sort {
	
	public static void main(String[] arg) {
	
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count =  array.length;
		
		System.out.println( "Before sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print( array[ i ] + " " );
		}
		
		//
		// 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
		// 
		
		for(int i=0;i<count-1;i++) {
			temp = array[i];
			for(int j=i+1;j<count;j++) {
				if(temp<array[j]) {
					array[i]=array[j];
					array[j]=temp;
					temp=array[j];
				}
			}
			System.out.println(Arrays.toString(array));
		}
		
		System.out.println( "\nAfter Sort." );
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}