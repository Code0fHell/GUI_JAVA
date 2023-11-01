package Bai5_GUI;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args)
    {
        Frame f = new Frame("Photos");
        f.setSize(1200, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
