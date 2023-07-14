//Arithmeticoperation.java
package Arithmetic;
public interface Arithmeticoperation {
	double calculate(double num1, double num2);
}
//Addition.java
package Arithmetic;
public class Addition implements Arithmeticoperation {
	 public double calculate(double num1, double num2) {
		 return num1 + num2;
	}
}
//Subtraction.java
package Arithmetic;
public class Subtraction implements Arithmeticoperation {
	 public double calculate(double num1, double num2) {
	 	return num1 - num2;
	 }
}
//Multiplication.java
package Arithmetic;
public class Multiplication implements Arithmeticoperation {
	 public double calculate(double num1, double num2) {
		 return num1 * num2;
	 }
}
//Division.java
package Arithmetic;
public class Division implements Arithmeticoperation {
	 public double calculate(double num1, double num2) {
	 	if (num2 == 0) {
	 		throw new ArithmeticException("Cannot divide by zero");
	 	}
	 	return num1 / num2;
	 }
}
//prgrm2.java
package co4;
import Arithmetic.*;
public class prgrm2 {
	public static void main(String[] args) {
		 double num1 = 10;
		 double num2 = 5.5;
		 Arithmeticoperation addition = new Addition();
		 double sum = addition.calculate(num1, num2);
		 System.out.println("Sum: " + sum);
		 Arithmeticoperation subtraction = new Subtraction();
		 double difference = subtraction.calculate(num1, num2);
		 System.out.println("Difference: " + difference);
		 Arithmeticoperation multiplication = new Multiplication();
		 double product = multiplication.calculate(num1, num2);
		 System.out.println("Product: " + product);
		 Arithmeticoperation division = new Division();
		 double quotient = division.calculate(num1, num2);
		 System.out.println("Quotient: " + quotient);
	}
}


