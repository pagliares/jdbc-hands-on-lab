package xyz.pagliares.jdbc.bookstore.domain;

public class Publisher {	
	private Integer publisherID;
	private String name;

	public Publisher() {}	
	public Publisher(String name) {
		this.name = name;
	}

	public Integer getPublisherID() {
		return publisherID;
	}
	public void setPublisherID(Integer publisherID) {
		this.publisherID = publisherID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + "\n";
	}	
}














