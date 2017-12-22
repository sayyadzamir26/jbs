package com.tworks.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JOptionPane;

import com.tworks.domain.User;
import com.tworks.domain.User;
import com.tworks.utility.DBUtility;

public class UserService {
	private static final AtomicInteger counter = new AtomicInteger();

	private Connection connection;

	public UserService() {
		connection = DBUtility.getConnection();
	}

	public int getUserCount() {
		int count = 0;
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement
					.executeQuery("select max(userid) as count from tblUser");
			while (rs.next()) {
				count = rs.getInt(1);
			}
			count++;
			System.out.println("-------------------------" + count);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	/*
	 * public void addUser(User user) { try {
	 * 
	 * PreparedStatement preparedStatement = connection .prepareStatement(
	 * "insert into tblUser(userid,firstname,lastname,email) values (?,?, ?, ? )"
	 * ); // Parameters start with 1 preparedStatement.setInt(1,
	 * user.getUserid()); preparedStatement.setString(2, user.getFirstName());
	 * preparedStatement.setString(3, user.getLastName());
	 * preparedStatement.setString(4, user.getEmail());
	 * preparedStatement.executeUpdate();
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); } }
	 */

	public void deleteUser(int userId) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("delete from tblUser where userid=?");
			// Parameters start with 1
			preparedStatement.setInt(1, userId);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * public void updateUser(User user) throws ParseException { try {
	 * PreparedStatement preparedStatement = connection
	 * .prepareStatement("update tblUser set lastname=?,email=?" +
	 * "where userid=?"); // Parameters start with 1
	 * preparedStatement.setString(1, user.getLastName());
	 * preparedStatement.setString(2, user.getEmail());
	 * preparedStatement.setInt(3, user.getUserid());
	 * preparedStatement.executeUpdate();
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); } }
	 */

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from user");
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUserName(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setGender(rs.getString("gender"));
				user.setDelete_flag(rs.getString("delete_flag"));

				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return users;
	}

	/*
	 * public User getUserById(int userId) { User user = new User(); try {
	 * PreparedStatement preparedStatement = connection.
	 * prepareStatement("select * from JobNotification where userid=?");
	 * preparedStatement.setInt(1, userId); ResultSet rs =
	 * preparedStatement.executeQuery();
	 * 
	 * if (rs.next()) { user.setId(rs.getInt("userid"));
	 * user.setTitle(rs.getString("")); user.setDescription(rs.getString(""));
	 * 
	 * } } catch (SQLException e) { e.printStackTrace(); } return user; }
	 */

	public boolean exists(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean validate(User user) {
		try {
			// int maxId=getUserCount();
			// user.setUserid(maxId);
			// String query =
			// " insert into user ( username, email,password,gender,delete_flag)"
			// + " values ( ?, ?,?,?,?)";
			String query = "SELECT username, password FROM user where username=? and password=?";

			PreparedStatement preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, user.getUserName());
			preparedStmt.setString(2, user.getPassword());

			ResultSet rs = preparedStmt.executeQuery();
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	public void insertNotificy(User user) {
		try {
			// int maxId=getUserCount();
			// user.setUserid(maxId);
			String query = " insert into user ( username, email,password,gender,delete_flag)"
					+ " values ( ?, ?,?,?,?)";

			PreparedStatement preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, user.getUserName());
			preparedStmt.setString(2, user.getEmail());
			preparedStmt.setString(3, user.getPassword());
			preparedStmt.setString(4, user.getGender());
			preparedStmt.setString(5, user.getDelete_flag());

			preparedStmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// execute the preparedstatement

	}

}
