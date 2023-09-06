package EY2808;

import java.util.Arrays;

//search given key from multiple elements
//faster in performance than linear search 

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		int[] arr= {10,32,2,5,67,8,3};
		Arrays.sort(arr);
		System.out.println("Sorted array is "+Arrays.toString(arr));
		int lookoutfor=32;
		int lastelementpositioninarray=arr.length-1;
		binarySearch(arr,0,lastelementpositioninarray,lookoutfor);
	}
	static void binarySearch(int[] arr,int startingposition,int lastposition, int searchelement) {
		int midelementposition=(startingposition+lastposition)/2;
		while(startingposition<=lastposition) {
			if(arr[midelementposition]<searchelement) {
				startingposition=midelementposition+1;
			}else if(arr[midelementposition]==searchelement) {
				System.out.println("Element found at position "+midelementposition);
				break;
			}else {
				lastposition=midelementposition-1;
			}
			midelementposition=(startingposition+lastposition)/2;
		}
		if(startingposition>lastposition) {
			System.out.println("Element not found");
		}
		
	}

}
