package theDeck;

import core.SpriteSheetController;

public class Talon extends CardObject {

	public Talon() {
		CardColumn = 3;
		CardRow = 3;
		CardName = "Talon";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
