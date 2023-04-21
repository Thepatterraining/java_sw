package org.example;

/**
 * @author LoiydZhou
 * @date 2023/4/19
 */
public class Customer {
    private String name;

    private String mobile;

    public Customer(String name,String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }
}
