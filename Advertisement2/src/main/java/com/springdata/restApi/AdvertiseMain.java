package com.springdata.restApi;

public class AdvertiseMain implements Comparable<AdvertiseMain> {
	private String name,category,description,postId,status,title;
	private long id;
	

	public AdvertiseMain() {
		super();
		// TODO Auto-generated constructor stub
		this.postId="";
		this.status="closed";
	}
	
	

	
	public AdvertiseMain(long id,String name,String title, String category, String description,String postId, String status) {
		super();
		this.id=id;
		this.name = name;
		this.category = category;
		this.description = description;
		this.postId = postId;
		this.status = status;
		this.title = title;
	}
	


	public AdvertiseMain(long id,String name,String title, String category, String description) {
		super();
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
		this.id=id;
		this.postId="";
		this.status="closed";
	}
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	



	
	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		
		else if (object == null)
			return false;
		
	AdvertiseMain object2 = (AdvertiseMain) object;
	if (this.id != object2.getId())
			return false;
		else
		return true;
	}

	@Override
	public int compareTo(AdvertiseMain adv) {
		
		if(this.getId()>adv.getId())
		{
			return 1;
		}
		else if(this.getId()==adv.getId())
		{
			return 0;
		}
		else
		{
			return 2;
		}
	}




	@Override
	public String toString()
	{
		return "Advertisement :-postId=" + postId + ", status=" + status + ", title=" + title + ", name=" + name+ ", category=" + category + ", description=" + description + ", id=" + id + "";
	}





	

}
