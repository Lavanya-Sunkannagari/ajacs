package co.practice.arrays;

public class PeakElement {
	public static void peak(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if((arr[i]<arr[i+1]) && (arr[i+1]>arr[i+2])){
				System.out.println(arr[i+1]);
			}
		}
	}

	public static void main(String[] args) {
		int[] nums= {10,11,15,20,50,25,70,50};
		peak(nums);

	}

}
