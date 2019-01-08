package com.home.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.hom.pojo.OrderProduct;
import com.hom.pojo.ProductDetail;



public class TwoLists {
	
	public void removeProductItems(){
		
		final List<OrderProduct> originalProducts = new ArrayList<OrderProduct>();
		{
			originalProducts.add(new OrderProduct("1","Item1",10));
			originalProducts.add(new OrderProduct("2","Item2",20));
			originalProducts.add(new OrderProduct("3","Item3",30));
		}
		
		final List<OrderProduct> newProducts = new ArrayList<OrderProduct>();{
			newProducts.add(new OrderProduct("1","Item1",10));
//			newProducts.add(new OrderProduct("2","Item2",20));
			newProducts.add(new OrderProduct("3","Item3",3));
		}		
		
		//final List<OrderProduct> removedList = originalProducts.stream().filter(p->!p.getItem().contains(newProducts.contains(p.getItem()))).collect(Collectors.toList());
			
		final Set<String> newProductSet = newProducts.stream().map(p->p.getItem()).collect(Collectors.toSet());
		
//		List<OrderProduct> removed = originalProducts.stream()
//									 .filter(p->{
//										 		
//									 			if(!newProductSet.contains(p.getItem())){
//									 				
//									 				return true;
//									 			}
//									 			
//									 			else if(newProductSet.contains(p.getItem()) && p.getQuantity() != newProducts.stream().filter(n->n.getItem().equals(p.getItem())).findFirst().get().getQuantity()){
//									 				return true;
//									 			}													
//									 			return false;
//									 })											 
//									 .collect(Collectors.toList());
		
		List<OrderProduct> removed = originalProducts.stream()
				 .filter(p->!newProductSet.contains(p.getItem()) || (newProductSet.contains(p.getItem()) && p.getQuantity() != newProducts.stream().filter(n->n.getItem().equals(p.getItem())).findFirst().get().getQuantity())
				 				
				 			)											 
				 .collect(Collectors.toList());
		
		List<ProductDetail> prodDetail = new ArrayList<ProductDetail>();
		removed.forEach(p->prodDetail.add(new ProductDetail(p.getItem(), p.getItemDescription(), "")));
		
//		List<OrderProduct> unavailable = originalProducts.stream()
//                .filter(p -> (newProducts.stream()
//                        .filter(np -> !np.getItem().contains(p.getItem()))
//                        .count())<1
//                		).collect(Collectors.toList());
//		
		
		
		removed.forEach(u->System.out.println("Items::"+u.getItem()));
	}

}
