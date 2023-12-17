package theDeck;

import core.SpriteSheetController;

public class Flames extends CardObject {

	public Flames() {
		CardColumn = 2;
		CardRow = 0;
		CardName = "Flames";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
