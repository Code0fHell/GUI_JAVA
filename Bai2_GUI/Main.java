package Bai2_GUI;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame("Draw");
        f.setSize(800, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
    }
}