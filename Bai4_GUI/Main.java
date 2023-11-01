package Bai4_GUI;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator("Calculator");
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.createUI();
        c.setSize(400, 450);
        c.setResizable(false);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }
}
