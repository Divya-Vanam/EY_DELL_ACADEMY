package EY2808;

public class SwapElements {

	public static void main(String[] args) {
		int[] intArr= {20,2,3,-10,100,12,0,-1};
		System.out.println("Elements before Swapping");
		for(int i:intArr) {
			System.out.print(i+" ");
		}
		System.out.println();
		//lets say we want to swap element at 4Th index with 2nd index
		int firstIndex=2,secondIndex=4;
		
		//temp variable
		int temp=intArr[firstIndex];
		
		//swapping
		intArr[firstIndex]=intArr[secondIndex];
		intArr[secondIndex]=temp;
		
		System.out.println("Elements after swapping 4th index with value of 2nd index ");
		for(int i:intArr) {
			System.out.print(i+" ");
		}

	}

}
