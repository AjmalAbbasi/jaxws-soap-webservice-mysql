package com.tutorialspedia.dao;

import java.sql.*;
import com.tutorialspedia.jaxwsservice.UserType;
import com.tutorialspedia.jaxwsservice.UsersType;

public class UserDAO {
	
	   static final String DB_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/users";
	   static final String DB_USERNAME = "root";
	   static final String DB_PASSWORD = "root";

	   Connection connection;
	   Statement statement;
	   public UserDAO()
	   {
		   initialize();
	   }
	   
	   
	   /*
	    This initialize method will initialize database connection to MySQL database
	    */
	   public void initialize() 
	   {
		   try
		   {
			   System.out.println("Initializing DB Connection");
		   Class.forName(DB_DRIVER);
		   connection=DriverManager.getConnection(DB_URL,DB_USERNAME, DB_PASSWORD);
		   System.out.println("Connected");
		   }
		   catch (Exception e) {e.printStackTrace();}
	   }
	   
	   /*
	    This method adds a user object in the database
	    */
	   public String addUser(UserType u) 
	   { String ResponseMessage="";
		   try {
		  
		   statement=connection.createStatement();
		   String addSQL="INSERT INTO TBL_USERS VALUES ("
		   +u.getUserID() +",'"+
		   u.getUserName() +"','"+
		   u.getUserCategory()+"',"+
		   u.isUserActiveStatus()+","+
		   u.getUserLevel()+")";
		System.out.println(addSQL);
		 int count=  statement.executeUpdate(addSQL);
		 ResponseMessage= (count==1)? "User Added Successfully": "Error Inserting Database";
		 return ResponseMessage;
		  
	   }
		   catch (Exception e) {
			  e.printStackTrace();
			    ResponseMessage="Error Inserting Database";
			   return ResponseMessage;
		   }
		   finally
		   {
			   if (connection !=null) 
				   try {
				   connection.close();
				   } 
			   catch (Exception e) {}
		   }
	   }
	   
	   /*
	    This method returns a user object based on the userName. In real scenarios, we can have multiple users with same name and for such cases, userId should be used instead but here for the sake of simplicity, we will use userName as argument.
	    */
	   public UserType getUser(String userName)
	   {UserType u=null;
		   try
		   {
			   String getuser_sql="SELECT USER_ID, USER_NAME, USER_CATEGORY, USER_LEVEL, USER_ACTIVE_STATUS FROM TBL_USERS WHERE USER_NAME='"+userName+"'";
			   System.out.println(getuser_sql);
			   statement=connection.createStatement();
			ResultSet resultset= statement.executeQuery(getuser_sql);
			
			while (resultset.next())
			{    u=new UserType();
				u.setUserID(resultset.getInt(1));
				u.setUserName(resultset.getString(2));
				u.setUserCategory(resultset.getString(3));
				u.setUserLevel(resultset.getDouble(4));
				u.setUserActiveStatus(resultset.getBoolean(5));
				 break; //As we want to get only one record
			}
			return u; 
			
		   }
		   catch (Exception e)
		   {
			   e.printStackTrace();
			   return u;
		   }
		   finally
		   {
			   if (connection !=null) 
				   try {
				   connection.close();
				   } 
			   catch (Exception e) {}
		   }
		   
		  
	   }
	   
	   /*
	    This method is used to update any existing user 
	    */
	   
	   public String updateUser(UserType u) 
	   { String ResponseMessage="";
		   try {
		  
		   statement=connection.createStatement();
		   String update_sql="UPDATE TBL_USERS SET USER_NAME='"+u.getUserName()+"', USER_CATEGORY='"+u.getUserCategory()+"', USER_LEVEL="+u.getUserLevel()+", USER_ACTIVE_STATUS="+u.isUserActiveStatus()+" WHERE USER_ID="+u.getUserID();
		   
		System.out.println(update_sql);
		 int count=  statement.executeUpdate(update_sql);
		 ResponseMessage= (count==1)? "User Updated Successfully": "Error Updating User";
		 System.out.println("Returning response message: "+ResponseMessage);
		 return ResponseMessage;
		  
	   }
		   catch (Exception e) {
			  e.printStackTrace();
			    ResponseMessage="Error Updating User";
			   return ResponseMessage;
		   }
		   finally
		   {
			   if (connection !=null) 
				   try {
				   connection.close();
				   } 
			   catch (Exception e) {}
		   }
	   }
	   
	   /*
	    This method will delete a user from database based on the provided user id
	    */
	   public String deleteUser(int uid) 
	   { String ResponseMessage="";
		   try {
		  
		   statement=connection.createStatement();
		   String delete_sql="DELETE FROM TBL_USERS WHERE USER_ID="+uid;
		   
		System.out.println(delete_sql);
		 int count=statement.executeUpdate(delete_sql);
		 ResponseMessage= (count==1)? "User deleted Successfully": "Error deleting User";
		 System.out.println("Returning response message: "+ResponseMessage);
		 return ResponseMessage;
		  
	   }
		   catch (Exception e) {
			  e.printStackTrace();
			    ResponseMessage="Error deleting User";
			   return ResponseMessage;
		   }
		   finally
		   {
			   if (connection !=null) 
				   try {
				   connection.close();
				   } 
			   catch (Exception e) {}
		   }
	   }
	   
	   /*
	    This method returns all users available in the database table
	    */
	   public UsersType getAllUsers() 
	   { UsersType users=new UsersType();
	   try
	   {
		   String getalluser_sql="SELECT USER_ID, USER_NAME, USER_CATEGORY, USER_LEVEL, USER_ACTIVE_STATUS FROM TBL_USERS";
		   System.out.println(getalluser_sql);
		   statement=connection.createStatement();
		ResultSet resultset= statement.executeQuery(getalluser_sql);
		
		while (resultset.next())
		{    UserType u=new UserType();
			u.setUserID(resultset.getInt(1));
			u.setUserName(resultset.getString(2));
			u.setUserCategory(resultset.getString(3));
			u.setUserLevel(resultset.getDouble(4));
			u.setUserActiveStatus(resultset.getBoolean(5));
			users.getUser().add(u);
		}
		return users; 
		
	   }
		   catch (Exception e) {
			  e.printStackTrace();
			    
			   return users;
		   }
		   finally
		   {
			   if (connection !=null) 
				   try {
				   connection.close();
				   } 
			   catch (Exception e) {}
		   }
	   } 
}
