package tistaAssesment;

/*
 * @Author:: Ajith V Keerikkattil
 */

import java.util.ArrayList;
import java.util.List;

public class driver {

	public static void main(String[] args) {
		
		sectionB secB = new sectionB();
		
		/* Removing the first and last char */
		String output = secB.removeHeadAndTail("Constantinople");
		System.out.println("String with head and tail removed: " + output);
		
		/* Removing negative integers from an array */
		List<Integer> input = new ArrayList<Integer>();
		input.add(0);
		input.add(4);
		input.add(-2);
		input.add(5);
		input.add(-1);
		input.add(-10);
		input.add(10);
		
		List<Integer> output1 = secB.positveIntegers(input);
		System.out.print("List without negative numbers: ");
		for(int i: output1)
		{
			System.out.print(i + " ");
		}
	}

}
