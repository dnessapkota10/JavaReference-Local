package com.hom.pojo;

import java.util.Date;

public class ProductDetail {
    
    private final String itemNumber;
    private final String itemDescription;
    private final String lastShipDate;

    public ProductDetail(String itemNumber, String itemDescription, String lastShipDate) {
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
        this.lastShipDate = lastShipDate;
    }

	public String getItemNumber() {
		return itemNumber;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public String getLastShipDate() {
		return lastShipDate;
	}

    
}
