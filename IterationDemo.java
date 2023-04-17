// Java program to demonstrate iteration over
// Map using keySet() and values() methods

import java.util.Map;
import java.util.HashMap;

class IterationDemo
{
	public static void main(String[] arg)
	{
		Map<String,Integer> gfg = new HashMap<>();
	
		// enter name/url pair
		gfg.put("GFG", 1);
		gfg.put("Practice", 2);
		gfg.put("Code", 3);
		gfg.put("Quiz", 4);
		
		for (Map.Entry<String,Integer> entry : gfg.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
	}
}

 
