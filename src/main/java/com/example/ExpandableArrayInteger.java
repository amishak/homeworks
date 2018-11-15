package com.example;

public class ExpandableArrayInteger {
    private int[] storage = new int[10];
    private int position = 0;

    public void add(int i) {
        if (position >= storage.length) {
            int[] new_storage = new int[storage.length * 2];
            for (int j = 0; j < storage.length; j++) {
                new_storage[j] = storage[j];
            }
            storage = new_storage;
        }
        storage[position++] = i;
    }

    public int get(int i) {
        return storage[i];
    }
}
