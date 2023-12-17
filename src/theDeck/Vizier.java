package theDeck;

import core.SpriteSheetController;

public class Vizier extends CardObject {

	public Vizier() {
		CardColumn = 1;
		CardRow = 2;
		CardName = "Vizier";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
