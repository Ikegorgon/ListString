package listString.view;

import javax.swing.JOptionPane;

/**
 * Simple GUI class using OptionPane
 * @author ilam9372
 * @version 1.0 03.10.2017
 */
public class ListStringDisplay {
	/**
	 * Displays a pop up showing the supplied String to the user.
	 * @param textToDisplay The text to be displayed.
	 */
	public void displayText (String textToDisplay) {
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	/**
	 * Uses pop up display a question to the user and stores their response
	 * @param fromQuestion The question being asked
	 * @return The users response to the question
	 */
	public String getResponse(String fromQuestion) {
		String answer = "";
		answer += JOptionPane.showInputDialog(null, fromQuestion);
		return answer;
	}
	
}
