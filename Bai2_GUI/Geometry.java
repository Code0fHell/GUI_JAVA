package Bai2_GUI;

import javax.swing.*;
import java.awt.*;

public abstract class Geometry extends JPanel {
    protected int scale = 1;
    protected String type;
    protected Color color;

    public Geometry(int scale, String type, Color color) {
        this.scale = scale;
        this.type = type;
        this.color = color;
    }
}
