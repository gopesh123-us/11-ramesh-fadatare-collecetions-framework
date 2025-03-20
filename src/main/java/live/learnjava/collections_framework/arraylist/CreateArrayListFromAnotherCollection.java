package live.learnjava.collections_framework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromAnotherCollection {
	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<>();
		mylist.add(1);
		mylist.add(3);
		mylist.add(5);
		mylist.add(8);
		List<Integer> newList = new ArrayList<>();
		newList.add(10);
		newList.add(11);
		newList.add(19);
		newList.add(21);
		
		List<Integer> myCombinedList = new ArrayList<>();
		myCombinedList.addAll(mylist);
		myCombinedList.addAll(newList);
	
		System.out.println(myCombinedList);
		
		for(Integer num: myCombinedList){
			System.out.println(num);
		}
		myCombinedList.stream().forEach(System.out::println);
		
	}
}
