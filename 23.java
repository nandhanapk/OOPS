package co4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Stack<T> {
    private List<T> stack;
    public Stack() {
        stack = new ArrayList<>();
    }
    public void push(T element) {
    	stack.add(element);
            System.out.println("Pushed element: " + element);
    }
    public T pop() {
    	if (isEmpty()) {
            	System.out.println("Stack is empty. Cannot pop.");
            	return null;
            }
            int lastIndex = stack.size() - 1;
            T element = stack.get(lastIndex);
            System.out.println("Popped element: " + element);
            stack.remove(lastIndex);
            return element;
    }
    public boolean isEmpty() {
    	return stack.isEmpty();
    }
    public void displayStack() {
    	System.out.println("Elements in the stack:");
            for (int i = stack.size() - 1; i >= 0; i--) {
            	System.out.println(stack.get(i));
            }
    }
}
public class Prgrm8 {
public static void main(String[] args) {
Stack<Integer> stack = new Stack<>();
		Scanner scanner = new Scanner(System.in);
while (true) {
		            System.out.println("Enter choice 1.push 2.pop 3.display 4.exit:");
		            int choice = scanner.nextInt();
switch (choice) {
		                case 1:
		                    System.out.print("Enter the element to push: ");
		                    int element = scanner.nextInt();
		                    stack.push(element);
		                    break;
		                case 2:
		                    stack.pop();
		                    break;
		                case 3:
		                    stack.displayStack();
		                    break;
		                case 4:
		                    System.out.println("Exiting...");
		                    scanner.close();
		                    System.exit(0);
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		}
	}
}


