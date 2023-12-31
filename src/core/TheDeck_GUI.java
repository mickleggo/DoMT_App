package core;
import java.awt.*;
import javax.swing.*;
import core.TheDeck_Main.CustomMouseListener;
import core.TheDeck_Main.MenuHandler;
import java.awt.image.BufferedImage;

public class TheDeck_GUI{
	
	private BufferedImage image;

	JFrame window;
	JMenuBar menuBar;
	JMenu menuAbout;
	Container con;
	JButton draw;
	JPanel cardDisplay;
	
	private int width = 420;
	private int height = 700;
	
	@SuppressWarnings("serial")
	public void GUI(BufferedImage card, MenuHandler mHandler, CustomMouseListener dHandler) {
		this.image = card;
		
		/**************************************************************************************************/
		/* Initial Window */
		
		window = new JFrame("Deck of Many Things");
		window.setBounds(750, 180, 440, 767);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		window.getContentPane().setLayout(null);
		
		menuBar = new JMenuBar();
		
		menuAbout = new JMenu("About");
		menuAbout.addMenuListener(mHandler);
		menuBar.add(menuAbout);
		
		con = window.getContentPane();
		
		window.setJMenuBar(menuBar);
		
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
		con.addMouseListener(dHandler);
		//frame.pack();
		
		/**************************************************************************************************/
		/* Show window */
		
		window.setVisible(true);
		
	}
	
}
