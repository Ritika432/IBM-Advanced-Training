package com.springdata.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepositories userRepository;
	@Override
	public List<UserJson> getAllUsers() {
		List<com.springdata.restApi.User> userEntityList = userRepository.findAll();
		return UserUtil.convertUserEntityListToUserList(userEntityList);
	}
	@Override
	public UserJson getCurrentUserDetails(String id) {
		com.springdata.restApi.User userEntity = userRepository.findBySessionId(id).get(0);
		return UserUtil.convertUserEntityToUser(userEntity);	}

	@Override
	public List<UserJson> getUsersByFirstName(String firstName) {
		List<com.springdata.restApi.User> userEntityList = userRepository.findByFirstName(firstName);
		return UserUtil.convertUserEntityListToUserList(userEntityList);
	}

	@Override
	public UserJson save(UserJson user) {
		// TODO Auto-generated method stub
		com.springdata.restApi.User userEntity = userRepository.save(UserUtil.convertUserToUserEntity(user));
		return UserUtil.convertUserEntityToUser(userEntity);
	}

	@Override
	public UserJson update(UserJson user) {
		com.springdata.restApi.User userEntity = userRepository.findById((int) user.getId()).get();
		if(userEntity != null) {
			userEntity.setFirstName(user.getFirstName());
			userEntity.setUserName(user.getUserName());
			userEntity.setPassword(user.getPassword());
			userEntity.setLastName(user.getLastName());
			userEntity.setEmail(user.getEmail());
			userEntity.setPhone(user.getPhone());
			userEntity = userRepository.save(userEntity);
			return UserUtil.convertUserEntityToUser(userEntity);
		}
		return null;
	}

	@Override
	public boolean delete(String id) {
		if(userRepository.existsById(Integer.valueOf(id))) userRepository.deleteById(Integer.valueOf(id));
			return true;
			
	}

	@Override
	public List<UserJson> getUsersByOrderByFirstNameAsc() {
		List<com.springdata.restApi.User> userEntityList = userRepository.findByOrderByFirstNameAsc();
		return UserUtil.convertUserEntityListToUserList(userEntityList);
	}

	@Override
	public List<UserJson> getUsersByOrderByFirstNameDesc() {
		List<com.springdata.restApi.User> userEntityList = userRepository.findByOrderByFirstNameDesc();
		return UserUtil.convertUserEntityListToUserList(userEntityList);
	}

	

	@Override
	public String autoLogin(UserJson user) {
		com.springdata.restApi.User usernew=userRepository.findByUserName(user.getUserName()).get(0);
		if(usernew!=null) {
			if(usernew.getPassword().equals((user.getPassword()))) {
				String sessionId = new java.rmi.server.UID().toString().substring(0, 10);
				usernew.setSessionId(sessionId);
				userRepository.save(usernew);
				return sessionId;
			}
			else 
				return "invalid password";	
				}
			else
				return "invalid username";
			
	}

	@Override
	public UserJson autoLogout(String Key) {
		com.springdata.restApi.User usernew=userRepository.findBySessionId(Key).get(0);
		usernew.setSessionId(null);
		com.springdata.restApi.User userEntity=userRepository.save(usernew);	
		return UserUtil.convertUserEntityToUser(userEntity);
	}



	

}
