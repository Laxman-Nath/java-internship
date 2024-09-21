package com.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.database.Db;
import com.models.User;
import com.service.UserService;

public class UserServiceImpl implements UserService {
	private Connection conn = Db.getConn();

	@Override
	public void register(User user) {
		String sql = "Insert into user(name,address,password,email) values(?,?,?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getName());
            ps.setString(2, user.getAddress());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getAddress());
			if (ps.executeUpdate() > 0) {
				System.out.println("inserted!");
			} else {
				System.out.println("Error inserting");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean login(String name, String password) {
		String sql = "Select * from user where name='" + name + "' and password='" + password + "'";
		try {
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	public List<User> getAllUser() {
		String sql="Select * from user";
		List<User> users=new ArrayList<>();
		try {
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				User u=new User();
				u.setName(rs.getString("name"));
				u.setId(rs.getInt("id"));
				u.setEmail(rs.getString("email"));
				u.setAddress(rs.getString("address"));
				u.setPassword(rs.getString("password"));
				users.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;
	}

}
