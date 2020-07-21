package practice01;

public class Prob02 {

	public static void main(String[] args) {
		/* 코드를 작성합니다. */
	
		int[] nums = new int[10];
	
		for(int j=0;j<10;j++) {
			
			for(int i=0;i<10;i++) {
				nums[i] = i+j+1;
				System.out.print(nums[i]+" ");
			}
			System.out.println();
		
		}
		
	}

}