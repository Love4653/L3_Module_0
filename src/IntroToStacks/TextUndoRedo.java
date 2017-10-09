package IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TextUndoRedo implements KeyListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	char letter;
	Stack <Character> st = new Stack <Character>();
	public static void main(String[] args) {
		TextUndoRedo t = new TextUndoRedo();
		
	}
	TextUndoRedo () {
		f.add(p);
		p.add(l);
		f.setVisible(true);	
		f.addKeyListener(this);
		f.pack();
	}
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE){
			String txt = l.getText();
			char c = txt.charAt(txt.length()-1);
			st.push(c);
			String newTxt = txt.substring(0, txt.length()-1);
			l.setText(newTxt);
		}else if(e.getKeyCode() == KeyEvent.VK_ENTER){
			Character stu = st.pop();
			l.setText(l.getText() + stu);
		}
		else {
			letter = e.getKeyChar();
			l.setText(l.getText() + letter);
			
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

