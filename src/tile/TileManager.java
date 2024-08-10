package tile;

import main.GamePanel;
import main.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileManager {
    GamePanel gamePanel;
    public Tile[] tile;
    public int[][] mapTileNumber;

    public TileManager(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
        tile = new Tile[100];
        mapTileNumber = new int[gamePanel.maxWorldCol][gamePanel.maxWorldRow];
        getTileImage();
        //loadMap("/maps/worldV3.txt", 0);
        //loadMap("/maps/interior01.txt", 1);
    }

    public void getTileImage() {
        // PLACEHOLDER
        setup(0, "grass00", false);
        setup(1, "grass00", false);
        setup(2, "grass00", false);
        setup(3, "grass00", false);
        setup(4, "grass00", false);
        setup(5, "grass00", false);
        setup(6, "grass00", false);
        setup(7, "grass00", false);
        setup(8, "grass00", false);
        setup(9, "grass00", false);
        // PLACEHOLDER

        setup(10, "grass00", false);
        setup(11, "grass01", true);
        setup(12, "sky00", false);
        setup(13, "water01", true);
        setup(14, "brick00", true);
        setup(15, "box00", true);
        setup(16, "soil00", true);
        setup(17, "door00", false);
        setup(18, "plank00", false);
        setup(19, "plank_cube00", true);
        setup(20, "leaves00", true);
        setup(21, "tree00", true);
        setup(22, "tree01", true);
        setup(23, "stone00", true);
        setup(24, "stone01", true);
        setup(25, "stone02", true);
        setup(26, "stone03", false);
        setup(27, "stone04", false);
    }

    public void loadRoom(String level) {
        try {

            InputStream inputStream = getClass().getResourceAsStream(level);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            int col = 0;
            int row = 0;

            while (col < gamePanel.maxWorldCol && row < gamePanel.maxWorldRow) {
                String line = bufferedReader.readLine();
                while (col < gamePanel.maxWorldCol) {
                    String numbers[] = line.split(" ");
                    int number = Integer.parseInt(numbers[col]);



                    mapTileNumber[col][row] = number;
                    col++;
                }
                if (col == gamePanel.maxWorldCol) {
                    col = 0;
                    row++;
                }
            }
            bufferedReader.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void setup(int index, String imageName, boolean collision) {
        UtilityTool uTool = new UtilityTool();

        try {
            tile[index] = new Tile();
            tile[index].image = ImageIO.read(getClass().getResourceAsStream("/tiles/" + imageName + ".png"));
            tile[index].image = uTool.scaleImage(tile[index].image, gamePanel.tileSize, gamePanel.tileSize);
            tile[index].collision = collision;

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void draw(Graphics2D g2) {
        int worldCol = 0;
        int worldRow = 0;

        while (worldCol < gamePanel.maxWorldCol && worldRow < gamePanel.maxWorldRow) {

            int tileNumber = mapTileNumber[worldCol][worldRow];

            int worldX = worldCol * gamePanel.tileSize;
            int worldY = worldRow * gamePanel.tileSize;


            g2.drawImage(tile[tileNumber].image, worldX, worldY, gamePanel.tileSize, gamePanel.tileSize, null);



            worldCol++;

            if (worldCol == gamePanel.maxWorldCol) {
                worldCol = 0;
                worldRow++;
            }
        }
    }

}
