package theDeck;

import core.SpriteSheetController;

public class Idiot extends CardObject {

	public Idiot() {
		CardColumn = 3;
		CardRow = 0;
		CardName = "Idiot";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
