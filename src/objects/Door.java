package objects;

import java.awt.*;

public class Door {
    public Rectangle hitBox;
    int x, y;
    int width, height;

    public Door(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        hitBox = new Rectangle(x, y, width, height);
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.BLACK);
        g2.fillRect(x, y, width, height);
    }


}
