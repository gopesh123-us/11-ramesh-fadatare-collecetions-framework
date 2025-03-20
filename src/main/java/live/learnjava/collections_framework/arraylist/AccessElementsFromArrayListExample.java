package live.learnjava.collections_framework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
	public static void main(String[] args) {
		 List<String> topCompanies = new ArrayList<>();
		 System.out.println("Is list of top companies empty: " + topCompanies.isEmpty());
		 
		 topCompanies.add("Google");
		 topCompanies.add("Facebook");
		 topCompanies.add("Netflix");
		 topCompanies.add("Amazon");
		 topCompanies.add("Apple");
		 
		 //print size of the list
		 System.out.println(topCompanies.size());
		 
		 //get element at index 2
		 System.out.println("element at index 2: " + topCompanies.get(2));
		 
		 //get last Element
		 System.out.println("last element: "+ topCompanies.getLast());
		 
		 //set element at index 4
		 topCompanies.set(4, "Walmart");
		 System.out.println("Added walmart as last element: " + topCompanies);
	}
}
