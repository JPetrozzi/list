package dev.jpp.listapi.model;

import java.util.Date;
import java.util.List;

public class EventModel {
	private int id;
	private String name;
	private String description;
	private Date date;
	private UserModel creator;
	private List<GuestListModel> lists;
	
	public EventModel() {
		super();
	}

	public EventModel(int id, String name, String description, Date date, UserModel creator, List<GuestListModel> lists) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = date;
		this.creator = creator;
		this.lists = lists;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public UserModel getCreator() {
		return creator;
	}

	public void setCreator(UserModel creator) {
		this.creator = creator;
	}

	public List<GuestListModel> getLists() {
		return lists;
	}

	public void setLists(List<GuestListModel> lists) {
		this.lists = lists;
	}

	@Override
	public String toString() {
		return "EventModel [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date
				+ ", lists=" + lists + "]";
	}
}
