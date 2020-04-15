package com.springdata.restApi;

import java.util.List;



public interface UserService {
public List<UserJson> getAllUsers();
	
	public UserJson getCurrentUserDetails(String id);
	
	public List<UserJson> getUsersByFirstName(String firstName);
	
	public UserJson save(UserJson user);
	
	public UserJson update(UserJson user);
	
	public boolean delete(String id);
	
	public List<UserJson> getUsersByOrderByFirstNameAsc();
	
	public List<UserJson> getUsersByOrderByFirstNameDesc();
	public String autoLogin(UserJson user);
	public UserJson autoLogout(String Key);
}
