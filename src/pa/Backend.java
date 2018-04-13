/**
 * 
 * @author Mahdokht Afravi
 * @created Mar 23 F
 * 
 */
package pa;

public class Backend {
	private String expr;
	private String prenexed;
	private String skolemized;
	private String cnf;
	private String dnf;
	
	public Backend() { }
	
	public String doAll() {
		toPrenex();
		skolemize();
		return expr;
	}
	
	/* ****************** Operations for Transformations ****************** */
	/**
	 * Transform the expr into prenex form.
	 */
	public String toPrenex() {
		//TODO
		return prenexed;
	}
	
	/**
	 * Skolemize the prenex form.
	 */
	public String skolemize() {
		//TODO
		return skolemized;
	}
	
	/**
	 * Transforms the skolemized form into Conjunctive Normal Form (CNF).
	 */
	public String toCNF() {
		//TODO
		return cnf;
	}
	
	/**
	 * Transforms the skolemized form into Disjunctive Normal Form (DNF).
	 */
	public String toDNF() {
		//TODO
		return dnf;
	}
	
	/* ****************** Operations for Accessing/Mutators on this Instance ****************** */
	/**
	 * Save the test expression.
	 */
	public void setExpression(String s) {
		expr = s;
	}
	
	/**
	 * Get the test expression.
	 */
	public String getExpression() {
		return expr;
	}
	
	/**
	 * Get the prenex form.
	 */
	public String getPrenex() {
		return prenexed;
	}
	
	/**
	 * Get the Skolemized prenex expression.
	 */
	public String getSkolemized() {
		return skolemized;
	}
	
	/**
	 * Get the Conjunctive Normal Form (CNF).
	 */
	public String getCNF() {
		return cnf;
	}
	
	/**
	 * Get the Disjunctive Normal Form (DNF).
	 */
	public String getDNF() {
		return dnf;
	}
}