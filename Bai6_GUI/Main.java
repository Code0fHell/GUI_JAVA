package Bai6_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Danh sách bài tập Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setLayout(new GridLayout(10, 1));

        JPanel exercise1Panel = new JPanel();
        JLabel label1 = new JLabel("Bài tập 1: Nhân đôi số");
        JTextField input1 = new JTextField(10);
        JButton button1 = new JButton("Tính");
        JLabel result1 = new JLabel("Kết quả: ");
        exercise1Panel.add(label1);
        exercise1Panel.add(input1);
        exercise1Panel.add(button1);
        exercise1Panel.add(result1);
        frame.add(exercise1Panel);

        JPanel exercise2Panel = new JPanel();
        JLabel label2 = new JLabel("Bài tập 2: Bình phương số");
        JTextField input2 = new JTextField(10);
        JButton button2 = new JButton("Tính");
        JLabel result2 = new JLabel("Kết quả: ");
        exercise2Panel.add(label2);
        exercise2Panel.add(input2);
        exercise2Panel.add(button2);
        exercise2Panel.add(result2);
        frame.add(exercise2Panel);

        JPanel exercise3Panel = new JPanel();
        JLabel label3 = new JLabel("Bài tập 3: Tính tổng từ 1 đến n");
        JTextField input3 = new JTextField(10);
        JButton button3 = new JButton("Tính");
        JLabel result3 = new JLabel("Kết quả: ");
        exercise3Panel.add(label3);
        exercise3Panel.add(input3);
        exercise3Panel.add(button3);
        exercise3Panel.add(result3);
        frame.add(exercise3Panel);

        JPanel exercise4Panel = new JPanel();
        JLabel label4 = new JLabel("Bài tập 4: Chuyển chuỗi thành chuỗi in hoa");
        JTextField input4 = new JTextField(20);
        JButton button4 = new JButton("Chuyển");
        JLabel result4 = new JLabel("Kết quả: ");
        exercise4Panel.add(label4);
        exercise4Panel.add(input4);
        exercise4Panel.add(button4);
        exercise4Panel.add(result4);
        frame.add(exercise4Panel);

        JPanel exercise5Panel = new JPanel();
        JLabel label5 = new JLabel("Bài tập 5: Chuyển chuỗi thành chuỗi in thường");
        JTextField input5 = new JTextField(20);
        JButton button5 = new JButton("Chuyển");
        JLabel result5 = new JLabel("Kết quả: ");
        exercise5Panel.add(label5);
        exercise5Panel.add(input5);
        exercise5Panel.add(button5);
        exercise5Panel.add(result5);
        frame.add(exercise5Panel);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(input1.getText());
                    result1.setText("Kết quả: " + (value * 2));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Nhập sai định dạng số!");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int value = Integer.parseInt(input2.getText());
                    result2.setText("Kết quả: " + (value * value));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Nhập sai định dạng số!");
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Long n = Long.parseLong(input3.getText());
                    Long sum = (n * (n + 1)) / 2;
                    result3.setText("Kết quả: " + sum);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Nhập sai định dạng số!");
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = input4.getText();
                result4.setText("Kết quả: " + input.toUpperCase());
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = input5.getText();
                result5.setText("Kết quả: " + input.toLowerCase());
            }
        });

        frame.setVisible(true);
    }
}
