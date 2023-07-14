package co4;
import java.util.Scanner;
class NegativeNumberException extends Exception {
public NegativeNumberException(String message) {
super(message);
}
}
public class Prgrm4 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 try {
		 	System.out.print("Enter the no.of elements: ");
		 	int N = sc.nextInt();
		 	int sum = 0;
		 	int count = 0;
		 	for (int i = 1; i <= N; i++) {
				System.out.print("Enter a positive integer: ");
				int num = sc.nextInt();
		 		if (num < 0) {
		 			throw new NegativeNumberException("Negative numbers are not allowed.");
		 		}
		 		sum += num;
		 		count++;
		 	}
		 	double average = (double) sum / count;
		 	System.out.println("Average of the positive integers: " + average);
		 } catch (NegativeNumberException ex) {
		 	System.out.println("Error: " + ex.getMessage());
		 } catch (Exception ex) {
		 	System.out.println("Error: Invalid input.");
		 } finally {
		 sc.close();
		 }
	}
}
