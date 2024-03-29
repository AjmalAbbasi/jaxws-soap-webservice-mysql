package com.tutorialspedia.jaxwsservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import com.tutorialspedia.dao.UserDAO;

@WebService
public class UserWSImpl implements UserWS {
	UserDAO userdao;

	@Override
	@WebMethod
	@WebResult(name="ResponseMessage")
	public String addUser(@WebParam(name="User") UserType addRequest) {
	
		return new UserDAO().addUser(addRequest);
		
	}

	@Override
	@WebMethod
	@WebResult(name="ResponseMessage")
	public String deleteUser(@WebParam(name="UserID") int userID) {
		
		return new UserDAO().deleteUser(userID);
	}

	@Override
	@WebMethod
	@WebResult(name="ResponseMessage")
	public String updateUser(UserType updateUserRequest) {
	
		return new UserDAO().updateUser(updateUserRequest);
	}

	@Override
	@WebMethod
	@WebResult(name="User")
	public UserType getUser(@WebParam(name="UserName") String userName) {
	
		return new UserDAO().getUser(userName);
	}

	@Override
	@WebMethod
	@WebResult(name="Users")
	public UsersType getAllUsers() {
		return new UserDAO().getAllUsers();
	}

}
