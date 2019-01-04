package BaseOfSelenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class ListClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> number = new ArrayList<Integer>();

		number.add(10);
		number.add(5);
		number.add(12);
		number.add(01);
		
		number.add(5);
		number.add(12);
		number.add(01);
		
//		number.add(2, "X");
//		number.add(2, "Y");
//		number.remove(2);
		ListIterator iterator = number.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			//number.add(12);
		}
		Boolean isTrue = true;
		isTrue = number.contains(5);
	
		if(isTrue)
			
		System.out.println("that number is in the list");
		else System.out.println("That number is not in the list");
		
		Set<Integer>set_number = new HashSet<Integer>(number);
		System.out.println("Set number: " +set_number);
		System.out.println("Size with dublicate elements: "+number.size());
		System.out.println("Size without dublicate elements: "+set_number.size());


		

	}

}
