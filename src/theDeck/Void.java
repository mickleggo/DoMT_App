package theDeck;

import core.SpriteSheetController;

public class Void extends CardObject {

	public Void() {
		CardColumn = 4;
		CardRow = 3;
		CardName = "Void";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
