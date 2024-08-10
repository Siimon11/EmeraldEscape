package main;

import java.awt.*;

public class UI {
    GamePanel gamePanel;
    Graphics2D g2;
    public int commandNumber;
    public int titleScreenNumber;
    Font font;
    public UI(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }
    public void draw(Graphics2D g2) {
        this.g2 = g2;
        font = new Font("Arial", Font.PLAIN, 60);

        if (gamePanel.gameState == gamePanel.titleState) {
            if (titleScreenNumber == 0) {
                drawTitleScreen();
            } else if (titleScreenNumber == 1) {
                drawLevelSelection();
            }
        } else if (gamePanel.gameState == gamePanel.playState) {

        }
        if (gamePanel.keyHandler.debug) {
            debug();
        }
    }

    public void drawTitleScreen() {
        g2.setColor(new Color(111111));
        g2.fillRect(0, 0, gamePanel.screenWidth, gamePanel.screenHeight);
        g2.setFont(new Font("Arial", Font.PLAIN, 110));
        String text = "Platformer";

        g2.setColor(Color.black);
        g2.drawString(text, getXforCenteredText(text) + 2, 300 + 2);
        g2.drawString(text, getXforCenteredText(text) + 4, 300 + 4);
        g2.drawString(text, getXforCenteredText(text) + 5, 300 + 5);
        g2.drawString(text, getXforCenteredText(text), 300);

        g2.setFont(g2.getFont().deriveFont(70f));
        drawRectangle(300, 380, 400, 150);
        g2.setColor(Color.black);
        text = "Play";
        int x = getXforCenteredText(text);
        g2.drawString(text, x, 450);
        g2.setFont(g2.getFont().deriveFont(50f));
        if (commandNumber == 0) {
            g2.drawString(">", 320, 450);
        }
        g2.setFont(g2.getFont().deriveFont(70f));
        text = "Options";
        g2.drawString(text, getXforCenteredText(text), 500);
        g2.setFont(g2.getFont().deriveFont(50f));
        if (commandNumber == 1) {
            g2.drawString(">", 320, 500);
        }

    }
    public void drawLevelSelection() {
        g2.setColor(Color.gray);
        g2.fillRect(0, 0, gamePanel.screenWidth, gamePanel.screenHeight);
        g2.setColor(Color.white);
        g2.fillRoundRect(70, 30, 260, 600, 30, 30);
        g2.fillRoundRect(370, 30, 260, 600, 30, 30);
        g2.fillRoundRect(670, 30, 260, 600, 30, 30);
        g2.setStroke(new BasicStroke(3));
        g2.setColor(Color.black);
        g2.drawRoundRect(70, 30, 260, 600, 30, 30);
        g2.drawRoundRect(370, 30, 260, 600, 30, 30);
        g2.drawRoundRect(670, 30, 260, 600, 30, 30);

        String text = "Level";
        g2.setFont(font);
        g2.drawString(text + " 1", 100, 100);
        g2.drawString(text + " 2", 400, 100);
        g2.drawString(text + " 3", 700, 100);
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

}
