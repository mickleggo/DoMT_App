package theDeck;

import core.SpriteSheetController;

public class Ruin extends CardObject {

	public Ruin() {
		CardColumn = 2;
		CardRow = 3;
		CardName = "Ruin";
		image = SpriteSheetController.getCard(CardColumn, CardRow, width, height);
	}
}
