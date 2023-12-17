package theDeck;

import core.SpriteSheetController;

public class Balance extends CardObject {

	public Balance() {
		CardColumn = 0;
		CardRow = 3;
		CardName = "Balance";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
