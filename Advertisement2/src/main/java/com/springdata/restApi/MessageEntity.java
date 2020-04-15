package com.springdata.restApi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "messages")
public class MessageEntity {
	
	@Id
	@Column(name = "message_id")
	private long id;
	
	@Column(name = "message_content")
	private String message;
	
	@ManyToOne
	private UserEntity userSendingMessage;
	
	@ManyToOne
	private AdvertiseEntity forAdvertisement;
	
	public MessageEntity() {
		super();
		
	}
	public MessageEntity(long id, String message, UserEntity userSendingMessage, AdvertiseEntity forAdvertisement) {
		super();
		this.id = id;
		this.message = message;
		this.userSendingMessage = userSendingMessage;
		this.forAdvertisement = forAdvertisement;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UserEntity getUserSendingMessage() {
		return userSendingMessage;
	}
	public void setUserSendingMessage(UserEntity userSendingMessage) {
		this.userSendingMessage = userSendingMessage;
	}
	public AdvertiseEntity getForAdvertisement() {
		return forAdvertisement;
	}
	public void setForAdvertisement(AdvertiseEntity forAdvertisement) {
		this.forAdvertisement = forAdvertisement;
	}
	
	
	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		
		else if (object == null)
			return false;
		
	MessageEntity object2 = (MessageEntity) object;
	if (this.id != object2.getId())
			return false;
		else
		return true;
	}
	@Override
	public String toString() {
		return "Message :-id=" + id + ", message=" + message + ", userSendingMessage=" + userSendingMessage.getUserName()+ ", forAdvertisement=" + forAdvertisement.getName() + "";
	}
	
}
