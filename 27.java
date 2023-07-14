package pkg;
import java.util.*;
public class removestack {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Stack<Integer>stk=new Stack<>();
	stk.push(1);
	stk.push(3);
	stk.push(4);
	stk.push(5);
	System.out.println(stk);
	int x;
	System.out.println("Enter the index no:");
	x=sc.nextInt();
	stk.remove(x);
	System.out.println(stk);
	stk.pop();
	
	
}
}


