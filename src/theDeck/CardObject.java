package theDeck;
import java.awt.image.BufferedImage;

public abstract class CardObject {
	
	public static int CardColumn, CardRow;
	public static String CardName;
	public static BufferedImage image;
	public int width = 1440;
	public int height = 2620;
	
	public CardObject() {
		
	}
	
	public void draw() {
		
	}
	
	public static int getCardCol() { return CardColumn; }
	public static int getCardRow() { return CardRow; }
	public static String getCardName() { return CardName; }
	public static BufferedImage getCardImage() { return image; }
	
}
