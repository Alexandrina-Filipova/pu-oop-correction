package game;
import java.awt.*;

    /**
     * Квадрати в играта
     */
    public class Tile {

        private int row;
        private int col;
        private int tileSize;

        public Tile(int row, int col) {

            this.row = row;
            this.col = col;
            this.tileSize = 50;
        }



    /**
     * @param g Графика
     */
    public void render(Graphics g) {

        int tileX = this.col * this.tileSize;
        int tileY = this.row * this.tileSize;

        g.setColor(Color.WHITE);
        g.drawRect(row,col,10,10);
        g.fillRect(tileX,tileY,this.tileSize-1, this.tileSize-1);
    }
}