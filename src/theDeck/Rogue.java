package theDeck;

import core.SpriteSheetController;

public class Rogue extends CardObject {

	public Rogue() {
		CardColumn = 5;
		CardRow = 1;
		CardName = "Rogue";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
