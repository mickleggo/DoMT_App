package theDeck;

import core.SpriteSheetController;

public class Deck extends CardObject {

	public Deck() {
		CardColumn = 5;
		CardRow = 0;
		CardName = "Deck";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
	
}
