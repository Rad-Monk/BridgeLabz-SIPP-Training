package com.introduction.smartwarehousemanagementsystem;

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    @Override
    public String getCategory() {
        return "Groceries";
    }
}