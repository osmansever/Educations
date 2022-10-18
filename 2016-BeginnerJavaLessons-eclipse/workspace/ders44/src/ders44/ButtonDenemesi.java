package ders44;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonDenemesi extends JPanel implements ActionListener {
	
	JButton button1,button2 ;
	JLabel label1;

	public ButtonDenemesi() 
	{
		super();
		button1 = new JButton("Arttýr");
		button1.addActionListener(this);
		button2 = new JButton("Azalt");
		button2.addActionListener(this);
		
		label1 = new JLabel("0");
		
		add(button1);
		add(button2);
		
		add(label1);
		
		
	}


	public static void main(String[] args) {

		JFrame frame = new JFrame("Deneme Programý");
		ButtonDenemesi panel1 =new ButtonDenemesi();
		frame.add(panel1);
		frame.setSize(320, 240);
		frame.setVisible(true);
		
		 
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		if (arg0.getActionCommand().equals("Arttýr"))
		{
			int a = Integer.parseInt(label1.getText());
			a = a + 1;
			label1.setText("" + a);
			
			
		}
		else if (arg0.getActionCommand().equals("Azalt"))
				{
			
			int a = Integer.parseInt(label1.getText());
			a = a- 1;
			label1.setText(""+ a);
			
				}
		
	}

}
