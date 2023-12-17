package theDeck;

import core.SpriteSheetController;

public class Donjon extends CardObject {

	public Donjon() {
		CardColumn = 0;
		CardRow = 1;
		CardName = "Donjon";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
