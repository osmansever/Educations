package ders37;

import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class KarePencere extends JPanel implements ActionListener {

	
	int x,y,width,height;
	
	public KarePencere()
	{
		super();
		x=100;
		y = 100;
		width= 200;
		height = 200;
		
		Timer zaman = new Timer(40,this);
		zaman.start();
		
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//g.drawRect(x, y, width, height);
		g.drawOval(x, y, width, height);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		x++;
		y++;
		repaint();
		}
	
}
