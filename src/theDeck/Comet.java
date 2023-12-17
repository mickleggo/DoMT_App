package theDeck;

import core.SpriteSheetController;

public class Comet extends CardObject {
	
	public Comet() {
		CardColumn = 1;
		CardRow = 0;
		CardName = "Comet";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}

}
