package EY2208;

class MyGeneralizedClass<T>{
	T obj;
	void add(T obj) {
		this.obj=obj;
	}
	T get() {
		return obj;
	}
}
public class UseOfGenerics {

	public static void main(String[] args) {
		MyGeneralizedClass<Integer> intType=new MyGeneralizedClass<>();
		intType.add(21);
		intType.add(31);
		//intType.add("ABC");//compile time error will come if i try to add any other data apart from integer
		System.out.println(intType.get());
		
		MyGeneralizedClass<String> strType=new MyGeneralizedClass<>();
		strType.add("ABC");
		strType.add("ZXY");
		//strType.add(31);//compile time error will come if i try to add any other data apart from string
		System.out.println(strType.get());
		
		MyGeneralizedClass<Boolean> bolType=new MyGeneralizedClass<>();
		bolType.add(true);
		//strType.add(31);//compile time error will come if i try to add any other data apart from boolean
		System.out.println(bolType.get());
		
		}

	}


