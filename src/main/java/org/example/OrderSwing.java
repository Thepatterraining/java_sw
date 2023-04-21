package org.example;

import com.sun.org.apache.xpath.internal.operations.Or;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class OrderSwing {
    /**{
     * 创建并显示GUI。出于线程安全的考虑，
     * 这个方法在事件调用线程中调用。
     */
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("点餐");
        frame.setMinimumSize(new Dimension(500,400));

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel userName = new JLabel("用户名");
        userName.setBounds(50,20,50,30);
        panel.add(userName);

        JTextField userNameInput = new JTextField();
        userNameInput.setBounds(110,20,150,30);
        panel.add(userNameInput);

        JLabel userMobile = new JLabel("手机号");
        userMobile.setBounds(50,60,50,30);
        panel.add(userMobile);

        JTextField userMobileInput = new JTextField();
        userMobileInput.setBounds(110,60,150,30);
        panel.add(userMobileInput);

        JButton regBtn = new JButton("注册用户");
        regBtn.setBounds(110,100,100,30);

        List<Customer> customers = new ArrayList<>();

        regBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer customer = new Customer(userNameInput.getText(),userMobileInput.getText());
                customers.add(customer);
//                JLabel customerLabel = new JLabel();
//                customerLabel.setBounds(50,150,300,30);
//                customerLabel.setText("用户名:"+customer.getName()+"手机号:"+customer.getMobile());
//                panel.add(customerLabel);
//                frame.repaint();
//                for (Customer user:customers) {
                System.out.println("用户名:"+customer.getName()+"手机号:"+customer.getMobile());
//                }
            }
        });
        panel.add(regBtn);

        JLabel foodNameLabel = new JLabel("菜单名称");
        foodNameLabel.setBounds(280,20,70,30);
        panel.add(foodNameLabel);

        JTextField foodNameInput = new JTextField();
        foodNameInput.setBounds(350,20,150,30);
        panel.add(foodNameInput);

        JLabel foodPriceLabel = new JLabel("菜单价格");
        foodPriceLabel.setBounds(280,60,70,30);
        panel.add(foodPriceLabel);

        JTextField foodPriceInput = new JTextField();
        foodPriceInput.setBounds(350,60,150,30);
        panel.add(foodPriceInput);

        JButton foodBtn = new JButton("注册菜单");
        foodBtn.setBounds(350,100,100,30);

        List<Food> foods = new ArrayList<>();
        foodBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Food food = new Food(foodNameInput.getText(),Integer.parseInt(foodPriceInput.getText()));
                foods.add(food);
                System.out.println("菜单名称:"+food.getName()+"价格:"+food.getPrice());
            }
        });
        panel.add(foodBtn);

        JButton button = new JButton("点菜");
        button.setBounds(200,200,100,30);
        Order order = new Order();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer customer = customers.get(0);
                for (Food food : foods) {
                    order.buyFood(customer, food);
                }

            }
        });
        panel.add(button);

        JButton sumBtn = new JButton("计算金额");
        sumBtn.setBounds(320,200,100,30);
        sumBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer customer = customers.get(0);
                Integer sum = order.sum(customer);
                System.out.println("总金额:"+sum);
            }
        });
        panel.add(sumBtn);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // 显示应用 GUI
        createAndShowGUI();

    }
}