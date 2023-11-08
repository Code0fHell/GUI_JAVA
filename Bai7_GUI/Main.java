package Bai7_GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private JFrame frame;
    private DefaultTableModel tableModel;
    private JTable table;
    private ArrayList<String> data = new ArrayList<>();

    public Main() {
        frame = new JFrame("Bài tập viết class");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Tạo bảng
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Dữ liệu");
        table = new JTable(tableModel);

        // Tạo nút đọc và sắp xếp
        JPanel buttonPanel = new JPanel();
        JButton readButton = new JButton("Đọc từ file");
        JButton sortButton = new JButton("Sắp xếp");

        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                readDataFromFile();
            }
        });

        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sortData();
            }
        });

        buttonPanel.add(readButton);
        buttonPanel.add(sortButton);

        // Đặt bảng vào giao diện
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }

    private void readDataFromFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                data.clear();
                String line;
                while ((line = reader.readLine()) != null) {
                    data.add(line);
                }
                updateTable();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(frame, "Lỗi khi đọc tệp.");
            }
        }
    }

    private void sortData() {
        Collections.sort(data);
        updateTable();
    }

    private void updateTable() {
        tableModel.setRowCount(0);
        for (String entry : data) {
            tableModel.addRow(new Object[]{entry});
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}

