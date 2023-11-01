package Bai3_GUI;

import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame();
        f.setTitle("Clock");
        f.setLayout(new BorderLayout());
        f.add(new StillClock(), BorderLayout.CENTER);
        f.add(new DigitalClock(), BorderLayout.SOUTH);
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}