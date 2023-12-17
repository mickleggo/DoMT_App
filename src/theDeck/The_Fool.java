package theDeck;

import core.SpriteSheetController;

public class The_Fool extends CardObject {

	public The_Fool() {
		CardColumn = 5;
		CardRow = 2;
		CardName = "The Fool";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
