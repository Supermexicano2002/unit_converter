
import javax.swing.*;


public class GUI {
	public static void main(String[] args){

		// New object
		JFrame frame = new JFrame("Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Helps layout
		frame.pack();
		// Set size of frame
		frame.setSize(200, 300); 
		// Make the frame appear
		frame.setVisible(true);
	}
}
