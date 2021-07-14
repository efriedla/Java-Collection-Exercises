package Collections.ArrayList;

import Sorting.QuickSort;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList Q&A here: https://www.w3resource.com/java-exercises/collection/index.php
 */
public class mainArraylist {
	public static void main(String[] args){
		/**
		 * 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
		 */
		ArrayList<PaintColorPicker> colors = new ArrayList<PaintColorPicker>();
		PaintColorPicker blue = new PaintColorPicker("Blue", 50);
		colors.add(blue);
//		System.out.println(colors);
		/**
		 *
		 * 2. Write a Java program to iterate through all elements in a array list.
		 */
		for (PaintColorPicker i : colors) {
			System.out.println(i);
		}
		colors.add(new PaintColorPicker("Red", 500));
		System.out.println(colors);
		/**
		 * 3. Write a Java program to insert an element into the array list at the first position.
		 */
		colors.set(0, new PaintColorPicker("Green", 30));
		System.out.println(colors);
		/**
		 * 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
		 */
		System.out.println(colors.get(1).getPaintColor());
		/**
		 * 5. Write a Java program to update specific array element by given element.
		 */
		colors.get(1).setPaintColor("Blue");
		System.out.println(colors.get(1).getPaintColor());
		colors.add(new PaintColorPicker("Yellow",0));
		colors.add(new PaintColorPicker("Orange",0));
		 /**
		 * 6. Write a Java program to remove the third element from a array list.
		 */
		System.out.println(colors);
		 System.out.println(colors.remove(2) + " removing");
		System.out.println(colors);
		 /**
		 * 7. Write a Java program to search an element in a array list.
		 *
		 * 8. Write a Java program to sort a given array list.
		 */
		int count = 0;

		 for(PaintColorPicker i: colors){
		 	PaintColorPicker temp;
		 	if(i.getStock() > colors.get(count).getStock()){

		 		System.out.println(i.getStock() + " i");
			    System.out.println(colors.get(count).getStock());
			    temp = colors.get(count);
			    colors.set(count, i);

			    count++;
			    colors.set(count,temp);
		    }
		 }
		System.out.println(colors);

		 /**
		 * 9. Write a Java program to copy one array list into another.
		 *
		 * 10. Write a Java program to shuffle elements in a array list.
		 *
		 * 11. Write a Java program to reverse elements in a array list.
		 *
		 * 12. Write a Java program to extract a portion of a array list.
		 *
		 * 13. Write a Java program to compare two array lists.
		 *
		 * 14. Write a Java program of swap two elements in an array list.
		 *
		 * 15. Write a Java program to join two array lists.
		 *
		 * 16. Write a Java program to clone an array list to another array list.
		 *
		 * 17. Write a Java program to empty an array list.
		 *
		 * 18. Write a Java program to test an array list is empty or not.
		 *
		 * 19. Write a Java program to trim the capacity of an array list the current list size.
		 *
		 * 20. Write a Java program to increase the size of an array list.
		 *
		 * 21. Write a Java program to replace the second element of a ArrayList with the specified element.
		 *
		 * 22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
		 */
	}
}
