package objects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Slime {
    int x, y;
    int width, height;

    public Rectangle hitBox;
    BufferedImage slimeImage00;

    public Slime(int x, int y, int width, int height) {

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        hitBox = new Rectangle(x, y, width, height);
        getImages();
    }

    public void draw(Graphics2D g2) {
        BufferedImage image = null;
        image = slimeImage00;
        g2.drawImage(image, x, y, width, height, null);
    }
    public void getImages() {
        try {
            slimeImage00 = ImageIO.read(getClass().getResourceAsStream("/tiles/slime00.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
