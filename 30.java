package pkg;
import java.util.*;
public class set {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	LinkedHashSet <Integer>hs=new LinkedHashSet<>();
	hs.add(2);
	hs.add(4);
	hs.add(6);
	hs.add(8);
	hs.add(10);
	System.out.println("Set="+hs);
	hs.remove(2);
	System.out.println("Set="+hs);	
}
}
