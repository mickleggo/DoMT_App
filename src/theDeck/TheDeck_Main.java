package theDeck;
//import java.awt.event.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.image.BufferedImage;

public class TheDeck_Main {
	
	private TheDeck_GUI gui = new TheDeck_GUI();
	private AboutWindow about = new AboutWindow();
	private SpriteSheetController spritectrl = new SpriteSheetController();
	private MenuHandler mHandler = new MenuHandler();
	private BufferedImage image;
	
	private int CardColumn = 5; 	// 0 to 5 - with 5 for Back of cards
	private int CardRow = 0; 		// 0 to 3 - with 0 for Back of cards
	private int width = 1440;
	private int height = 2620;

	public static void main(String[] args) {
		new TheDeck_Main();
	}
	
	public TheDeck_Main() {
		
		image = spritectrl.ImportDeck(CardColumn*width, CardRow*height, width, height);
		gui.GUI(image, mHandler);
		
	}

	
	public class MenuHandler implements MenuListener{

		public void menuSelected(MenuEvent e) {
			about.About();
		}

		public void menuDeselected(MenuEvent e) {
		}
		public void menuCanceled(MenuEvent e) {	
		}
		
	}

}
