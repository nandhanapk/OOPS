package pkg;
import java.util.*;
public class priority_q {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	PriorityQueue<Integer>pq=new PriorityQueue<>();
	pq.add(10);
	pq.add(3);
	pq.add(12);
	pq.add(15);
	System.out.println(pq);
	pq.peek();
	System.out.println("Peek:"+pq);
	pq.poll();
	System.out.println("Poll:"+pq);
}
}
