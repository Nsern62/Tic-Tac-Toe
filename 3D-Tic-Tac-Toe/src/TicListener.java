import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * Lead Author(s):
 * 
 * @author Nicolas Serna
 * @author
 *         <<add additional lead authors here, with a full first and last name>>
 * 
 *         Other contributors:
 *         <<add additional contributors (mentors, tutors, friends) here, with
 *         contact information>>
 * 
 *         References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented
 *         Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         “Exceptions and Exception Handling.” Essential Programming Books,
 *         www.programming-books.io/essential/java/exceptions
 *         -and-exception-handling-b66cda9cf3d34327b800e6c2911c204f.
 * 
 *         <<add more references here>>
 * 
 *         Version/date: 5/26/2022
 * 
 *         Responsibilities of class:
 *         Be the listener for the buttons.
 */

// Class TicListener is an ActionListener
public class TicListener implements ActionListener
{
	// Initializes variable turn to 0.
	int turn = 0;

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// Creates a new button object from the button source
		JButton button = (JButton) e.getSource();

		// Checks if the turn is 0
		if (turn == 0)
		{
			// Adds to the turn
			turn++;

			// Sets button text to X
			button.setText("X");

			// Sets the button font and size to make is easier to read
			button.setFont(new Font("Arial", Font.PLAIN, 300));

			// Disables the button
			button.setEnabled(false);

		}

		else
		{
			// If the turn is not 0 then subtracts from the turn
			turn--;

			// Sets button text to O
			button.setText("O");

			// Sets the button font and size to make is easier to read
			button.setFont(new Font("Arial", Font.PLAIN, 290));

			// Disables the button
			button.setEnabled(false);
		}
	}
}
