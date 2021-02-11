package mod3W1D2ALShopping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingListAddItem {
	
	public static void reverseList(ArrayList<String> aList) {
		for(int i = (aList.size()- 1); i>=0 ;i--) {
			
		}
		
	}

public static void main(String[] args) {

	List <String> originalShoppingList = Arrays.asList ("cool ranch doritos",
	"kings hawaiian sweet bread", "peanut butter oreos", "fruit loops cereal");
	ArrayList<String> shoppingList = new ArrayList<>();
	shoppingList.addAll(originalShoppingList);    
    System.out.println(shoppingList);
    shoppingList.add("Hendricks gin");
    System.out.println(shoppingList);


// Reverse Array

	/*
	 * String [] yoda = {"try", "no", "is", "there", "not", "do", "or", "do"}; yoda
	 * = yoda.reverse(); System.out.println(yoda);
	 * 
	 * 
	 * String [] waitList = { "Chance the Rapper", "Khalid", "Tay-Tay",
	 * "Barry Manilow", "Piko Taro" }; //var waitListPrint =[]; int len =
	 * waitList.length; String NowServing = ""; for(int i=0;i<len; i++){ NowServing
	 * = waitList.shift(); System.out.println("We are serving now : "+NowServing);
	 * //waitListPrint = waitList.splice(0);
	 * System.out.println("People in the line are: "+waitList);
	 * 
	 * }
	 * 
	 * String [] shoe = {"just", "do", "it"}; System.out.println(shoe.toString());
	 * System.out.println(shoe.join(' '));
	 */


	}

}
