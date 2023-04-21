package org.example;

import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldSwing {
    /**{
     * 创建并显示GUI。出于线程安全的考虑，
     * 这个方法在事件调用线程中调用。
     */
    private static void createAndShowGUI() {
        // 确保一个漂亮的外观风格
//        JFrame.setDefaultLookAndFeelDecorated(true);

        // 创建及设置窗口
//        JFrame frame = new JFrame("HelloWorldSwing");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // 添加 "Hello World" 标签
//        JLabel label = new JLabel("Hello World");
//        frame.getContentPane().add(label);
//
//        // 显示窗口
//        frame.pack();
//        frame.setVisible(true);

        JFrame frame = new JFrame("demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200, 1000,500);
        frame.setMinimumSize(new Dimension(500,300));

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label1 = new JLabel("输入1");
        label1.setText("输入1");
        label1.setBounds(60,20,40,25);
        panel.add(label1);

        JTextField input1 = new JTextField();
        input1.setBounds(100,20, 200,25);
        panel.add(input1);

        JLabel label2 = new JLabel("输入2");
        label2.setBounds(60,50,40,25);
        panel.add(label2);

        JTextField input2 = new JTextField();
        input2.setBounds(100,50,200,25);
        panel.add(input2);

        JLabel label3 = new JLabel("输出");
        label3.setBounds(60,80,40,25);
        panel.add(label3);

        JTextField output = new JTextField();
        output.setBounds(100,80,200,25);
        panel.add(output);

        JButton button = new JButton();
        button.setBounds(100, 110,80,25);
        button.setText("连接");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1 = input1.getText();
                String str2 = input2.getText();
                if (str1.length() >= str2.length()) {
                    output.setText(str1 + str2);
                } else {
                    output.setText(str2 + str1);
                }
            }
        });
        panel.add(button);

        JButton closeBtn = new JButton();
        closeBtn.setBounds(100,140,80,25);
        closeBtn.setText("关闭");
        closeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(closeBtn);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // 显示应用 GUI
        createAndShowGUI();

    }
}