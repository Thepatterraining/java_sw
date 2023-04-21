package org.example;

import java.util.*;

/**
 * @author LoiydZhou
 * @date 2023/4/19
 */
public class Order {
    private Map<Customer, List<Food>> orders;

    public Order() {
        this.orders = new HashMap<>();
    }

    public void buyFood(Customer customer, Food food) {
        try {
            List<Food> order = orders.get(customer);
            if (Objects.isNull(order)) {
                List<Food> foods = new ArrayList<>();
                foods.add(food);
                orders.put(customer, foods);
            } else {
                order.add(food);
                orders.put(customer, order);
            }
        } catch (Exception e) {
            System.out.println("点餐失败:"+e.getMessage());
        }
    }

    public Integer sum(Customer customer) {
        try {
            List<Food> order = orders.get(customer);
            Integer sum = 0;
            if (!Objects.isNull(order)) {
                for (Food food : order) {
                    sum += food.getPrice();
                }
            }
            return sum;
        } catch (Exception e) {
            System.out.println("计算用户总金额失败，用户名称:"+customer.getName()+"用户手机号："+customer.getMobile());
            return 0;
        }
    }


}
