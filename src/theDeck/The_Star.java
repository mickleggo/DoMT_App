package theDeck;

import core.SpriteSheetController;

public class The_Star extends CardObject {

	public The_Star() {
		CardColumn = 3;
		CardRow = 1;
		CardName = "The Star";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
