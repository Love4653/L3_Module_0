package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener{
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton add = new JButton();
	JButton search = new JButton();
	JButton view = new JButton();
	JButton remove = new JButton();
	HashMap<Integer, String> list = new HashMap();
	String Id;
	int ID;
	String is = "list = ";
	String name;
	public static void main(String[] args) {
		LogSearch lg = new LogSearch();
	}
 
	LogSearch(){
		f.add(p);
		p.add(add);
		p.add(search);
		p.add(view);
		p.add(remove);
		f.setVisible(true);
		add.addActionListener(this);
		search.addActionListener(this);
		view.addActionListener(this);
		remove.addActionListener(this);
		add.setText("Add entry");
		search.setText("Search by ID");
		view.setText("ViewList");
		remove.setText("Remove Entry");
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add) {
			Id = JOptionPane.showInputDialog("Enter an ID number");
			ID = Integer.parseInt(Id);
			name = JOptionPane.showInputDialog("Enter a name");
			list.put(ID, name);
		}
		else if(e.getSource() == search) {
			String st = JOptionPane.showInputDialog("Enter an ID number");
			int other = Integer.parseInt(st);
			if(list.containsKey(other) == true) {
				JOptionPane.showMessageDialog(null, list.get(other));
			}
			else if(list.containsKey(other) == false) {
				JOptionPane.showMessageDialog(null, "This ID does not exist");
			}
		}
		else if(e.getSource() == view) {
			String s = "";
			for (int i: list.keySet()) {
						s += " ID: " + i + " Name: " + list.get(i)+ "\n";
					}
					JOptionPane.showMessageDialog(null, s);
		}
		else if (e.getSource() == remove) {
			String st = JOptionPane.showInputDialog("Enter an ID number");
			int other = Integer.parseInt(st);
			if(list.containsKey(other) == true) {
				list.remove(other);
			}
			else if(list.containsKey(other) == false) {
				JOptionPane.showMessageDialog(null, "This ID does not exist");
			}
		}
	}
}
/* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */