import java.io.IOException;
import javax.swing.JFrame;
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
 *         Handle the game logic
 */

public class TacLogic
{
	public TacLogic(TicGUI gui) throws IOException
	{
		// Creates a new frame object and sets it to the gui frame
		JFrame frame = gui.getFrame();

		// Does the following code
		do
		{
			// Searches the first row
			for (int j = 0; j < gui.getIndex().length; j++)
			{
				// Checks if all buttons on the first row are the same and if
				// they're X's or O's
				if (gui.getIndex()[0][0].getText() == gui.getIndex()[0][1]
						.getText()
						&& gui.getIndex()[0][0]
								.getText() == gui.getIndex()[0][2].getText()
						&& (gui.getIndex()[0][0].getText() == "X"
								|| gui.getIndex()[0][0].getText() == "O"))
				{
					// Show message of the winner
					JOptionPane.showMessageDialog(null,
							gui.getIndex()[0][0].getText() + "'s win");

					// Records the game
					gui.write();

					// Exits the game when the win message is closed
					System.exit(0);
				}
			}

			// Searches the first column
			for (int i = 0; i < gui.getIndex()[0].length; i++)
			{
				// Checks if all buttons on the first column are the same and if
				// they are X's or O's
				if (gui.getIndex()[0][0].getText() == gui.getIndex()[1][0]
						.getText()
						&& gui.getIndex()[0][0]
								.getText() == gui.getIndex()[2][0].getText()
						&& (gui.getIndex()[0][0].getText() == "X"
								|| gui.getIndex()[0][0].getText() == "O"))
				{
					// Show message of the winner
					JOptionPane.showMessageDialog(null,
							gui.getIndex()[0][0].getText() + "'s win");

					// Records the game
					gui.write();

					// Exits the game when the win message is closed
					System.exit(0);
				}
			}

			// Searches the second column
			for (int a = 0; a < gui.getIndex()[1].length; a++)
			{
				// Checks if all buttons on the second column are the same and
				// if they are X's or O's
				if (gui.getIndex()[1][0].getText() == gui.getIndex()[1][1]
						.getText()
						&& gui.getIndex()[1][0]
								.getText() == gui.getIndex()[1][2].getText()
						&& (gui.getIndex()[1][0].getText() == "X"
								|| gui.getIndex()[1][0].getText() == "O"))
				{
					// Show message of the winner
					JOptionPane.showMessageDialog(null,
							gui.getIndex()[1][0].getText() + "'s win");

					// Records the game
					gui.write();

					// Exits the game when the win message is closed
					System.exit(0);
				}
			}

			// Checks the last column
			for (int b = 0; b < gui.getIndex()[2].length; b++)
			{
				// Checks if all buttons in the last column are the same and if
				// they are X's or O's
				if (gui.getIndex()[2][0].getText() == gui.getIndex()[2][1]
						.getText()
						&& gui.getIndex()[2][0]
								.getText() == gui.getIndex()[2][2].getText()
						&& (gui.getIndex()[2][0].getText() == "X"
								|| gui.getIndex()[2][0].getText() == "O"))
				{
					// Show message of the winner
					JOptionPane.showMessageDialog(null,
							gui.getIndex()[2][0].getText() + "'s win");

					// Records the game
					gui.write();

					// Exits the game when the win message is closed
					System.exit(0);
				}
			}

			// Checks if all buttons in the 2nd row are the same and if they are
			// X's or O's
			if (gui.getIndex()[0][1].getText() == gui.getIndex()[1][1].getText()
					&& gui.getIndex()[0][1].getText() == gui.getIndex()[2][1]
							.getText()
					&& (gui.getIndex()[0][1].getText() == "X"
							|| gui.getIndex()[0][1].getText() == "O"))
			{
				// Show message of the winner
				JOptionPane.showMessageDialog(null,
						gui.getIndex()[0][1].getText() + "'s win");

				// Records the game
				gui.write();

				// Exits the game when the win message is closed
				System.exit(0);
			}

			// Checks if all buttons in the last row are the same and if they
			// are X's or O's
			if (gui.getIndex()[0][2].getText() == gui.getIndex()[1][2].getText()
					&& gui.getIndex()[0][2].getText() == gui.getIndex()[2][2]
							.getText()
					&& (gui.getIndex()[0][2].getText() == "X"
							|| gui.getIndex()[0][2].getText() == "O"))
			{
				// Show message of the winner
				JOptionPane.showMessageDialog(null,
						gui.getIndex()[0][2].getText() + "'s win");

				// Records the game
				gui.write();

				// Exits the game when the win message is closed
				System.exit(0);
			}

			// Checks if all buttons in the left to right diagonal are the same
			// and if they are X's or O's
			if (gui.getIndex()[0][0].getText() == gui.getIndex()[1][1].getText()
					&& gui.getIndex()[0][0].getText() == gui.getIndex()[2][2]
							.getText()
					&& (gui.getIndex()[0][0].getText() == "X"
							|| gui.getIndex()[0][0].getText() == "O"))
			{
				// Show message of the winner
				JOptionPane.showMessageDialog(null,
						gui.getIndex()[0][0].getText() + "'s win");

				// Records the game
				gui.write();

				// Exits the game when the win message is closed
				System.exit(0);
			}

			// Checks if all buttons in the right to left diagonal are the same
			// and if they are X's or O's
			if (gui.getIndex()[2][0].getText() == gui.getIndex()[1][1].getText()
					&& gui.getIndex()[2][0].getText() == gui.getIndex()[0][2]
							.getText()
					&& (gui.getIndex()[2][0].getText() == "X"
							|| gui.getIndex()[2][0].getText() == "O"))
			{
				// Show message of the winner
				JOptionPane.showMessageDialog(null,
						gui.getIndex()[2][0].getText() + "'s win");

				// Records the game
				gui.write();

				// Exits the game when the win message is closed
				System.exit(0);
			}

			// Runs the above code until the frame is disabled
		} while (frame.isEnabled() == true);

	}

}
