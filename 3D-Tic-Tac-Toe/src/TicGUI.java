import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

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
 *         Create the gui for the game and handle the recording of moves.
 */

public class TicGUI extends JFrame
{
	// TicGui has buttons
	JButton[][] buttons = new JButton[3][3];

	// TicGui has a panel
	JPanel floor1 = new JPanel();

	// TicGui has a frame
	JFrame mainFrame = new JFrame("Tic-Tac-Toe");

	//TicGui has a file
	File moveFile = new File("MovesFile");

	public TicGUI(TicListener listener)
	{
		// Sets the layout of the panel to a 3x3 grid
		floor1.setLayout(new GridLayout(3, 3));

		// Checks the rows of the button array
		for (int i = 0; i < 3; i++)
		{
			// Checks the columns of the button array
			for (int j = 0; j < 3; j++)
			{
				// Creates a new button for every index
				buttons[i][j] = new JButton();

				// Adds the action listener
				buttons[i][j].addActionListener(listener);

				// Adds the new buttons to the panel
				floor1.add(buttons[i][j]);
			}
		}

		// Adds the panel to the frame in the center
		mainFrame.add(floor1, BorderLayout.CENTER);

		// Sets the size of the frame
		mainFrame.setSize(800, 800);

		// Makes the frame visible
		mainFrame.setVisible(true);

		// Makes the frame close when the x button is clicked on the top right
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Makes the window to fit the components
		pack();
	}

	public JButton[][] getIndex()
	{
		// Returns the button index
		return buttons;
	}

	public JFrame getFrame()
	{
		// Returns the frame
		return mainFrame;
	}

	// Creates method to write to a file the moves that took place and will
	// throw an IOException if there is no file to write to
	public void write() throws IOException
	{
		// Creates a new file writer to write to the moveFile
		FileWriter writer = new FileWriter(moveFile, true);

		// Writes the X's or O's in each index
		writer.write(buttons[0][0].getText() + " " + "At index [0][0] "
				+ buttons[0][1].getText() + " " + "At index [0][1] "
				+ buttons[0][2].getText() + " " + "At index [0][2] "
				+ buttons[1][0].getText() + " " + "At index [1][0] "
				+ buttons[1][1].getText() + " " + "At index [1][1] "
				+ buttons[1][2].getText() + " " + "At index [1][2] "
				+ buttons[2][0].getText() + " " + "At index [2][0] "
				+ buttons[2][1].getText() + " " + "At index [2][1] "
				+ buttons[2][2].getText() + "At index [2][2] ");

		// Closes the writer
		writer.close();
	}

	public static void main(String[] args) throws IOException
	{
		// Creates a new listener
		TicListener listener = new TicListener();

		// Creates a new gui
		TicGUI gui = new TicGUI(listener);

		// Creates new logic for the game
		TacLogic logic = new TacLogic(gui);

	}

}
