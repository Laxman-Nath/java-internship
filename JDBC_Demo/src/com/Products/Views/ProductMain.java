package com.Products.Views;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import com.Products.Models.Product;
import com.Products.ServiceImpl.ProductServiceImpl;

public class ProductMain {
	static ProductServiceImpl productService = new ProductServiceImpl();

	public static void main(String[] args) {
//      addProduct();
//		deleteProduct();
//		updateProduct();
//      getAllProduct();
		getProductById();
	}

	public static void addProduct() {
      Product p=new Product();
      p.setName("toothpaste");
      p.setCompany("patanjali");
      Date d1=Date.valueOf(LocalDate.now());
      Date d2=Date.valueOf(LocalDate.now().plusYears(10));
      p.setManufacturedDate(d1);
      p.setExpiryDate(d2);
      productService.addProduct(p);
	}
	public static void deleteProduct() {
		productService.deleteProduct(10);
	}
	
	public static void updateProduct() {
		productService.updateProduct(11);
	}
	
	public static void getAllProduct() {
		List<Product> products=productService.getAllProduct();
		Iterator<Product> iterator=products.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public static void getProductById() {
	  System.out.println(productService.getProductById(11));
	}
}
