package EY1808;
/*
 * in heap we make sure all the memory space is completely occupied(complete binary tree)
 * a node can have atmost 2 child nodes
 * heap space issue has come-not a complete binary
 */
import java.util.Scanner;

class Heap{
	int heapSize;
	void build_max_heap(int[] a) {
		heapSize=a.length;
		for(int i=(heapSize/2);i>=0;i--)
			max_heapify(a,i);
		}

void max_heapify(int[] a,int i) {
	int l=2*i+1;
	int r=2*i+2;
	
	int largest=i;
	if(1<heapSize && a[l]>a[largest]) {
		largest=l;
	}
	if(1<heapSize && a[r]>a[largest]) {
		largest=r;
	}
	if (largest!=i) {
		int t=a[i];
		a[i]=a[largest];
		a[largest]=t;
		max_heapify(a,largest);
				
	}
	
}
	int extract_max(int[] a)
    {
        if(heapSize <0)
        {
            System.out.println("UnderFlow");
        }
        int max = a[0];
        a[0] = a[heapSize -1];
        heapSize--;
        max_heapify(a, 0);
        return max;
    }

void increase_key(int[] a,int i,int key) {
	if(key<a[i]) {
		System.out.println("Error");
		a[i]=key;
		while(i>=0 && a[(i-1)/2]<a[i]) {
			int t=a[(i-1)/2];
			a[(i-1)/2]=a[i];
			a[i]=t;
			i=(i-1)/2;
		}
	}
}
void print_heap(int[] a) {
	for (int i=0;i<heapSize;i++) {
		System.out.println(a[i]+" ");
	}
}
}
public class HeapSpaceDataStructure {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr =new int[n];
		
		System.out.println("ENTER ELEMENTS OF ARRAY");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		Heap obj=new Heap ();
		obj.build_max_heap(arr);
		obj.print_heap(arr);
		System.out.println("MAXIMUM VALUE IS "+obj.extract_max(arr));
		obj.print_heap(arr);
		System.out.println("MINIMUM VALUE IS "+obj.extract_max(arr));
		obj.print_heap(arr);

	}
}
