package pkg;
import java.util.*;
public class Operations {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
ArrayList<String>st = new ArrayList<>();
System.out.println("Addition of String");
st.add("Hello");
st.add("John");
for(String element:st)
{
	System.out.print(element+"\t");	
}
System.out.println();
System.out.println("No of Words:"+st.size());
st.remove(1);
System.out.println("After Removal");
for(String element:st)
{
	System.out.println(element);
}
System.out.println("Check for elements:");
System.out.println("Enter a String");
String str= sc.next();
if(st.contains(str))


System.out.println("True");
else


	System.out.println("False");
}
}
