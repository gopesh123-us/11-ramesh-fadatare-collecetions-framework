package live.learnjava.collections_framework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {
	public static void main(String[] args) {
		// remove from given index
		// remove all
		// remove an object
		// conditional remove - all elements that matches a give predicate
		// clear Arraylist

		List<String> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("JavaScript");
		programmingLanguages.add("TypeScript");
		programmingLanguages.add("C");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("Rust");
		System.out.println("languages: " + programmingLanguages);
		programmingLanguages.remove(1);
		System.out.println("remove at index 1");
		System.out.println("languages: " + programmingLanguages);
		System.out.println("removing Ruby..");
		programmingLanguages.remove("Ruby");
		System.out.println("languages: " + programmingLanguages);
		programmingLanguages.removeIf((e)->e.startsWith("R"));
		System.out.println("languages: " + programmingLanguages);
		System.out.println("now...removing all");
		List<String> scriptingLanguages = new ArrayList<>();
		scriptingLanguages.add("Python");
		scriptingLanguages.add("Ruby");
		scriptingLanguages.add("JavaScript");
		
		programmingLanguages.removeAll(scriptingLanguages);
		System.out.println("languages: " + programmingLanguages);
		System.out.println("adding..back");
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("C");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("Rust");
		System.out.println("languages: " + programmingLanguages);
		System.out.println("Clearing!!!");
		programmingLanguages.clear();
		System.out.println("languages: " + programmingLanguages);
	}
}
