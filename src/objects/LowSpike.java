package objects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class LowSpike extends Spike{
    BufferedImage spikeImage02_down, spikeImage02_up, spikeImage02_left, spikeImage02_right;
    String direction;

    public LowSpike(int x, int y, int width, int height, String direction) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.direction = direction;
        switch (direction) {
            case "down": hitBox = new Rectangle(x, y + 20, width, height - 20); break;
            case "up": hitBox = new Rectangle(x, y, width, height - 20); break;
            case "left": hitBox = new Rectangle(x, y, width - 20, height); break;
            case "right": hitBox = new Rectangle(x + 20, y, width - 20, height); break;
        }
        getImages();
    }

    public void draw(Graphics2D g2) {
        BufferedImage image = null;
        switch (direction) {
            case "down": image = spikeImage02_down; break;
            case "up": image = spikeImage02_up; break;
            case "left": image = spikeImage02_left; break;
            case "right": image = spikeImage02_right; break;
        }
        g2.drawImage(image, x, y, width, height, null);
    }
    public void getImages() {
        try {
            spikeImage02_down = ImageIO.read(getClass().getResourceAsStream("/objects/spike02_down.png"));
            spikeImage02_up = ImageIO.read(getClass().getResourceAsStream("/objects/spike02_up.png"));
            spikeImage02_left = ImageIO.read(getClass().getResourceAsStream("/objects/spike02_left.png"));
            spikeImage02_right = ImageIO.read(getClass().getResourceAsStream("/objects/spike02_right.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
