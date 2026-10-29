package entity;

import main.GamePanel;
import main.KeyHandler;
import objects.Wall;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends Entity{

    GamePanel gamePanel;
    KeyHandler keyHandler;
    BufferedImage playerImage;
    public final int playerWidth = 32;
    public final int playerHeight = 32;
    private boolean onGround = false;

    public Player(GamePanel gamePanel, KeyHandler keyHandler) {
        super(gamePanel);
        this.keyHandler = keyHandler;
        this.gamePanel = gamePanel;


        hitBox = new Rectangle(0, 0, 32, 32);

        getPlayerImage();
        getDefaultValues();
    }
    public void draw(Graphics2D g2) {

        BufferedImage image = null;
        image = playerImage;
        g2.drawImage(image, (int)worldX, (int)worldY, playerWidth, playerHeight, null);
        g2.setColor(Color.BLACK);
        g2.drawRect((int)worldX, (int)worldY, 32, 32);
    }
    public void update() {
        if (gamePanel.keyHandler.aPressed && gamePanel.keyHandler.dPressed || !gamePanel.keyHandler.aPressed && !gamePanel.keyHandler.dPressed) {
            xSpeed *= 0.8;
        } else if (gamePanel.keyHandler.aPressed && !gamePanel.keyHandler.dPressed) {
            xSpeed--;
        } else if (gamePanel.keyHandler.dPressed && !gamePanel.keyHandler.aPressed) {
            xSpeed++;
        }

        if (xSpeed > 0 && xSpeed < 0.75) {
            xSpeed = 0;
        }
        if (xSpeed < 0 && xSpeed > -0.75) {
            xSpeed = 0;
        }

        if (xSpeed > 6) {
            xSpeed = 6;
        } else if (xSpeed < -6) {
            xSpeed = -6;
        }
        hitBox.y++;
        for (Wall wall: gamePanel.walls) {
            if (wall.hitBox.intersects(hitBox)) {
                onGround = true;
            }
        }
        hitBox.y--;


        if (gamePanel.keyHandler.spacePressed) {
            hitBox.y++;
            for (Wall wall: gamePanel.walls) {
                if (wall.hitBox.intersects(hitBox)) {
                    ySpeed = -7.0;
                    onGround = false;
                }
            }
            hitBox.y--;
        }
        if(!onGround) {
            xSpeed *= 0.85;
        }

        gamePanel.collisionChecker.checkPlayerCollision();

        worldX += xSpeed;
        worldY += (int)ySpeed;

        hitBox.x = (int)worldX;
        hitBox.y = (int)worldY;

    }

    public void getDefaultValues() {

    }

    public void getPlayerImage() {
        try {
            playerImage = ImageIO.read(getClass().getResourceAsStream("/player/playerImage.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dead() {
        gamePanel.level.changeRoom(gamePanel.levelNumber, gamePanel.roomNumber);
//        worldX = gamePanel.level.returnSpawnX() * gamePanel.tileSize;
//        worldY = gamePanel.level.returnSpawnY() * gamePanel.tileSize;

        hitBox.x = (int)worldX;
        hitBox.y = (int)worldY;
        xSpeed = 0;
        ySpeed = 0;
    }
}
