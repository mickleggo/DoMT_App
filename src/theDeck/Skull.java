package theDeck;

import core.SpriteSheetController;

public class Skull extends CardObject {

	public Skull() {
		CardColumn = 4;
		CardRow = 1;
		CardName = "Skull";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
