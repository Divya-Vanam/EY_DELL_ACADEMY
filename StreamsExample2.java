package EY2408;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample2 {

	public static void main(String[] args) {
		List<String> shoppingList=new ArrayList<>();
		shoppingList.add("coffee");
		shoppingList.add("bread");
		shoppingList.add("pineapple");
		shoppingList.add("milk");
		shoppingList.add("pasta");
		
		Stream<String> shoppingListStream=shoppingList.stream();//other conditions should be mentioned in filter or map
shoppingListStream.sorted().map(item->item.toUpperCase()).filter(item->item.startsWith("P")).forEach(item->System.out.println(item));

//now this should throw exception--illegal state exception
//shoppingListStream.forEach(item->System.out.println(item));
	}

}
