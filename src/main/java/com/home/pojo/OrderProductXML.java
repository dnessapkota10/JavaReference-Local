package com.home.pojo;

import java.io.Serializable;

public class OrderProductXML implements OrderProduct, Serializable{

	private String item;
    private String itemDescription;
    private int quantity;
   
    public OrderProductXML(String item, String desc, int qty){
    	this.item = item;
    	this.itemDescription = desc;
    	this.quantity = qty;
    }

    @Override
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
