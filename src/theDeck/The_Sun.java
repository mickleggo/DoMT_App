package theDeck;

import core.SpriteSheetController;

public class The_Sun extends CardObject {

	public The_Sun() {
		CardColumn = 4;
		CardRow = 2;
		CardName = "The Sun";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
