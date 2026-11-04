package main;

import java.io.*;

public class Config {
    GamePanel gamePanel;
    public Config(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
        createConfig();
    }
    public void saveConfig() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("config.txt"));

            // Locked levels
            bw.write(String.valueOf((gamePanel.level.l2u) ? 1 : 0));
            bw.newLine();
            bw.write(String.valueOf((gamePanel.level.l3u) ? 1 : 0));
            bw.newLine();
            bw.write(String.valueOf((gamePanel.level.l4u) ? 1 : 0));
            bw.newLine();
            bw.write(String.valueOf((gamePanel.level.l5u) ? 1 : 0));
            bw.newLine();
            //

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadConfig() {
        try {

            BufferedReader br = new BufferedReader(new FileReader("config.txt"));

            String s = br.readLine();
            gamePanel.level.l2u = !s.equals("0");

            s = br.readLine();
            gamePanel.level.l3u = !s.equals("0");

            s = br.readLine();
            gamePanel.level.l4u = !s.equals("0");

            s = br.readLine();
            gamePanel.level.l5u = !s.equals("0");

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void createConfig() {
        String fileName = "config";

        try {
            File file = new File(fileName + ".txt");
            if (!file.exists()) {
                BufferedWriter bw = new BufferedWriter(new FileWriter("config.txt"));
                for(int i = 0; i < 4; i++) {
                    bw.write("0");
                    bw.newLine();
                }
                bw.close();
            }
        }
        catch (Exception ex1) {
            System.out.print("Failed to create a file.");
        }

    }
}
