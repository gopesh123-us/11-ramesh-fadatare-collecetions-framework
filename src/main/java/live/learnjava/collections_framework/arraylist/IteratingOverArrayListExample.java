package live.learnjava.collections_framework.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingOverArrayListExample {
	public static void main(String[] args) {
		// using simple for loop
		// using for-each loop
		// using iterator()
		// iterator() and Java8 forEachRemaining() method
		// java 8 forEach and lambda expression.

		List<String> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("JavaScript");
		programmingLanguages.add("TypeScript");
		programmingLanguages.add("C");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("Rust");

		for (int i = 0; i < programmingLanguages.size(); i++) {
			System.out.println(programmingLanguages.get(i));
		}

		for (String string : programmingLanguages) {
			System.out.println("language:: " + string);
		}

		Iterator<String> iterator = programmingLanguages.iterator();
		while (iterator.hasNext()) {
			System.out.println("Iterator: " + iterator.next());
		}
		
		System.out.println("Printing --> ForEachRemaining");		
		programmingLanguages.iterator().forEachRemaining((e)->System.out.println("forEachRemaining: "+e));

		programmingLanguages.stream().forEach(System.out::println);
		programmingLanguages.stream().forEach((e) -> System.out.println("lambda: " + e));
	}
}
