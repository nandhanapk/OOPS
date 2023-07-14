package pkg;
import java.util.ArrayDeque;
import java.util.Deque;
public class Program {


	public static void main(String args[])
	{
		Deque<Integer>dq=new ArrayDeque<>();
		dq.add(2);
		dq.addFirst(3);
		dq.add(5);
		dq.addLast(1);
		System.out.println(dq);
		dq.removeFirst();
		dq.removeLast();
		System.out.println(dq);
	}
}
