package com.example.store;

public interface Discountable {


    default int getDiscount() {
        return 25;
    }

//    boolean isRefundable();
}
