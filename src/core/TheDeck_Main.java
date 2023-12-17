package core;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import theDeck.Balance;
import theDeck.Comet;
import theDeck.Donjon;
import theDeck.Euryale;
import theDeck.Fates;
import theDeck.Flames;
import theDeck.Gem;
import theDeck.Idiot;
import theDeck.Jester;
import theDeck.Rogue;
import theDeck.Ruin;
import theDeck.Skull;
import theDeck.Talon;
import theDeck.The_Fool;
import theDeck.The_Key;
import theDeck.The_Knight;
import theDeck.The_Moon;
import theDeck.The_Star;
import theDeck.The_Sun;
import theDeck.Throne;
import theDeck.Vizier;
import theDeck.Void;

public class TheDeck_Main {

	private TheDeck_GUI gui = new TheDeck_GUI();
	private DrawnCardWindow cardDrawn = new DrawnCardWindow();
	private AboutWindow about = new AboutWindow();
	private SpriteSheetController spritectrl = new SpriteSheetController();
	private MenuHandler mHandler = new MenuHandler();
	private CustomMouseListener dHandler = new CustomMouseListener();
	private BufferedImage image;
	private boolean[] inDeck = new boolean[22];
	private boolean cardsRemain = true;

	private int CardColumn = 5; // 0 to 5 - with 5 for Back of cards
	private int CardRow = 0; // 0 to 3 - with 0 for Back of cards
	private int width = 1440;
	private int height = 2620;
	private String cardName = "Deck";

	public static void main(String[] args) {
		new TheDeck_Main();
	}

	public TheDeck_Main() {
		spritectrl.ImportDeck();

		for (int i = 0; i < inDeck.length; i++) {
			inDeck[i] = true;
		}

		getImage();
		gui.GUI(image, mHandler, dHandler);

	}

	public void getImage() {
		image = SpriteSheetController.getCard(CardColumn * width, CardRow * height, width, height);
	}

	public void drawCard() {
		if(!cardsRemain) {
			System.out.println("No cards remaining!");
			this.CardColumn = 5;
			this.CardRow = 3;
			getImage();
			cardDrawn.CardGUI(image, "Deck is Empty");
			return;
		}
		
		int ran = 0;
		do {
			ran = (int) (Math.random() * 22 + 1);
		} while(inDeck[ran-1] == false);
		
		switch (ran) {
		case 1: // The Key
			new The_Key();
			inDeck[ran-1] = false;
			this.CardColumn = The_Key.getCardCol();
			this.CardRow = The_Key.getCardRow();
			this.cardName = The_Key.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 2: // Comet
			new Comet();
			inDeck[ran-1] = false;
			this.CardColumn = Comet.getCardCol();
			this.CardRow = Comet.getCardRow();
			this.cardName = Comet.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 3: // Flames
			new Flames();
			inDeck[ran-1] = false;
			this.CardColumn = Flames.getCardCol();
			this.CardRow = Flames.getCardRow();
			this.cardName = Flames.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 4: // Idiot
			new Idiot();
			inDeck[ran-1] = false;
			this.CardColumn = Idiot.getCardCol();
			this.CardRow = Idiot.getCardRow();
			this.cardName = Idiot.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 5: // Fates
			new Fates();
			inDeck[ran-1] = false;
			this.CardColumn = Fates.getCardCol();
			this.CardRow = Fates.getCardRow();
			this.cardName = Fates.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 6: // Donjon
			new Donjon();
			inDeck[ran-1] = false;
			this.CardColumn = Donjon.getCardCol();
			this.CardRow = Donjon.getCardRow();
			this.cardName = Donjon.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 7: // Throne
			new Throne();
			inDeck[ran-1] = false;
			this.CardColumn = Throne.getCardCol();
			this.CardRow = Throne.getCardRow();
			this.cardName = Throne.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 8: // The Moon
			new The_Moon();
			inDeck[ran-1] = false;
			this.CardColumn = The_Moon.getCardCol();
			this.CardRow = The_Moon.getCardRow();
			this.cardName = The_Moon.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 9: // The Star
			new The_Star();
			inDeck[ran-1] = false;
			this.CardColumn = The_Star.getCardCol();
			this.CardRow = The_Star.getCardRow();
			this.cardName = The_Star.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 10: // Skull
			new Skull();
			inDeck[ran-1] = false;
			this.CardColumn = Skull.getCardCol();
			this.CardRow = Skull.getCardRow();
			this.cardName = Skull.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 11: // Rogue
			new Rogue();
			inDeck[ran-1] = false;
			this.CardColumn = Rogue.getCardCol();
			this.CardRow = Rogue.getCardRow();
			this.cardName = Rogue.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 12: // Euryale
			new Euryale();
			inDeck[ran-1] = false;
			this.CardColumn = Euryale.getCardCol();
			this.CardRow = Euryale.getCardRow();
			this.cardName = Euryale.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 13: // Vizier
			new Vizier();
			inDeck[ran-1] = false;
			this.CardColumn = Vizier.getCardCol();
			this.CardRow = Vizier.getCardRow();
			this.cardName = Vizier.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 14: // The Knight
			new The_Knight();
			inDeck[ran-1] = false;
			this.CardColumn = The_Knight.getCardCol();
			this.CardRow = The_Knight.getCardRow();
			this.cardName = The_Knight.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 15: // Jester
			new Jester();
			inDeck[ran-1] = false;
			this.CardColumn = Jester.getCardCol();
			this.CardRow = Jester.getCardRow();
			this.cardName = Jester.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 16: // The Sun
			new The_Sun();
			inDeck[ran-1] = false;
			this.CardColumn = The_Sun.getCardCol();
			this.CardRow = The_Sun.getCardRow();
			this.cardName = The_Sun.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 17: // The Fool
			new The_Fool();
			inDeck[ran-1] = false;
			this.CardColumn = The_Fool.getCardCol();
			this.CardRow = The_Fool.getCardRow();
			this.cardName = The_Fool.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 18: // Balance
			new Balance();
			inDeck[ran-1] = false;
			this.CardColumn = Balance.getCardCol();
			this.CardRow = Balance.getCardRow();
			this.cardName = Balance.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 19: // Gem
			new Gem();
			inDeck[ran-1] = false;
			this.CardColumn = Gem.getCardCol();
			this.CardRow = Gem.getCardRow();
			this.cardName = Gem.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 20: // Ruin
			new Ruin();
			inDeck[ran-1] = false;
			this.CardColumn = Ruin.getCardCol();
			this.CardRow = Ruin.getCardRow();
			this.cardName = Ruin.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 21: // Talon
			new Talon();
			inDeck[ran-1] = false;
			this.CardColumn = Talon.getCardCol();
			this.CardRow = Talon.getCardRow();
			this.cardName = Talon.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;

		case 22: // Void
			new Void();
			inDeck[ran-1] = false;
			this.CardColumn = Void.getCardCol();
			this.CardRow = Void.getCardRow();
			this.cardName = Void.getCardName();
			getImage();
			cardDrawn.CardGUI(image, this.cardName);
			break;
		}
		
		cardsRemain = false;
		for(int i = 0; i < inDeck.length ; i++) {
			if(inDeck[i]) cardsRemain = true;
		}


	}

	public class CustomMouseListener implements MouseListener {

		public void mouseClicked(MouseEvent e) {
			drawCard();
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}

	}

	public class MenuHandler implements MenuListener {

		public void menuSelected(MenuEvent e) {
			about.About();
		}

		public void menuDeselected(MenuEvent e) {
		}

		public void menuCanceled(MenuEvent e) {
		}

	}

}
