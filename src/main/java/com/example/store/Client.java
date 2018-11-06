package com.example.store;

public class Client extends Person {

    private int age;
    private boolean vipStatus;

    public Client(String name, String phone, int age, boolean vipStatus) {
        super(name, phone);
        setAge(age);
        setVipStatus(vipStatus);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVipStatus() {
        return vipStatus;
    }

    public void setVipStatus(boolean vipStatus) {
        this.vipStatus = vipStatus;
    }

    @Override
    public int getDiscount() {
        int discount = 0;
        if (age > 50) {
            discount = 15;
        } else if (age < 25) {
            discount = 20;
        }

        if (vipStatus) {
            discount = discount + 10;
        }

        return discount;
    }
}
