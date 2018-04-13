/**
 * 
 * @author Mahdokht Afravi
 * @created Mar 23 F
 * 
 */
package pa;

public class PA {
	private GUI view;
	private Backend model;
	
	public PA() {
		view = new GUI();
		model = new Backend();
		start();
		run();
	}

	/**
	 * GUI displays the initial instructions.
	 */
	private void start() {
		view.writeInstructions();
	}
	
	/**
	 * Communicate with Backend to display results.
	 */
	private void run() {
		boolean moreTests = true;
		do {
			view.promptBehavior();
			String test = view.getExpression();
			if ( test.equalsIgnoreCase("-1") ) {
				moreTests = false;
				view.end();
			} else {
				model.setExpression(test);
				//TODO
			}
		} while ( moreTests );
	}
}