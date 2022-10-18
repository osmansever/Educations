package ders36;

import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class KarePencere extends JFrame implements ActionListener {

	
	int x,y,width,height;
	
	public KarePencere()
	{
		super();
		x=100;
		y = 100;
		width= 200;
		height = 200;
		
		Timer zaman = new Timer(250,this);
		zaman.start();
		
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.drawRect(x, y, width, height);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		x++;
		y++;
		repaint();
		}
	
}
