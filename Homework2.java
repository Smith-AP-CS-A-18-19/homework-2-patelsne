// patelsne
/*
 * First and Last Names
 */

import java.awt.Rectangle;
import java.lang.String;

public class Homework2 {

	/* Write the constructor for Homework2.
	 * It takes in one parameter: a String
	 * Save the string as a private instance variable
	 */
	 private String phrase;
	 public Homework2(String parameter){
		 phrase = parameter;
	 }

	/* Write the method upperase
	 * It does not take in any parameters
	 * It returns a String
	 * Use String methods to turn the instance variable String into all
	 * uppercase letters and return the result
	 * Hint: Search the String class for 'uppercase'
	 */
	 public String uppercase(){
		 phrase = phrase.toUpperCase();
		 return phrase;
	 }

	/* Write the method strip
	 * It takes in one paramter: a String
	 * It returns a String
	 * Use String methods to remove punctuation from the parameter String
	 * It should remove spaces, commas, periods, and exclamation points.
	 * Hint: Search the String class for 'replace'
	 */

	 public String strip(String expression){
		  expression = expression.replace(" ", "");
		  expression = expression.replace(",", "");
		  expression = expression.replace(".", "");
		  expression = expression.replace("!","");
			return expression;
	 }

	/* Fix the errors in the method problem4
	 */
	public Rectangle problems() {
		Rectangle r1 = new Rectangle(5, 10, 15, 20);
		double width = r1.getWidth();
		Rectangle r2 = new Rectangle(1, 1, 1, 1);
		r2.translate(15, 25);
		Rectangle r3 = new Rectangle(2,3,4,5);
		r3.translate(20,40000);
		return r3;
	}


	/* Use Rectangle methods to calculate and return the perimeter of the
	 * parameter Rectangle
	 */
	public double getPerimeter(Rectangle rect) {
		double width = rect.getWidth();
		double height = rect.getHeight();
		double perimeter = 2*(width + height);
		return perimeter;
	}

}
