package com.springdata.restApi;


	public class UserJson {
		
		private String userName,firstName,lastName,password,email,sessionId;
		private int phone,id;
		
	
		public UserJson(int id, String userName, String firstName, String lastName, String password, String email,int phone) {
			super();
			this.id = id;
			this.userName = userName;
			this.firstName = firstName;
			this.lastName = lastName;
			this.password = password;
			this.email = email;
			this.phone = phone;
			this.sessionId="";
		}

		
		
		public int getId() {
			return id;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getPhone() {
			return phone;
		}

		public void setPhone(int phone) {
			this.phone = phone;
		}

		public String getSessionId() {
			return sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "User:-id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName+ ", email=" + email + ", phone=" + phone + "";
		}

		@Override
		public boolean equals(Object object) {
			if (this == object)
				return true;
			
			else if (object == null)
				return false;
			
		UserJson object2 = (UserJson) object;
		if (this.id != object2.getId())
				return false;
			else
			return true;
		}

		
	}



