import javax.swing.JOptionPane;

public class aaaa {
	public static void main(String[] args) {


		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...

		JOptionPane.showMessageDialog(null, "If you find yourself having to ride a giraffe, here's how to do it...");
		// Get the user to enter an adjective

		String adjective = JOptionPane.showInputDialog(null, "Enter an adjective");
		// Get the user to enter a type of liquid

		String liquid = JOptionPane.showInputDialog(null, "Enter a type of liquid");
		
		
		// Get the user to enter a body part

		String bodypart = JOptionPane.showInputDialog(null, "Enter a body part");
		// Get the user to enter a verb

		String verb = JOptionPane.showInputDialog(null, "Enter a verb");
		// Get the user to enter a place

		String place = JOptionPane.showInputDialog(null, "Enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		JOptionPane.showMessageDialog(null, "Giraffes are more " + adjective + " during the day, so sneak up at night. \n Giraffes love to lick " + liquid + " and will most likely spit on your " + bodypart + " if you " + verb + "." + " \n Whatever you do, if you like to stay intact, try to find another way to get back to the "+ place + ". Good Luck!");
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		


	}
}

