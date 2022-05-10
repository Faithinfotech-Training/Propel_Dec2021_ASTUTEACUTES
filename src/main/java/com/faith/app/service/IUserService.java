package com.faith.app.service;

import com.faith.app.entity.User;

public interface IUserService {
	
	//Custom Method using JPQL-in User Repository
	public User findUserByNameAndPassword(String userName, String password);

}
