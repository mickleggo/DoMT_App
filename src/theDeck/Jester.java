package theDeck;

import core.SpriteSheetController;

public class Jester extends CardObject {
	
	public Jester() {
		CardColumn = 3;
		CardRow = 2;
		CardName = "Jester";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
