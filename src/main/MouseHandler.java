package main;

import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener {
    GamePanel gamePanel;
    public boolean mouseInLvl1, mouseInLvl2, mouseInLvl3;
    public MouseHandler(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int clickX = e.getX();
        int clickY = e.getY();
        //System.out.println(clickX + " " + clickY);
        if (gamePanel.gameState == gamePanel.titleState) {
            if (gamePanel.ui.titleScreenNumber == 0) {
                if (clickX > 400 && clickX < 623 && clickY > 210 && clickY < 258) {
                    gamePanel.ui.titleScreenNumber = 1;
                } else if (clickX > 400 && clickX < 623 && clickY > 270 && clickY < 318) {
                    gamePanel.ui.titleScreenNumber = 99; 
                }
            } else if (gamePanel.ui.titleScreenNumber == 1) {
                if (clickX > 27 && clickX < 206 && clickY > 245 && clickY < 517) {
                    gamePanel.ui.titleScreenNumber = 2;
                } else if (clickX > 228 && clickX < 401 && clickY > 245 && clickY < 517) {
                    gamePanel.ui.titleScreenNumber = 3;
                } else if (clickX > 425 && clickX < 598 && clickY > 245 && clickY < 517) {
                    gamePanel.ui.titleScreenNumber = 4;
                } else if (clickX > 622 && clickX < 797 && clickY > 245 && clickY < 517) {
                    gamePanel.ui.titleScreenNumber = 5;
                } else if (clickX > 819 && clickX < 996 && clickY > 245 && clickY < 517) {
                    gamePanel.ui.titleScreenNumber = 6;
                } else if (clickX > 20 && clickX < 177 && clickY > 563 && clickY < 615) {
                    gamePanel.ui.titleScreenNumber = 0;
                }
                // väli 143
            } else if (gamePanel.ui.titleScreenNumber == 2) { // Jungle
                if (clickX > 13 && clickX < 235 && clickY > 543 && clickY < 627) {
                    gamePanel.ui.titleScreenNumber = 1;
                } else if (clickX > 168 && clickX < 288 && clickY > 178 && clickY < 286) {
                    //gamePanel.level.changeRoom(1,1);
                    System.out.println("1");
                } else if (clickX > 311 && clickX < 431 && clickY > 178 && clickY < 286) {
                    //gamePanel.level.changeRoom(1,2);
                    System.out.println("2");
                } else if (clickX > 454 && clickX < 574 && clickY > 178 && clickY < 286) {
                    //gamePanel.level.changeRoom(1,3);
                    System.out.println("3");
                } else if (clickX > 595 && clickX < 717 && clickY > 178 && clickY < 286) {
                    //gamePanel.level.changeRoom(1,4);
                    System.out.println("4");
                } else if (clickX > 738 && clickX < 860 && clickY > 178 && clickY < 286) {
                    //gamePanel.level.changeRoom(1,5);
                    System.out.println("5");
                } else if (clickX > 168 && clickX < 288 && clickY > 302 && clickY < 410) {
                    //gamePanel.level.changeRoom(1,6);
                    System.out.println("6");
                } else if (clickX > 311 && clickX < 431 && clickY > 302 && clickY < 410) {
                    //gamePanel.level.changeRoom(1,7);
                    System.out.println("7");
                } else if (clickX > 454 && clickX < 574 && clickY > 302 && clickY < 410) {
                    //gamePanel.level.changeRoom(1,8);
                    System.out.println("8");
                } else if (clickX > 595 && clickX < 717 && clickY > 302 && clickY < 410) {
                    //gamePanel.level.changeRoom(1,9);
                    System.out.println("9");
                } else if (clickX > 738 && clickX < 860 && clickY > 302 && clickY < 410) {
                    //gamePanel.level.changeRoom(1,10);
                    System.out.println("10");
                } else if (clickX > 168 && clickX < 288 && clickY > 426 && clickY < 534) {
                    //gamePanel.level.changeRoom(1,11);
                    System.out.println("11");
                } else if (clickX > 311 && clickX < 431 && clickY > 426 && clickY < 534) {
                    //gamePanel.level.changeRoom(1,12);
                    System.out.println("12");
                } else if (clickX > 454 && clickX < 574 && clickY > 426 && clickY < 534) {
                    //gamePanel.level.changeRoom(1,13);
                    System.out.println("13");
                } else if (clickX > 595 && clickX < 717 && clickY > 426 && clickY < 534) {
                    //gamePanel.level.changeRoom(1,14);
                    System.out.println("14");
                } else if (clickX > 738 && clickX < 860 && clickY > 426 && clickY < 534) {
                    //gamePanel.level.changeRoom(1,15);
                    System.out.println("15");
                }
            } else if (gamePanel.ui.titleScreenNumber == 3) { // Ancient Temple
                if (clickX > 13 && clickX < 235 && clickY > 543 && clickY < 627) {
                    gamePanel.ui.titleScreenNumber = 1;
                } else if (clickX > 177 && clickX < 297 && clickY > 190 && clickY < 297) {
                    //gamePanel.level.changeRoom(2,1);
                    System.out.println("1");
                } else if (clickX > 317 && clickX < 437 && clickY > 190 && clickY < 297) {
                    //gamePanel.level.changeRoom(2,2);
                    System.out.println("2");
                } else if (clickX > 454 && clickX < 574 && clickY > 190 && clickY < 297) {
                    //gamePanel.level.changeRoom(2,3);
                    System.out.println("3");
                } else if (clickX > 593 && clickX < 714 && clickY > 190 && clickY < 297) {
                    //gamePanel.level.changeRoom(2,4);
                    System.out.println("4");
                } else if (clickX > 733 && clickX < 854 && clickY > 190 && clickY < 297) {
                    //gamePanel.level.changeRoom(2,5);
                    System.out.println("5");
                } else if (clickX > 177 && clickX < 297 && clickY > 315 && clickY < 412) {
                    //gamePanel.level.changeRoom(2,6);
                    System.out.println("6");
                } else if (clickX > 317 && clickX < 437 && clickY > 315 && clickY < 412) {
                    //gamePanel.level.changeRoom(2,7);
                    System.out.println("7");
                } else if (clickX > 454 && clickX < 574 && clickY > 315 && clickY < 412) {
                    //gamePanel.level.changeRoom(2,8);
                    System.out.println("8");
                } else if (clickX > 593 && clickX < 714 && clickY > 315 && clickY < 412) {
                    //gamePanel.level.changeRoom(2,9);
                    System.out.println("9");
                } else if (clickX > 733 && clickX < 854 && clickY > 315 && clickY < 412) {
                    //gamePanel.level.changeRoom(2,10);
                    System.out.println("10");
                } else if (clickX > 177 && clickX < 297 && clickY > 434 && clickY < 541) {
                    //gamePanel.level.changeRoom(2,11);
                    System.out.println("11");
                } else if (clickX > 317 && clickX < 437 && clickY > 434 && clickY < 541) {
                    //gamePanel.level.changeRoom(2,12);
                    System.out.println("12");
                } else if (clickX > 454 && clickX < 574 && clickY > 434 && clickY < 541) {
                    //gamePanel.level.changeRoom(2,13);
                    System.out.println("13");
                } else if (clickX > 593 && clickX < 714 && clickY > 434 && clickY < 541) {
                    //gamePanel.level.changeRoom(2,14);
                    System.out.println("14");
                } else if (clickX > 733 && clickX < 854 && clickY > 434 && clickY < 541) {
                    //gamePanel.level.changeRoom(2,15);
                    System.out.println("15");
                }
            } else if (gamePanel.ui.titleScreenNumber == 4) { // Lava Caverns
                if (clickX > 17 && clickX < 226 && clickY > 548 && clickY < 621) {
                    gamePanel.ui.titleScreenNumber = 1;
                } else if (clickX > 188 && clickX < 305 && clickY > 197 && clickY < 300) {
                    //gamePanel.level.changeRoom(3,1);
                    System.out.println("1");
                } else if (clickX > 322 && clickX < 439 && clickY > 197 && clickY < 300) {
                    //gamePanel.level.changeRoom(3,2);
                    System.out.println("2");
                } else if (clickX > 454 && clickX < 573 && clickY > 197 && clickY < 300) {
                    //gamePanel.level.changeRoom(3,3);
                    System.out.println("3");
                } else if (clickX > 588 && clickX < 705 && clickY > 197 && clickY < 300) {
                    //gamePanel.level.changeRoom(3,4);
                    System.out.println("4");
                } else if (clickX > 721 && clickX < 838 && clickY > 197 && clickY < 300) {
                    //gamePanel.level.changeRoom(3,5);
                    System.out.println("5");
                } else if (clickX > 188 && clickX < 305 && clickY > 312 && clickY < 415) {
                    //gamePanel.level.changeRoom(3,6);
                    System.out.println("6");
                } else if (clickX > 322 && clickX < 439 && clickY > 312 && clickY < 415) {
                    //gamePanel.level.changeRoom(3,7);
                    System.out.println("7");
                } else if (clickX > 454 && clickX < 573 && clickY > 312 && clickY < 415) {
                    //gamePanel.level.changeRoom(3,8);
                    System.out.println("8");
                } else if (clickX > 588 && clickX < 705 && clickY > 312 && clickY < 415) {
                    //gamePanel.level.changeRoom(3,9);
                    System.out.println("9");
                } else if (clickX > 721 && clickX < 838 && clickY > 312 && clickY < 415) {
                    //gamePanel.level.changeRoom(3,10);
                    System.out.println("10");
                } else if (clickX > 188 && clickX < 305 && clickY > 428 && clickY < 531) {
                    //gamePanel.level.changeRoom(3,11);
                    System.out.println("11");
                } else if (clickX > 322 && clickX < 439 && clickY > 428 && clickY < 531) {
                    //gamePanel.level.changeRoom(3,12);
                    System.out.println("12");
                } else if (clickX > 454 && clickX < 573 && clickY > 428 && clickY < 531) {
                    //gamePanel.level.changeRoom(3,13);
                    System.out.println("13");
                } else if (clickX > 588 && clickX < 705 && clickY > 428 && clickY < 531) {
                    //gamePanel.level.changeRoom(3,14);
                    System.out.println("14");
                } else if (clickX > 721 && clickX < 838 && clickY > 428 && clickY < 531) {
                    //gamePanel.level.changeRoom(3,15);
                    System.out.println("15");
                }
            } else if (gamePanel.ui.titleScreenNumber == 5) { // Sky Islands
                if (clickX > 13 && clickX < 235 && clickY > 543 && clickY < 627) {
                    gamePanel.ui.titleScreenNumber = 1;
                } else if (clickX > 176 && clickX < 302 && clickY > 190 && clickY < 299) {
                    //gamePanel.level.changeRoom(4,1);
                    System.out.println("1");
                } else if (clickX > 315 && clickX < 439 && clickY > 190 && clickY < 298) {
                    //gamePanel.level.changeRoom(4,2);
                    System.out.println("2");
                } else if (clickX > 451 && clickX < 576 && clickY > 190 && clickY < 298) {
                    //gamePanel.level.changeRoom(4,3);
                    System.out.println("3");
                } else if (clickX > 589 && clickX < 714 && clickY > 190 && clickY < 298) {
                    //gamePanel.level.changeRoom(4,4);
                    System.out.println("4");
                } else if (clickX > 725 && clickX < 851 && clickY > 190 && clickY < 298) {
                    //gamePanel.level.changeRoom(4,5);
                    System.out.println("5");
                } else if (clickX > 176 && clickX < 302 && clickY > 314 && clickY < 423) {
                    //gamePanel.level.changeRoom(4,6);
                    System.out.println("6");
                } else if (clickX > 315 && clickX < 439 && clickY > 314 && clickY < 422) {
                    //gamePanel.level.changeRoom(4,7);
                    System.out.println("7");
                } else if (clickX > 451 && clickX < 576 && clickY > 314 && clickY < 422) {
                    //gamePanel.level.changeRoom(4,8);
                    System.out.println("8");
                } else if (clickX > 589 && clickX < 714 && clickY > 314 && clickY < 422) {
                    //gamePanel.level.changeRoom(4,9);
                    System.out.println("9");
                } else if (clickX > 725 && clickX < 851 && clickY > 314 && clickY < 422) {
                    //gamePanel.level.changeRoom(4,10);
                    System.out.println("10");
                } else if (clickX > 176 && clickX < 302 && clickY > 432 && clickY < 541) {
                    //gamePanel.level.changeRoom(4,11);
                    System.out.println("11");
                } else if (clickX > 315 && clickX < 439 && clickY > 432 && clickY < 540) {
                    //gamePanel.level.changeRoom(4,12);
                    System.out.println("12");
                } else if (clickX > 451 && clickX < 576 && clickY > 432 && clickY < 540) {
                    //gamePanel.level.changeRoom(4,13);
                    System.out.println("13");
                } else if (clickX > 589 && clickX < 714 && clickY > 432 && clickY < 540) {
                    //gamePanel.level.changeRoom(4,14);
                    System.out.println("14");
                } else if (clickX > 725 && clickX < 851 && clickY > 432 && clickY < 540) {
                    //gamePanel.level.changeRoom(4,15);
                    System.out.println("15");
                }
            } else if (gamePanel.ui.titleScreenNumber == 6) { // Elven Castle
                if (clickX > 16 && clickX < 232 && clickY > 543 && clickY < 627) {
                    gamePanel.ui.titleScreenNumber = 1;
                } else if (clickX > 176 && clickX < 303 && clickY > 193 && clickY < 302) {
                    //gamePanel.level.changeRoom(5,1);
                    System.out.println("1");
                } else if (clickX > 315 && clickX < 439 && clickY > 193 && clickY < 301) {
                    //gamePanel.level.changeRoom(5,2);
                    System.out.println("2");
                } else if (clickX > 451 && clickX < 576 && clickY > 193 && clickY < 301) {
                    //gamePanel.level.changeRoom(5,3);
                    System.out.println("3");
                } else if (clickX > 589 && clickX < 714 && clickY > 193 && clickY < 301) {
                    //gamePanel.level.changeRoom(5,4);
                    System.out.println("4");
                } else if (clickX > 725 && clickX < 851 && clickY > 193 && clickY < 301) {
                    //gamePanel.level.changeRoom(5,5);
                    System.out.println("5");
                } else if (clickX > 176 && clickX < 302 && clickY > 313 && clickY < 422) {
                    //gamePanel.level.changeRoom(5,6);
                    System.out.println("6");
                } else if (clickX > 315 && clickX < 439 && clickY > 313 && clickY < 421) {
                    //gamePanel.level.changeRoom(5,7);
                    System.out.println("7");
                } else if (clickX > 451 && clickX < 576 && clickY > 313 && clickY < 421) {
                    //gamePanel.level.changeRoom(5,8);
                    System.out.println("8");
                } else if (clickX > 589 && clickX < 714 && clickY > 313 && clickY < 421) {
                    //gamePanel.level.changeRoom(5,9);
                    System.out.println("9");
                } else if (clickX > 725 && clickX < 851 && clickY > 313 && clickY < 421) {
                    //gamePanel.level.changeRoom(5,10);
                    System.out.println("10");
                } else if (clickX > 176 && clickX < 302 && clickY > 431 && clickY < 540) {
                    //gamePanel.level.changeRoom(5,11);
                    System.out.println("11");
                } else if (clickX > 315 && clickX < 439 && clickY > 431 && clickY < 539) {
                    //gamePanel.level.changeRoom(5,12);
                    System.out.println("12");
                } else if (clickX > 451 && clickX < 576 && clickY > 431 && clickY < 539) {
                    //gamePanel.level.changeRoom(5,13);
                    System.out.println("13");
                } else if (clickX > 589 && clickX < 714 && clickY > 431 && clickY < 539) {
                    //gamePanel.level.changeRoom(5,14);
                    System.out.println("14");
                } else if (clickX > 725 && clickX < 851 && clickY > 431 && clickY < 539) {
                    //gamePanel.level.changeRoom(5,15);
                    System.out.println("15");
                }
            }
        } else if (gamePanel.gameState == gamePanel.playState) {
            if (gamePanel.keyHandler.debug) {
                gamePanel.player.worldX = clickX - 16;
                gamePanel.player.worldY = clickY - 16;
                gamePanel.player.hitBox.x = (int)gamePanel.player.worldX;
                gamePanel.player.hitBox.y = (int)gamePanel.player.worldY;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int clickX = e.getX();
        int clickY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int clickX = e.getX();
        int clickY = e.getY();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
        int clickX = e.getX();
        int clickY = e.getY();
    }
}
