package entity;

import main.GamePanel;

import java.awt.*;

public class Entity {
    public Rectangle hitBox;
    GamePanel gamePanel;
    public int worldX;
    public int worldY;
    public String direction = "down";
    public int speed;
    public double xSpeed = 0;
    public double ySpeed = 0;
    public boolean collisionOn = false;

    public Entity(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }


}
