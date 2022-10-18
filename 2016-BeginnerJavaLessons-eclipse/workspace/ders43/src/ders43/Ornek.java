package ders43;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ornek extends JFrame implements MouseListener {
	
	JLabel label1,label2;
	JPanel panel1;
	int sayi = 0;

	
	Ornek()
	{
		super();
		
		panel1 = new JPanel();
		
		label1 = new JLabel("Etiket1");
		panel1.add(label1);
		
		label2 = new JLabel("Sað týk = Azalt, Sol týk = Arttýr ");
		panel1.add(label2);
		
		add(panel1);
		
		addMouseListener(this);
		
		

		
	}
	
	public static void main(String[] args) {
	
		Ornek pencere = new Ornek();
		pencere.setVisible(true);
		pencere.setSize(640,480);
		
		
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getButton() == arg0.BUTTON1)
		{
			sayi++;
			
		}
		else if (arg0.getButton() == arg0.BUTTON3)
		{
			sayi--;
		}
		
		label1.setText(" " + sayi);

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
