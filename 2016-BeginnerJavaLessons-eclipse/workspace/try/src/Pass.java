import java.util.UUID;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pass extends JFrame {

	public static void main(String[] args) {
		String uuid = UUID.randomUUID().toString();

		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		JLabel jl = new JLabel(uuid.substring(0, 8));
		
		jf
		
	}

}
