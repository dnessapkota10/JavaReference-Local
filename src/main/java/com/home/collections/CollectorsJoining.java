package com.home.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.home.pojo.OrderProduct;
import com.home.pojo.OrderProductXML;
import com.home.pojo.ProductDetail;

public class CollectorsJoining {
	
	private List<ProductDetail> prodList;
	public CollectorsJoining(){
		prodList = new ArrayList<ProductDetail>();
		
		prodList.add(new ProductDetail("1", "Test1", ""));
		prodList.add(new ProductDetail("2", "Test2", ""));
		prodList.add(new ProductDetail("3", "Test3", ""));
		prodList.add(new ProductDetail("4", "Test4", ""));
	}

	public void afterCollection(){
		final String itemStr = prodList.stream()
                .map(ProductDetail::getItemDescription)
                .collect(Collectors.joining("^"));
		System.out.println(itemStr);
	}
	
	
	public void afterCollectionProducts(){
		List<OrderProduct> ordPrdList = new ArrayList<OrderProduct>();
		ordPrdList.add(new OrderProductXML("1", "Test1", 1));
		ordPrdList.add(new OrderProductXML("2", "Test2", 1));
		ordPrdList.add(new OrderProductXML("3", "Test3", 1));
		ordPrdList.add(new OrderProductXML("4", "Test4", 1));
		
		final String itemStr = ordPrdList.stream()
                .map(OrderProduct::getItemDescription)
                .collect(Collectors.joining("^"));
		System.out.println(itemStr);
	}
}
