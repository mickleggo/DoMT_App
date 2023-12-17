package theDeck;

import core.SpriteSheetController;

public class The_Moon extends CardObject {

	public The_Moon() {
		CardColumn = 2;
		CardRow = 1;
		CardName = "The Moon";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
