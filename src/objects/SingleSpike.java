package objects;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SingleSpike extends Spike{
    BufferedImage spikeImage01_down, spikeImage01_up, spikeImage01_left, spikeImage01_right;
    String direction;

    public SingleSpike(int x, int y, int width, int height, String direction) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.direction = direction;

        switch (direction) {
            case "down": hitBox = new Rectangle(x + 8, y + 10, width - 16, height - 10); break;
            case "up": hitBox = new Rectangle(x + 8, y, width - 16, height - 10); break;
            case "left": hitBox = new Rectangle(x, y + 8, width - 10, height - 16); break;
            case "right": hitBox = new Rectangle(x + 10, y + 8, width - 10, height - 16); break;
        }

        getImages();
    }

    public void draw(Graphics2D g2) {
        BufferedImage image = null;
        switch (direction) {
            case "down": image = spikeImage01_down; break;
            case "up": image = spikeImage01_up; break;
            case "left": image = spikeImage01_left; break;
            case "right": image = spikeImage01_right; break;
        }
        g2.drawImage(image, x, y, width, height, null);
        // Debug
        //g2.setColor(new Color(255,0,0,100));
        //g2.fillRect(hitBox.x, hitBox.y, hitBox.width, hitBox.height);
    }
    public void getImages() {
        try {
            spikeImage01_down = ImageIO.read(getClass().getResourceAsStream("/objects/spike01_down.png"));
            spikeImage01_up = ImageIO.read(getClass().getResourceAsStream("/objects/spike01_up.png"));
            spikeImage01_left = ImageIO.read(getClass().getResourceAsStream("/objects/spike01_left.png"));
            spikeImage01_right = ImageIO.read(getClass().getResourceAsStream("/objects/spike01_right.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
