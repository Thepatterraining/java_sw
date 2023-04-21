package org.example;

/**
 * @author LoiydZhou
 * @date 2023/4/19
 */
public class Food {

    private String name;

    private Integer price;

    public Food(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
