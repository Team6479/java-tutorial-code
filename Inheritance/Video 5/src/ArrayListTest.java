
import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList<String> myStrings = new ArrayList<String>();
		
		myStrings.add("String one");
		myStrings.add("String two");
		
		System.out.println("String at position 0: " + myStrings.get(0));
		System.out.println("String at position 1: " + myStrings.get(1));
		
		System.out.println();
		
		myStrings.set(0, "Modified string one");
		System.out.println("String at position 0: " + myStrings.get(0));
		
		System.out.println("The position of \"String two\" is " + myStrings.indexOf("String two"));
		
		System.out.println("The size of the ArrayList is " + myStrings.size());
		
		System.out.println();
		
		myStrings.remove(0);
		
		System.out.println("New string at position 0: " + myStrings.get(0));
		
		
	}
	
}
