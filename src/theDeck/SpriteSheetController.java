package theDeck;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpriteSheetController {
	
	private BufferedImage spriteSheet;
	private BufferedImage card;
	
	public BufferedImage ImportDeck(int x, int y, int width, int height) {
		
		try {
			spriteSheet = ImageIO.read(new File(".//res/DeckSpriteSheet.png"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		card = spriteSheet.getSubimage(x, y, width, height);
		
	return card;	
	}
	
	
}