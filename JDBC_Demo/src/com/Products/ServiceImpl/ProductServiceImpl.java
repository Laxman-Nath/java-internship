package com.Products.ServiceImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Products.Models.Product;
import com.Products.Repositry.ProductRepositry;
import com.Products.Service.ProductService;

public class ProductServiceImpl implements ProductService {
	static Connection conn = ProductRepositry.getConnection();
	boolean status;

	@Override
	public void addProduct(Product product) {
		int affectedRows=0;
		String sql="insert into product(name,company,manufacturedDate,expiryDate) "
		  		+ "values('"+product.getName()+"','"+product.getCompany()+"','"+product.getManufacturedDate()+
		  		"','"+product.getExpiryDate()+"')";
		try {
	
	      Statement stm=conn.createStatement();
	       affectedRows=stm.executeUpdate(sql);

		}
		catch(SQLException e) {
			System.out.println(e);
		}
		if(affectedRows>0) {
		System.out.println("Product was added successfully!");
		}
		else {
			System.out.println("Error inserting record!");
		}
		
	}
	
//	public void addProduct(Product product) {
//		String sql = "INSERT INTO product(name, company, manufacturedDate, expiryDate) VALUES (?, ?, ?, ?)";
//		try (PreparedStatement stm = conn.prepareStatement(sql)) {
//			stm.setString(1, product.getName());
//			stm.setString(2, product.getCompany());
//			stm.setDate(3, Date.valueOf(product.getManufacturedDate()));
//			stm.setDate(4, Date.valueOf(product.getExpiryDate()));
//
//			int rowsInserted = stm.executeUpdate();
//
//			if (rowsInserted > 0) {
//				System.out.println("Product was added successfully!");
//			} else {
//				System.out.println("Error inserting record!");
//			}
//		} catch (SQLException e) {
//			System.out.println("Database error: " + e.getMessage());
//		}
//	}

	@Override
	public void deleteProduct(int id) {
		int affectedRows=0;
		String sql="Delete from product where id="+id;
		try {
			Statement stm=conn.createStatement();
			affectedRows=stm.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Database error: " + e.getMessage());
		}
		if (affectedRows > 0) {
			System.out.println("Product was deleted successfully!");
		} else {
			System.out.println("Error deleting record!");
		}
		

	}

	@Override
	public void updateProduct(int id) {
		int affectedRows=0;
		String sql="Update product set company= 'lux' where id="+id;
		try {
			Statement stm=conn.createStatement();
			affectedRows=stm.executeUpdate(sql);
		}catch (SQLException e) {
			System.out.println("Database error: " + e.getMessage());
		}
		if (affectedRows > 0) {
			System.out.println("Product was updated successfully!");
		} else {
			System.out.println("Error updating record!");
		}

	}

	@Override
	public List<Product> getAllProduct() {
		String sql="Select * from product";
		List<Product> products=new ArrayList<>();
		try {
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next()) {
			Product product = new Product();
            product.setId(rs.getInt("id")); // Assuming there's an ID column
            product.setName(rs.getString("name"));
            product.setCompany(rs.getString("company"));
            product.setManufacturedDate(rs.getDate("manufacturedDate"));
            product.setExpiryDate(rs.getDate("expiryDate"));
            products.add(product);
			}
			
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
      return products;
	}

	@Override
	public Product getProductById(int id) {
		String sql="Select * from product where id="+id;
		Product product=new Product();
		try {
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
			 product.setId(rs.getInt("id")); // Assuming there's an ID column
	            product.setName(rs.getString("name"));
	            product.setCompany(rs.getString("company"));
	            product.setManufacturedDate(rs.getDate("manufacturedDate"));
	            product.setExpiryDate(rs.getDate("expiryDate"));
			}
	           
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
    return product;
	}

}
