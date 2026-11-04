package main;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class UI {
    GamePanel gamePanel;
    Graphics2D g2;
    public int commandNumber;
    public int titleScreenNumber;
    private BufferedImage mainMenuImage, levelSelectionImage, levelLockedImage;
    Font font;
    public UI(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
        loadImages();
    }
    public void draw(Graphics2D g2) {
        this.g2 = g2;
        font = new Font("Arial", Font.PLAIN, 60);
        if (gamePanel.gameState == gamePanel.titleState) {
            if (titleScreenNumber == 0) {
                drawTitleScreen();
            } else if (titleScreenNumber == 1) {
                drawLevelSelection();
            } else if (titleScreenNumber == 99) {
                drawOptions();
            }
        } else if (gamePanel.gameState == gamePanel.playState) {
            if(gamePanel.keyHandler.debug) {
                debug();
            }
        }
    }

    public void drawTitleScreen() {
        BufferedImage image = null;
        image = mainMenuImage;
        g2.drawImage(image, 0, 0, gamePanel.screenWidth, gamePanel.screenHeight, null);
    }
    public void drawLevelSelection() {
        BufferedImage image = null;
        BufferedImage image2 = null;
        image = levelSelectionImage;
        g2.drawImage(image, 0, 0, gamePanel.screenWidth, gamePanel.screenHeight, null);
        image2 = levelLockedImage;
        if(!gamePanel.level.l2u) {
            g2.drawImage(image2, 230, 244, 171, 273, null);
        }
        if(!gamePanel.level.l3u) {
            g2.drawImage(image2, 426, 244, 171, 273, null);
        }
        if(!gamePanel.level.l4u) {
            g2.drawImage(image2, 625, 244, 171, 273, null);
        }
        if(!gamePanel.level.l5u) {
            g2.drawImage(image2, 823, 244, 173, 273, null);
        }
    }
    public int getXforCenteredText(String text) {
        int lenght = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
        int x = gamePanel.screenWidth/2 - lenght/2;

        return x;
    }
    public void drawRectangle(int x, int y, int width, int height) {
        g2.setStroke(new BasicStroke(10));
        g2.setColor(Color.lightGray);
        g2.fillRoundRect(x, y, width, height, 10, 10);
        g2.setColor(new Color(0, 0, 0, 100));
        g2.drawRoundRect(x, y, width, height, 10, 10);
    }
    public void debug() {
        g2.setColor(Color.BLACK);
        g2.setFont(g2.getFont().deriveFont(50f));
        g2.drawString("Debug", 50, 100);
    }
    public void loadImages() {
        try {
            mainMenuImage = ImageIO.read(getClass().getResourceAsStream("/main_menu/emerald_escape_menu.png"));
            levelSelectionImage = ImageIO.read(getClass().getResourceAsStream("/main_menu/level_selection.png"));
            levelLockedImage = ImageIO.read(getClass().getResourceAsStream("/main_menu/level_lock_overlay.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void drawOptions() {
        g2.setColor(Color.green);
        g2.drawOval(100,100,300,300);
    }

}
