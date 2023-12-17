package theDeck;

import core.SpriteSheetController;

public class The_Key extends CardObject {

	public The_Key() {
		CardColumn = 0;
		CardRow = 0;
		CardName = "The Key";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
