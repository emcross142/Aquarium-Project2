import java.awt.Color;
import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;

public class Aquarium {

    /**
     * Creates the aquarium canvas and starts the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        CanvasAPI canvas =
            Graphics.createCanvas(800, 600, "My Aquarium");

        PainterAPI painter = canvas.getPainter();

        painter.setSpeed(10);
        painter.forward(100);
        painter.turnRight(90);

        drawAquarium();
    }

    /**
     * Draws a circle using a position, size, and color.
     *
     * @param x the horizontal position of the circle
     * @param y the vertical position of the circle
     * @param size the diameter of the circle
     * @param color the color of the circle
     */
    public static void drawCircle(int x, int y,
                                  int size, Color color) {
    }

    /**
     * Draws a rectangle using a position, size, and color.
     *
     * @param x the horizontal position of the rectangle
     * @param y the vertical position of the rectangle
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     * @param color the color of the rectangle
     */
    public static void drawRectangle(int x, int y,
                                     int width, int height,
                                     Color color) {
    }

    /**
     * Draws a fish at a chosen position, size, and color.
     *
     * @param x the horizontal position of the fish
     * @param y the vertical position of the fish
     * @param size the size of the fish
     * @param color the color of the fish
     */
    public static void drawFish(int x, int y,
                                int size, Color color) {
        // Calls drawCircle
        // Calls drawRectangle
    }

    /**
     * Draws a starfish at a chosen position, size, and color.
     *
     * @param x the horizontal position of the starfish
     * @param y the vertical position of the starfish
     * @param size the size of the starfish
     * @param color the color of the starfish
     */
    public static void drawStarfish(int x, int y,
                                    int size, Color color) {
        // Calls drawRectangle
    }

    /**
     * Draws underwater seaweed at a chosen position and height.
     *
     * @param x the horizontal position of the seaweed
     * @param y the vertical position of the seaweed
     * @param height the height of the seaweed
     */
    public static void drawSeaweed(int x, int y, int height) {
        // Calls drawRectangle
    }

    /**
     * Draws rocks, bubbles, and plants in the aquarium.
     */
    public static void drawDecorations() {
        // Calls drawCircle
        // Calls drawSeaweed
    }

    /**
     * Uses two loops to draw fish and starfish,
     * then adds the aquarium decorations.
     */
    public static void drawAquarium() {

        // Loop 1: draws two fish at different positions.
        for (int i = 0; i < 2; i++) {
            drawFish(150 + i * 250, 200, 80, Color.ORANGE);
        }

        // Loop 2: draws two starfish at different positions.
        for (int i = 0; i < 2; i++) {
            drawStarfish(200 + i * 300, 450, 50, Color.PINK);
        }
//loop inside method for starfish
        // Adds rocks, bubbles, and plants.
        drawDecorations();
    }
}