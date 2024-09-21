package com.Products.Service;

import java.util.List;

import com.Products.Models.Product;

public interface ProductService {
void addProduct(Product product);
void deleteProduct(int id);
void updateProduct(int id);
List<Product> getAllProduct();
Product getProductById(int id);
}
