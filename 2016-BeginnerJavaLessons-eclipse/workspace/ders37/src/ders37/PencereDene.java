package ders37;

import javax.swing.JFrame;

public class PencereDene {

	public static void main(String[] args) {
		// TODO Auto-generated methodstub

		JFrame pencere = new JFrame("PrograM");
		pencere.add( new KarePencere());
		pencere.setSize(640, 480);
		pencere.setVisible(true);
	}

}
