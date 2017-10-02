package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JButton b = new JButton();
	JButton b2 = new JButton();
	ArrayList<String> guestbook = new ArrayList();
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	}	

GuestBook(){
	guestbook.add("Bob Banders");
	guestbook.add("Sandy Summers");
	guestbook.add("Greg Ganders");
	guestbook.add("Donny Doners");
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	f.add(p);
	f.setVisible(true);
	p.add(b);
	p.add(b2);
	b.setText("Add names");
	b2.setText("View names");
	f.pack();
	b.addActionListener(this);
	b2.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource() == b){
		String add = JOptionPane.showInputDialog("Enter a name");
		guestbook.add(add);
	}
	if(e.getSource() == b2){
		for (int i = 0; i < guestbook.size(); i++) {
			JOptionPane.showMessageDialog(null, "Guest #1: " + guestbook.get(i) + "Guest #2: " + guestbook.get(i+1) + "Guest #3: " + guestbook.get(i+2) + "Guest #4: " + guestbook.get(i+3)+"Guest #5: " + guestbook.get(i+4));
		}
	}
	}
}