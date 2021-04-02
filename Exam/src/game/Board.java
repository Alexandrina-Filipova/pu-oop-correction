package game;

import javax.swing.*;
import java.awt.*;

/**
 * Дъска за бойното поле
 * (Размери,Фон)
 */
public class Board extends JFrame {

    public Board() {

        this.setSize(620, 620);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.BLACK);
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 12; col++) {

                Tile tile = new Tile(row, col);
                tile.render(g);

            }
        }
    }
}
