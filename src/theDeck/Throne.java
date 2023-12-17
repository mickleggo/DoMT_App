package theDeck;

import core.SpriteSheetController;

public class Throne extends CardObject {

	public Throne() {
		CardColumn = 1;
		CardRow = 1;
		CardName = "Throne";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
