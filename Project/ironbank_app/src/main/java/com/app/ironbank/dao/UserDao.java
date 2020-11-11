package com.app.ironbank.dao;


import java.util.List;

import com.app.ironbank.model.User;
import com.app.ironbank.model.Account;


public interface UserDao {

	public User getUser(String username);
	
	boolean insertUser(User user, Balance balance)


}
