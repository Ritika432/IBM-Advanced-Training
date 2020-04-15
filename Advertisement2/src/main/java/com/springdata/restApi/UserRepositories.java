package com.springdata.restApi;
	
	import java.util.List;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Component;


	@Component
	public interface UserRepositories extends JpaRepository<User, Integer> {
		
		List<User> findByFirstName(String firstName);
		List<User> findByOrderByFirstNameAsc();
		List<User> findByOrderByFirstNameDesc();
		List<User> findByUserName(String userName);
		List<User> findBySessionId(String sessionId);
	}

