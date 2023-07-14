package pkg;
import java.util.*;
public class compare {
public static void main(String args[])
{
	HashSet<String>hs1=new HashSet<String>();
	hs1.add("Sunday");
	hs1.add("Monday");
	hs1.add("Tuesday");
	
	HashSet<String>hs2=new HashSet<String>();
	hs2.add("Tuesday");
	hs2.add("Wednesday");
	hs2.add("Thursday");
	hs2.add("Friday");
	hs2.add("Saturday");
	for (String element :hs1)
	{
		if(hs2.contains(element))
		{
			System.out.println("Element present");
		}
			else
			{
				System.out.println("Element not present");
			}
		}
		
	}
}
