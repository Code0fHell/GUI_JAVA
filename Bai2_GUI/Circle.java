package Bai2_GUI;

import java.awt.*;

public class Circle extends Geometry {
    private final int WIDTH = 150 * scale;
    private final int HEIGHT = 150 * scale;

    public Circle(int scale, String type, Color color) {
        super(scale, type, color);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        if (type.equals("Fill")) {
            g.fillOval(getWidth() / 2 - WIDTH / 2, getHeight() / 2 - HEIGHT / 2, WIDTH, HEIGHT);
        }
        else {
            g.drawOval(getWidth() / 2 - WIDTH / 2, getHeight() / 2 - HEIGHT / 2, WIDTH, HEIGHT);
        }
    }
}
