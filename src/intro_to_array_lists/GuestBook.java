package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JPanel panel;
	JFrame frame;
	JButton button;
	JButton button2;
	
	public void CreateUI() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("add name");
		button2 = new JButton("View Names");
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GuestBook().CreateUI();
	}
	String[] bob = new String[10];
	int b=0;
	int c=0;
	String[] longy= new String[10];
	 String lonyer;
	@Override	public void actionPerformed(ActionEvent arg0) {
		
		// TODO Auto-generated method stub
		if(arg0.getSource()==button) {
			b = b+1;
		
  bob[b] = JOptionPane.showInputDialog(null,"give me yo name SONNNN!!");
		}
		
		if(arg0.getSource()==button2) {
			for(int i=0; i<b; i++) {
				c=c+1;
				 longy[c] = " Guest # " + c + " :" + bob[c];
				 
				 for( i=0; i<longy.length; i++) {
					 lonyer = longy.length ;
				 
				 
						}
			//	if (b>1) {
			//		JOptionPane.showMessageDialog(null, " Guest #" + c + ":" + bob[c]);
				//}
			JOptionPane.showMessageDialog(null, lonyer );
			
			
		}
	}
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
