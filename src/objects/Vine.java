package objects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Vine extends Ladder{

    BufferedImage vineImage00;

    public Vine(int x, int y, int width, int height) {

        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        hitBox = new Rectangle(x, y, width, height);
        getImages();
    }

    public void draw(Graphics2D g2) {
        BufferedImage image = null;
        image = vineImage00;
        g2.drawImage(image, x, y, width, height, null);
    }
    public void getImages() {
        try {
            vineImage00 = ImageIO.read(getClass().getResourceAsStream("/objects/vine00.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
