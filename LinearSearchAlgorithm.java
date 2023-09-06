package EY2808;

import java.util.Arrays;

public class LinearSearchAlgorithm {

	public static void main(String[] args) {
		int[] intArr= {10,3,7,8,20};
		int lengthofarray=intArr.length;
		
		int searchelement=8;
		
		int index=searchProgram(intArr,lengthofarray,searchelement);
		if(index==-1) {
			System.out.println("Element "+searchelement+" is not present in array "+Arrays.toString(intArr));
		}else {
			System.out.println("Element "+searchelement+" is present at index "+index);
		}
	}
	static int searchProgram(int[] intArr,int length,int element) {
		for(int i=0;i<length;i++) {
			if(intArr[i]==element) {
				return i;
			}
		}
		return -1;//-1 means element is not found while searching
	}

}