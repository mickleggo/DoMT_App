package theDeck;

import core.SpriteSheetController;

public class Euryale extends CardObject {

	
	public Euryale() {
		CardColumn = 0;
		CardRow = 2;
		CardName = "Euryale";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
