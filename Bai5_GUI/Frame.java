package Bai5_GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Frame extends JFrame implements ActionListener {
    private JPanel panel;
    private JPanel tools;
    private JButton chooseFile;
    private JButton changeSize;
    private JTextField width, height;
    private JLabel w, h;

    public Frame(String title) throws HeadlessException {
        super(title);
        panel = new JPanel();
        tools = new JPanel();
        chooseFile = new JButton("File...");
        width = new JTextField("1200");
        height = new JTextField("800");
        w = new JLabel("Width:");
        h = new JLabel("Height:");
        width.setColumns(5);
        height.setColumns(5);
        changeSize = new JButton("Change Size");

        setLayout(new BorderLayout());
        panel.setLayout(new FlowLayout());
        tools.setLayout(new FlowLayout());
        add(panel, BorderLayout.CENTER);
        add(tools, BorderLayout.SOUTH);
        tools.setLayout(new FlowLayout());
        tools.add(chooseFile);
        tools.add(w);
        tools.add(width);
        tools.add(h);
        tools.add(height);
        tools.add(changeSize);

        chooseFile.addActionListener(this);
        changeSize.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseFile) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);
            try {
                BufferedImage pic = ImageIO.read(new File(fileChooser.getSelectedFile().getAbsolutePath()));
                panel.add(new Picture(pic));
                setVisible(true);
            }
            catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        else if (e.getSource() == changeSize) {
            setSize(Integer.parseInt(width.getText()), Integer.parseInt(height.getText()));
            setLocationRelativeTo(null);
            setVisible(true);
        }
    }
}
