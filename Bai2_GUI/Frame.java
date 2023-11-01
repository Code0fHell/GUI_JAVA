package Bai2_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
    private JPanel tools;
    private JButton OK;
    private JComboBox<String> color;
    private JComboBox<String> type;
    private JComboBox<String> zoom;
    private JComboBox<String> geometry;
    private String selectedType;
    private Color selectedColor;
    private int scale = 1;

    public Frame(String title) throws HeadlessException {
        super(title);
        tools = new JPanel();
        color = new JComboBox<>();
        type = new JComboBox<>();
        zoom = new JComboBox<>();
        geometry = new JComboBox<>();
        OK = new JButton("OK");
        selectedColor = Color.red;
        selectedType = "Fill";

        setLayout(new BorderLayout());

        type.addItem("Fill");
        type.addItem("Not Fill");

        color.addItem("Red");
        color.addItem("Green");
        color.addItem("Blue");
        color.addItem("Yellow");

        zoom.addItem("1x");
        zoom.addItem("2x");
        zoom.addItem("3x");
        zoom.addItem("4x");

        geometry.addItem("Rectangle");
        geometry.addItem("Square");
        geometry.addItem("Circle");
        geometry.addItem("Polygon");

        tools.setLayout(new FlowLayout());
        tools.add(OK);
        tools.add(geometry);
        tools.add(type);
        tools.add(color);
        tools.add(zoom);
        add(tools, BorderLayout.SOUTH);

        OK.addActionListener(this); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == OK) {
            switch (color.getSelectedItem().toString()) {
                case "Red":
                    selectedColor = new Color(255, 0, 0);
                    break;
                case "Yellow":
                    selectedColor = new Color(255,255,0);
                    break;
                case "Green":
                    selectedColor = new Color(0,142,0);
                    break;
                case "Blue":
                    selectedColor = new Color(0,192,192);
                    break;
            }
            selectedType = type.getSelectedItem().toString();
            scale = zoom.getSelectedItem().toString().charAt(0) - '0';
            switch (geometry.getSelectedItem().toString()) {
                case "Rectangle":
                    add(new Rectangle(scale, selectedType, selectedColor));
                    break;
                case "Square":
                    add(new Square(scale, selectedType, selectedColor));
                    break;
                case "Circle":
                    add(new Circle(scale, selectedType, selectedColor));
                    break;
                case "Polygon":
                    add(new Polygons(scale, selectedType, selectedColor));
                    break;
            }
            setVisible(true);
        }
    }
}
