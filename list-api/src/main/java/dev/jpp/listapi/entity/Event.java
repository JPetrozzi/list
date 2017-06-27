package dev.jpp.listapi.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="lst_event")
public class Event {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="date", nullable=false)
	private Date date;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="user_id", nullable=false)
	private User creator;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="event")
	private List<GuestList> lists;
	
	public Event() {
		super();
	}

	public Event(int id, String name, String description, Date date, User creator, List<GuestList> lists) {
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
	
	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public List<GuestList> getLists() {
		return lists;
	}

	public void setLists(List<GuestList> lists) {
		this.lists = lists;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date + "]";
	}
}
