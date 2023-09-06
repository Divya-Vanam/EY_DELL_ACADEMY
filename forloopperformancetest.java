package EY_140823;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class forloopperformancetest {
	static List<Integer> list= new ArrayList<>();//ctrl+shift+m+o to import packages-- collection
	static long startTime, endTime;
	static {
		for(int i=0;i< 100_000_00;i++) {
			list.add(i);//prepare the data
		}
		
	}
	
	public static void main(String[] args) {
		
		startTime =Calendar.getInstance().getTimeInMillis();
		for(Integer i :list) {};
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("Advanced For Loop took = "+(endTime - startTime)+ " ms");
		
		startTime =Calendar.getInstance().getTimeInMillis();
		for(int i=0;i<list.size();i++) {}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("Basic For Loop-size took = "+(endTime - startTime)+ " ms");
		
		startTime =Calendar.getInstance().getTimeInMillis();
		int size=list.size();
		for(int i=0;i<=size;i++) {}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("Basic For Loop-size prior took = "+(endTime - startTime)+ " ms");
		
		startTime =Calendar.getInstance().getTimeInMillis();
		for(int i=size;i>0;i--) {}
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("Backward For Loop took = "+(endTime - startTime)+ " ms");
		
	}

}
