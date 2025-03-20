package live.learnjava.collections_framework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SearchingElementsArrayListExample {
	public static void main(String[] args) {
		//APIs
		//check if an ArrayList contains a given element | contains()
		//find the index of the first occurrence of the element in an ArrayList | indexOf()
		//find the index of last occurrence of an element in an ArrayList | lastIndexOf()
		
		List<String> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("JavaScript");
		programmingLanguages.add("TypeScript");
		programmingLanguages.add("C");
		programmingLanguages.add("Ruby");
		programmingLanguages.add("Rust");
		programmingLanguages.add("JavaScript");
		System.out.println("Ruby: "+programmingLanguages.contains("Ruby"));
		System.out.println("Kotlin: "+programmingLanguages.contains("Kotlin"));
		System.out.println("index of first occurence of JavaScript: " + programmingLanguages.indexOf("JavaScript"));
		System.out.println("index of last occurence of JavaScript: " + programmingLanguages.lastIndexOf("JavaScript"));
	}
}
