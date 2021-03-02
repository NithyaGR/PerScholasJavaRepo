package mod3W1HW1AndHW2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HW2Collections {

	public static void main(String[] args) {
		
		List <String> oldBookList = Arrays.asList("Sri Bhagavad Gita", "Thiruppaavai", "Srimad Bhagavatham");
		List<String> newBookList = new ArrayList<>();
		
		//copy from one list to another list
		newBookList.addAll(oldBookList);
		System.out.println(newBookList);
		newBookList.add("Sri Ramayanam");
		System.out.println(newBookList);
		
		//to extract a portion of a array list
		List<String> subListNewBooks = newBookList.subList(2,3);
		System.out.println(subListNewBooks);
		
		//To swap elements in array list we need to use collections class
		
		Collections.swap(newBookList, 2, 3);
		System.out.println(newBookList);
		
        //Write a Java program to test an array list is empty or not
		System.out.println(newBookList.isEmpty() +" ... Printing the newBookList is empty or not");
		
		
		//Write a Java program to replace the second element of a ArrayList with the specified element.
		
		System.out.println(newBookList.set(3, "Sri Mukuntamala"));
		
		//Write a Java program to trim the capacity of an array list the current list size
		
		ArrayList <Integer> num = new ArrayList <Integer>();
		num.add(5);
		num.add(10);
		num.add(15);
		num.add(20);
		num.trimToSize();
		System.out.println(num);
	
	
	//Write a Java program to test a hash set is empty or not.
	
		Set <String> mySet = new HashSet <String>();
	    System.out.println(mySet.isEmpty() +" ---- Printing the isEmpty method od mySet");
	    
	//Write a Java program to get the number of elements in a hash set   
	    
	    System.out.println(mySet.size() +"-------Printing the size if the set");
	    
	    
	    mySet.add("Krishna");
	    mySet.add("Shakthi");
	    mySet.add("Kumar");
	    mySet.add("Nithya");
	    //Write a Java program to iterate through all elements in a hash list.
	    //first way - sysout(mySet)
	    //second way to print
	  		System.out.println("********printing using for each*********");
	  		for (String names : mySet) {
	  			
	  			System.out.println(names);
	  			
	  		}
	  		//3rd way 		
	  		Iterator<String> it = mySet.iterator();
	  		System.out.println("************printing using iterator*********");
	  		
	  		while(it.hasNext()){
	  			System.out.println(it.next());
	  		}
	  		//Write a Java program to convert a hash set to an array.
	  		Object[] bookArray = mySet.toArray();
	  		System.out.println();
	  		for (Object object : bookArray) {
				System.out.println(object);
			}
	  		
	  		//Write a Java program to compare two sets and retain elements which are same on both sets.
	  		
	  		
	  		Set<String> newNames = new HashSet<>();
	  		newNames.add("Kohila");
	  		newNames.add("Govinda");
	  		newNames.add("Nithya");
	  		
	  		mySet.retainAll(newNames) ;
	  		System.out.println(mySet);
	  		System.out.println(newNames);
	  		
	  		
	  		
	}
}
