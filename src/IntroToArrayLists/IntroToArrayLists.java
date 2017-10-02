package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList (); 
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 1; i < list.size(); i+=2) {
			System.out.println(list.get(i));
		}
		//6. Print all the Strings in reverse order.
		for (int i = 4; i > -1; i--) {
			System.out.println(list.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("e")) {
				System.out.println(list.get(i));
			}
		}
	}
}
