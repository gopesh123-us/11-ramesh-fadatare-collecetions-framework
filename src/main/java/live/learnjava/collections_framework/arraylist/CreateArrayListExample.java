package live.learnjava.collections_framework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>(); //BEST PRACTICE
		animals.add("Elephant"); //index 0
		animals.add("Monkay");
		animals.add("Lion");
		animals.add("Donkey"); //index 3
		animals.add("Dog");
		animals.add("Tiger");
		animals.add("Cat"); //6
		animals.add(null);
		animals.add(null);
		animals.add("Tiger");
		System.out.println(""" 
				animals %s, size %s
				""".formatted(animals, animals.size()));
		animals.add(7, "Deer"); //list grow
		System.out.println(""" 
				animals %s, size %s
				""".formatted(animals, animals.size()));
		animals.add(0, "Croc");
		System.out.println(""" 
				animals %s, size %s
				""".formatted(animals, animals.size()));
	}
}
