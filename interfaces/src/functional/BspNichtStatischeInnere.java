package functional;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Swing (GUI) ist nicht in der Prufung
 * Java FX - alternative
 */

@SuppressWarnings("serial")
class MyFrame extends JFrame{
	
	private class OnClickListener implements ActionListener{
		private int clicksCount;

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Click");
			
			String text = "Clicks" + ++clicksCount;
			label.setText(text);
			
			button.setText("Click (" + clicksCount + ")");
		}
	}
	
	private JLabel label = new JLabel("Clicks: 0");
	
	private JButton button = new JButton("Click");
	
	public MyFrame() {
		super("Clicks Counter");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		/*
		 * Anfangsposition
		 */
		int x = 800;
		int y = 300;
		setLocation(x, y);
		
		/*
		 * Masse
		 */
		int width = 300;
		int height = 200;
		setSize(width, height);
		
		/*
		 * WindowBuilder - Risuem - kod avto generitsia
		 * 
		 * Aktuelle layout-Manager: BorderLayout, der 5 Bereiche im Fenster definiert
		 */
		
		/*
		 * Schaltflache bilden und in Suden plazieren
		 */
		add(button, BorderLayout.SOUTH);
		
		/*
		 * Lable im Norden:
		 */
		add(label, BorderLayout.NORTH);
		
		/*
		 * Den Listener fur Click - event bilden
		 * und vei dem JButton registrieren
		 */
		ActionListener onClick = new OnClickListener();
		button.addActionListener(onClick);
	}
}

public class BspNichtStatischeInnere {

	public static void main(String[] args) {
		
		JFrame frame = new MyFrame();
		
		frame.setVisible(true);
		
		System.out.println("End of main");
		
	}
	
}
