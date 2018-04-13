/**
 * 
 * @author Mahdokht Afravi
 * @created Mar 23 F
 * 
 * The GUI class is the View of the MVC design.
 * This class handles IO to be used for the Backend (model).
 * This is the only class that uses the IO functions for both
 * 	writing/reading nicely to console.
 */
package pa;

import utils.*;

public class GUI {
	private IO io;
	
	public GUI() {
		io = new IO();	
	}
	
	public void writeInstructions() {
		io.writeLn("All English letters can be used as variables.");
		io.writeLn("Predicate names start with a capital letter.");
		io.writeLn("Parentheses must be used in syntax.");
		io.writeLn("");
		io.writeLn("Representations:");
		io.writeLn("  the existential quantifier: 'TE'");
		io.writeLn("  the universal quantifier as: 'FA'");
		io.writeLn("  complement (not) of a formula, a: '(!a)'");
		io.writeLn("  conjunction (^) of formulae, a, b: '(a&b)'");
		io.writeLn("  disjunction (v) of formulae, a, b: '(a|b)'");
		io.writeLn("  implication (->) of formulae, a, b: '(a->b)'");
		io.writeLn("");
		io.writeLn("Skolem representations:");
		io.writeLn("  Skolem constant, a: 'a_3'");
		io.writeLn("  Skolem function of given n: 'f_n(...)'");
	}
	
	public String promptBehavior() {
		return "";
	}
	
	public String getExpression() {
		io.write("\nEnter a test string (or '-1' to quit): ");
		return io.getStr();
	}
	
	public void end() {
		io.writeLn("Process terminated.");
	}
}