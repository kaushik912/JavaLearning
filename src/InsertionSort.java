import java.util.Arrays;

public class InsertionSort {
	
	public static int[] insertionSort(final int[] a){
		
		int[] arr = Arrays.copyOf(a, a.length);
		
		for(int j=1; j<arr.length;j++){
			int key=arr[j];
			int i=j-1;
			while(i >=0 && arr[i]> key){
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] arr = new int[]{10,3,2,7};
	
		int[] sorted =insertionSort(arr);
		
		for(int num: sorted){
			System.out.println(num);
		}
		
		for(int num: arr){
			System.out.println(num);
		}
	}
	
	

}
