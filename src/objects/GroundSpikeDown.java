package objects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class GroundSpikeDown extends Spike{

    BufferedImage spikeImage00;

    public GroundSpikeDown(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        hitBox = new Rectangle(x, y + 12, width, height - 12);
        getImages();
    }

    public void draw(Graphics2D g2) {
        BufferedImage image = null;
        image = spikeImage00;
        g2.drawImage(image, x, y, width, height, null);
    }
    public void getImages() {
        try {
            spikeImage00 = ImageIO.read(getClass().getResourceAsStream("/objects/spike00_down.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
