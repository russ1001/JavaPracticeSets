import javax.swing.*;
// import Swing toolkit package which supports GUI



// How to create a GUI (Graphic User Interface)




public class GUIComponents {

	public static void main(String[] args) {
		
		
		// create new objects
		JButton jbtOK = new JButton("OK");
		JButton jbtCancel = new JButton("Cancel");
		
		JLabel jlblName = new JLabel("Enter your name: ");
		
		JTextField jtfName = new JTextField("Type Name Here");
		
		JCheckBox jchkBold = new JCheckBox("Bold");
		JCheckBox jchkItalic = new JCheckBox("Italic");
		
		JRadioButton jrbRed = new JRadioButton("Red");
		JRadioButton jrbYellow = new JRadioButton("Yellow");
		
		JComboBox jcboColor = new JComboBox(new String[] {"Freshman", "Sophomore", "Junior", "Senior"});
		
		
		
		// add to container
		JPanel panel = new JPanel();
		panel.add(jbtOK);
		panel.add(jbtCancel);
		panel.add(jlblName);
		panel.add(jtfName);
		panel.add(jchkBold);
		panel.add(jchkItalic);
		panel.add(jrbRed);
		panel.add(jrbYellow);
		panel.add(jcboColor);
		
		 
		// add to frame 
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setTitle("Show GUI components");
		frame.setSize(1000, 450);
		frame.setLocation(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}

}
