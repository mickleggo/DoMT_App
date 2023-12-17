package theDeck;

import core.SpriteSheetController;

public class The_Knight extends CardObject {

	public The_Knight() {
		CardColumn = 2;
		CardRow = 2;
		CardName = "The Knight";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
