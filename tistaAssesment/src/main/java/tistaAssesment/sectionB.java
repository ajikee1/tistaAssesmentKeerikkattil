package tistaAssesment;

import java.util.ArrayList;
import java.util.List;

public class sectionB {
	
	public String removeHeadAndTail(String input) {

		int stringLength = input.length();

		StringBuilder str = new StringBuilder();

		if (stringLength > 2) {

			for (int i = 1; i < stringLength - 1; i++) {
				str.append(input.charAt(i));
			}

		} else {
			System.out.println("Input string not long enough. Min length atleast 3");
		}
		return str.toString();
	}
	
	
	public List<Integer> positveIntegers(List<Integer> inputList)
	{
		List<Integer> outputList = new ArrayList<Integer>();
		
		for(int input: inputList)
		{
			if(input >= 0)
			{
				outputList.add(input);
			}
		}
		return outputList;
		
	}
	

}
