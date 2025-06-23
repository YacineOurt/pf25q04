package TTTGUI;

import java.awt.*;
import javax.swing.*;
import java.io.File;
/**
 * The TTT.Cell class models each individual cell of the game board.
 */
public class Cell {
    // Define named constants for drawing
    public static final int SIZE = 120; // cell width/height (square)
    // Symbols (cross/nought) are displayed inside a cell, with padding from border
    public static final int PADDING = SIZE / 5;
    public static final int SEED_SIZE = SIZE - PADDING * 2;
    public static final int SEED_STROKE_WIDTH = 8; // pen's stroke width

    // Define properties (package-visible)
    /** Content of this cell (TTT.Seed.EMPTY, TTT.Seed.CROSS, or TTT.Seed.NOUGHT) */
    Seed content;
    /** Row and column of this cell */
    int row, col;

    // Ajout des icônes statiques pour éviter de les recharger à chaque paint
    private static final ImageIcon CROSS_ICON = new ImageIcon("TTTGUI/images/cross.png");
    private static final ImageIcon CIRCLE_ICON = new ImageIcon("TTTGUI/images/circle.png");

    /** Constructor to initialize this cell with the specified row and col */
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        content = Seed.NO_SEED;
    }

    /** Reset this cell's content to EMPTY, ready for new game */
    public void newGame() {
        content = Seed.NO_SEED;
    }

    /** Paint itself on the graphics canvas, given the Graphics context */
    public void paint(Graphics g) {
        int x1 = col * SIZE + PADDING;
        int y1 = row * SIZE + PADDING;
        if (content == Seed.CROSS) {
            // Affiche l'image de la croix
            g.drawImage(CROSS_ICON.getImage(), x1, y1, SEED_SIZE, SEED_SIZE, null);
        } else if (content == Seed.NOUGHT) {
            // Affiche l'image du cercle
            g.drawImage(CIRCLE_ICON.getImage(), x1, y1, SEED_SIZE, SEED_SIZE, null);
        }
    }
}
