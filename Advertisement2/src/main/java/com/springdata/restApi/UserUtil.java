package com.springdata.restApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;



public class UserUtil {
	
	public static List<com.springdata.restApi.UserJson> convertUserEntityListToUserList(List<User> userEntityList) {
		List<com.springdata.restApi.UserJson> userList = new ArrayList<com.springdata.restApi.UserJson>();
		Consumer<User> consumer = ((User userEntity)->userList.add(convertUserEntityToUser(userEntity)));
		userEntityList.stream().forEach(consumer);
		return userList;
	}
	
	public static com.springdata.restApi.UserJson convertUserEntityToUser(User userEntity) {
		return new com.springdata.restApi.UserJson(userEntity.getId(), userEntity.getUserName(), userEntity.getFirstName(), userEntity.getLastName(),userEntity.getPassword(),userEntity.getEmail(),userEntity.getPhone());
	}

	public static User convertUserToUserEntity(com.springdata.restApi.UserJson user) {
		return new User(user.getId(), user.getUserName(), 
				user.getFirstName(), user.getLastName(),user.getPassword(),user.getEmail(),user.getPhone());
	}
}