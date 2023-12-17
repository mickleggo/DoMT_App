package theDeck;

import core.SpriteSheetController;

public class Fates extends CardObject {

	public Fates() {
		CardColumn = 4;
		CardRow = 0;
		CardName = "Fates";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
