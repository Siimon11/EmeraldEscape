package entity;

import main.GamePanel;

import java.awt.*;

public class Entity {
    public Rectangle hitBox;
    GamePanel gamePanel;
    public double worldX;
    public double worldY;
    public double xSpeed = 0;
    public double ySpeed = 0;
    public boolean collisionOn = false;

    public Entity(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }


}
