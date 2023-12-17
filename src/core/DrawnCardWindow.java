package core;
import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;

public class DrawnCardWindow{
	
	private BufferedImage image;

	JFrame window;
	Container con;
	JButton draw;
	JPanel cardDisplay;
	
	private int width = 420;
	private int height = 700;
	private String cardName;
	
	@SuppressWarnings("serial")
	public void CardGUI(BufferedImage card, String cardName) {
		this.cardName = cardName;
		this.image = card;
		
		/**************************************************************************************************/
		/* Initial Window */
		
		window = new JFrame(this.cardName);
		window.setBounds(750, 180, 440, 742);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		window.getContentPane().setLayout(null);	
		con = window.getContentPane();

		
		/**************************************************************************************************/

		/* Show Card */
		cardDisplay = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(image, 0, 0, width, height, null);
			}
		};
		cardDisplay.setBounds(2, 2, 420, 700);
		cardDisplay.setPreferredSize(new Dimension(420, 700));
		cardDisplay.repaint();
		
		con.add(cardDisplay);
		//frame.pack();
		
		/**************************************************************************************************/
		/* Show window */
		
		window.setVisible(true);
		
	}
	
}