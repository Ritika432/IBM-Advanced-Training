package com.springdata.restApi;

public class MessageAdvertise 
{
	private AdvertiseMain Advertise;
	private int id;
	private String message;
	private User userMessage;

	public MessageAdvertise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MessageAdvertise(int id, String message, User userMessage, AdvertiseMain Advertise) {
		super();
		this.id = id;
		this.message = message;
		this.userMessage = userMessage;
		this.Advertise =Advertise;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public User getuserMessage() {
		return userMessage;
	}
	public void setuserMessage(User userMessage) {
		this.userMessage = userMessage;
	}
	public AdvertiseMain getAdvertise() {
		return Advertise;
	}
	public void setForAdvertisement(AdvertiseMain Advertise) {
		this.Advertise = Advertise;
	}
	
	
	
	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		
		else if (object == null)
			return false;
		
	MessageAdvertise object2 = (MessageAdvertise) object;
	if (this.id != object2.getId())
			return false;
		else
		return true;
	}
	@Override
	public String toString() 
	{
		return "Message Advertisement :-id=" + id + ", message=" + message + ", userMessage=" + userMessage.getUserName()+ ", Advertise=" +Advertise.getName() + "";
	}
	
	
}
