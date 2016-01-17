package aProgressBar;

import javax.swing.JProgressBar;

/**
 * A small and simple extension for the standard Swing-Progressbar. <br>
 * 
 * @author Aaron Wagner <br>
 *         created 2016/01
 * 
 */

public class AProgressBar extends JProgressBar {

	private boolean allowRemainingTime;
	private long remainingTime;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AProgressBar() {
	}

	/**
	 * enables calculation of the progresses remaining time
	 * 
	 * @param status
	 *            the status of the calculation
	 */
	public void enableRemainingTime(boolean status) {
		allowRemainingTime = status;
		// TODO calculate time
	}

	/**
	 * increases the progressbar's value by 1 unit
	 */
	public void nextStep() {
		setValue(getValue() + 1);
	}

	/**
	 * resets the progressbar to zero or its minimum
	 * 
	 * @param toZero
	 *            if <code>true</code>, value will be zero. Else, value will be
	 *            the <code>getMinimum()</code> value.
	 */
	public void reset(boolean toZero) {
		setValue(toZero ? 0 : getMinimum());
	}

	// ******************************************** GETTERS ********************************************//

	/**
	 * Returns the current remaining time in milliseconds.
	 * 
	 * @return the remaining time
	 */
	public long getRemainingTime() {
		if (allowRemainingTime)
			return remainingTime;
		return 0;
	}
}
