package ders45;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TextFieldDeneme extends JPanel implements ActionListener {

	
	
	public TextFieldDeneme() {
		super();
		JButton button1;
		button1 = new JButton("Olu?tur");
		button1.addActionListener(this);
		add(button1);

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("11 Haneli ?ifre Olu?turucu");
		TextFieldDeneme panel1 =new TextFieldDeneme();
		frame.add(panel1);
		frame.setSize(240, 144);
		frame.setVisible(true);

		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {


		String uuid = UUID.randomUUID().toString();
		StringSelection selection = new StringSelection(uuid.substring(25, 36));

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    clipboard.setContents(selection, selection);
	    
	    
	}

}
