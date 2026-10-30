
import java.awt.Color;
import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;

public class Aquarium {

    public static void main(String[] args) {
        CanvasAPI canvas =
            Graphics.createCanvas(800, 600, "My Aquarium");

        PainterAPI painter = canvas.getPainter();

        painter.setSpeed(10);
        painter.forward(100);
        painter.turnRight(90);
    }

    /** Draws a circle using a position, size, and color. */
    public static void drawCircle(int x, int y,
                                  int size, Color color) {
    }

    /** Draws a rectangle using a position, size, and color. */
    public static void drawRectangle(int x, int y,
                                     int width, int height,
                                     Color color) {
    }

    /** Draws a fish of a chosen size and color. */
    public static void drawFish(int x, int y,
                                int size, Color color) {
        // Calls drawCircle
        // Calls drawRectangle
    }

    /** Draws a starfish of a chosen size and color. */
    public static void drawStarfish(int x, int y,
                                    int size, Color color) {
        // Calls drawRectangle
    }

    /** Draws underwater seaweed. */
    public static void drawSeaweed(int x, int y, int height) {
        // Calls drawRectangle
    }

    /** Draws rocks, bubbles, and plants. */
    public static void drawDecorations() {
        // Calls drawCircle
        // Calls drawSeaweed
    }

    /** Draws the complete aquarium scene. */
    public static void drawAquarium() {
        // Calls drawFish
        // Calls drawStarfish
        // Calls drawDecorations
    }
}
