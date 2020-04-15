package com.springdata.restApi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AdvertiseRepositories extends JpaRepository<AdvertiseEntity, Integer> {
	List<AdvertiseEntity> findByName(String name);
	List<AdvertiseEntity> findByStatus(String status);
	List<AdvertiseEntity> findById(int id);
	List<AdvertiseEntity> findByPostId(String postId);
	List<AdvertiseEntity> findByOrderByNameAsc();
	List<AdvertiseEntity> findByOrderByNameDesc();
}

