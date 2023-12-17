package theDeck;

import core.SpriteSheetController;

public class Gem extends CardObject {

	public Gem() {
		CardColumn = 1;
		CardRow = 3;
		CardName = "Gem";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
