package core;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpriteSheetController {
	
	private static BufferedImage spriteSheet;
	private static BufferedImage card;
	
	public void ImportDeck() {
		try {
			spriteSheet = ImageIO.read(new File(".//res/DeckSpriteSheet.png"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static BufferedImage getCard(int x, int y, int width, int height) {
		card = spriteSheet.getSubimage(x, y, width, height);
		return card;
	}
	
	
}